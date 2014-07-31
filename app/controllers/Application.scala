package controllers

import play.api._
import play.api.mvc._
import play.api.libs.ws.WS
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import model._

object Application extends Controller {

  /**
   * Controller Action for redirecting requester to URL matching the shortUrl and the country for the remote address,
   * otherwise when shortUrl exists but country does not have a configured URL, the U.S. entry as a fallback. Should
   * the entry for the U.S. store also not exist, the default URL is used.
   *
   * The country of the requester is determined by performing a GeoIP lookup. For this, a local installation of
   * freegeoip is expected (https://github.com/fiorix/freegeoip).
   *
   * Handled errors:
   *   - freegeoip not running -> fallback URL
   *   - freegeoip not responding within 100ms -> fallback URL (critical, script loading blocks page load)
   *   - freegeoip responds with code other than 200 -> fallback URL
   *
   **/
  def redirect(shortUrl: String, format: String) = Action.async {
    req =>
      val fallbackUrl = Links.redirectMap.get(shortUrl + "." + format + ".US").getOrElse(Links.defaultRedirect)
      WS.url(Links.geoLookupAddress + req.remoteAddress).withRequestTimeout(100).get().map {
        geoRes =>
          geoRes.status match {
            case 200 =>
              val url = (geoRes.json \ "country_code").asOpt[String].flatMap {
                cc =>
                  val url = shortUrl + "." + format + "." + cc
                  ReqLogger.logCc(shortUrl, format, cc)

                  Links.redirectMap.get(url)
              }.getOrElse(fallbackUrl)
              ReqLogger.logUrl(shortUrl, format, url)
              Redirect(url)

            case status: Int =>
              ReqLogger.logGeoFail(shortUrl, format, "Status " + status, None)
              Redirect(fallbackUrl)
          }
      }.recover {
        case e: Exception =>
          ReqLogger.logGeoFail(shortUrl, format, e.getMessage, Some(e))
          Redirect(fallbackUrl)
      }
  }

}
