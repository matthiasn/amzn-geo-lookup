package model

object Links {

  /** Address where an installation of freegeoip (https://github.com/fiorix/freegeoip) is expected */
  val geoLookupAddress = "http://localhost:8080/json/"

  /** when all else fails, the requester is directed here */
  val defaultRedirect = "http://ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=US&ID=V20070822%2FUS%2Fmatthiasnehls-20%2F8003%2Fa53029a6-da52-4d9d-a86f-e8896bad3ffc&Operation=GetScriptTemplate"

  val redirectMap = Map[String, String](

    // US - United States
    "slideshow1.wide.US" -> "http://ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=US&ID=V20070822%2FUS%2Fmatthiasnehls-20%2F8003%2Fc99b01ed-8119-449a-a7f3-07cbef1c84bb&Operation=GetScriptTemplate",
    "slideshow1.narrow.US" -> "http://ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=US&ID=V20070822%2FUS%2Fmatthiasnehls-20%2F8003%2Fa53029a6-da52-4d9d-a86f-e8896bad3ffc&Operation=GetScriptTemplate",

    // DE - Germany
    "slideshow1.wide.DE" -> "http://ws-eu.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=DE&ID=V20070822%2FDE%2Fmatnehblo-21%2F8003%2Fcfc6c018-54a6-45ea-84a4-b6b04b9a09b3&Operation=GetScriptTemplate",
    "slideshow1.narrow.DE" -> "http://ws-eu.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=DE&ID=V20070822%2FDE%2Fmatnehblo-21%2F8003%2Fc9cecae1-cf99-40a7-b68a-94c343f425df&Operation=GetScriptTemplate",

    // CA-Canada
    "slideshow1.wide.CA" -> "http://ws-na.amazon-adsystem.com/widgets/q?rt=tf_ssw&ServiceVersion=20070822&MarketPlace=CA&ID=V20070822%2FCA%2Fmatthiasneh0d-20%2F8003%2F36257332-db21-41b4-944b-a95fb9c653a3&Operation=GetScriptTemplate",
    "slideshow1.narrow.CA" -> "http://ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=CA&ID=V20070822%2FCA%2Fmatthiasneh0d-20%2F8003%2F789ba762-eb1b-4a40-bbaa-718c824207de&Operation=GetScriptTemplate",

    // GB - United Kingdom
    "slideshow1.wide.GB" -> "http://ws-eu.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=GB&ID=V20070822%2FGB%2Fmatthiasneh0c-21%2F8003%2Fa5d13c01-60d7-43a1-b1d7-bc8406987908&Operation=GetScriptTemplate",
    "slideshow1.narrow.GB" -> "http://ws-eu.amazon-adsystem.com/widgets/q?rt=tf_ssw&ServiceVersion=20070822&MarketPlace=GB&ID=V20070822%2FGB%2Fmatthiasneh0c-21%2F8003%2F88f2d932-73aa-4c9b-9a74-ebf1fe675556&Operation=GetScriptTemplate",

    // FR - France
    "slideshow1.wide.FR" -> "http://ws-eu.amazon-adsystem.com/widgets/q?rt=tf_ssw&ServiceVersion=20070822&MarketPlace=FR&ID=V20070822%2FFR%2Fmatthiasneh03-21%2F8003%2F27fd1737-c771-4ebb-8c0d-b55b0b3f54f0&Operation=GetScriptTemplate",
    "slideshow1.narrow.FR" -> "http://ws-eu.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=FR&ID=V20070822%2FFR%2Fmatthiasneh03-21%2F8003%2F4c2e80ac-428f-4d04-842e-9c67eda2bcab&Operation=GetScriptTemplate"
  )

}
