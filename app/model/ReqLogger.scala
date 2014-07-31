package model

import play.api.Logger

object ReqLogger {

  /**
   * Logger for country code lookups
   **/
  def logCc(shortUrl: String, format: String, countryCode: String): Unit =
    Logger.info(shortUrl + " " + format + ": lookup with country code " + countryCode)

  /**
   * Logger for URL lookups
   **/
  def logUrl(shortUrl: String, format: String, url: String): Unit =
    Logger.info(shortUrl + " " + format + ": redirected to " + url)

  /**
   * Logger for GeoIP lookup failures, also takes exception as an option (not all GeoIP failures are actually exceptions,
   * status codes other than 200 are valid responses but also considered failures)
   *
   **/
  def logGeoFail(shortUrl: String, format: String, comment: String, exceptionOpt: Option[Exception]): Unit = {
    val logString = shortUrl + " " + format + ": Geo Lookup Failed - " + comment
    exceptionOpt match {
      case Some(e) => Logger.error(logString, e)
      case None => Logger.error(logString)
    }
  }

}
