package model

object Links {

  /** Address where an installation of freegeoip (https://github.com/fiorix/freegeoip) is expected */
  val geoLookupAddress = "http://localhost:8080/json/"

  /** when all else fails, the requester is directed here */
  val defaultRedirect = "http://ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&MarketPlace=US&ID=V20070822%2FUS%2Fmatthiasnehls-20%2F8003%2Fa53029a6-da52-4d9d-a86f-e8896bad3ffc&Operation=GetScriptTemplate"

  val redirectMap = Map[String, String](

    // Amazon landing page
    "amazon-landing.link.US" -> "http://www.amazon.com/?_encoding=UTF8&camp=1789&creative=390957&linkCode=ur2&tag=matthiasnehls-20&linkId=2JYSWJ7Q5CJ7F7QW",
    "amazon-landing.img.US" -> "https://ir-na.amazon-adsystem.com/e/ir?t=matthiasnehls-20&l=ur2&o=1",
    "amazon-landing.link.DE" -> "http://www.amazon.de/?_encoding=UTF8&camp=1638&creative=19454&linkCode=ur2&site-redirect=de&tag=matnehblo-21&linkId=GTDGKZ677SJ76DR2",
    "amazon-landing.img.DE" -> "https://ir-de.amazon-adsystem.com/e/ir?t=matnehblo-21&l=ur2&o=3",
    "amazon-landing.link.AT" -> "http://www.amazon.de/?_encoding=UTF8&camp=1638&creative=19454&linkCode=ur2&site-redirect=at&tag=matnehblo-21&linkId=GTDGKZ677SJ76DR2",
    "amazon-landing.img.AT" -> "https://ir-de.amazon-adsystem.com/e/ir?t=matnehblo-21&l=ur2&o=3",
    "amazon-landing.link.GB" -> "http://www.amazon.co.uk/?_encoding=UTF8&camp=1634&creative=19450&linkCode=ur2&tag=matthiasneh0c-21&linkId=O6XF3Z2DDAH6EUXU",
    "amazon-landing.img.GB" -> "https://ir-uk.amazon-adsystem.com/e/ir?t=matthiasneh0c-21&l=ur2&o=2",
    "amazon-landing.link.FR" -> "https://www.amazon.fr/?_encoding=UTF8&camp=1642&creative=19458&linkCode=ur2&tag=matthiasneh03-21&linkId=WATXOGQM2BDD44FL",
    "amazon-landing.img.FR" -> "https://ir-fr.amazon-adsystem.com/e/ir?t=matthiasneh03-21&l=ur2&o=8",
    "amazon-landing.link.CA" -> "http://www.amazon.ca/?_encoding=UTF8&camp=15121&creative=390961&linkCode=ur2&tag=matthiasneh0d-20",
    "amazon-landing.img.CA" -> "https://ir-ca.amazon-adsystem.com/e/ir?t=matthiasneh0d-20&l=ur2&o=15",
    "amazon-landing.link.IT" -> "https://www.amazon.it/?_encoding=UTF8&camp=3370&creative=24114&linkCode=ur2&tag=matthiasneh01-21",
    "amazon-landing.img.IT" -> "https://ir-it.amazon-adsystem.com/e/ir?t=matthiasneh01-21&l=ur2&o=29",
    "amazon-landing.link.ES" -> "https://www.amazon.es/?_encoding=UTF8&camp=3626&creative=24822&linkCode=ur2&tag=matthiasne0ac-21",
    "amazon-landing.img.ES" -> "https://ir-es.amazon-adsystem.com/e/ir?t=matthiasne0ac-21&l=ur2&o=30",

    // Template - banner
    "template.banner.US" -> "",
    "template.banner.DE" -> "",
    "template.banner.AT" -> "",
    "template.banner.GB" -> "",
    "template.banner.FR" -> "",
    "template.banner.CA" -> "",
    "template.banner.IT" -> "",
    "template.banner.ES" -> "",

    // Uncle Bob - The Clean Coder
    "unclebob-cleancoder.link.US" -> "http://www.amazon.com/gp/product/0137081073/ref=as_li_tl?ie=UTF8&camp=1789&creative=390957&creativeASIN=0137081073&linkCode=as2&tag=matthiasnehls-20",
    "unclebob-cleancoder.link.DE" -> "http://www.amazon.de/gp/product/0137081073/ref=as_li_tl?ie=UTF8&camp=1638&creative=19454&creativeASIN=0137081073&linkCode=as2&tag=matnehblo-21",
    "unclebob-cleancoder.link.AT" -> "http://www.amazon.de/gp/product/0137081073/ref=as_li_tl?ie=UTF8&camp=1638&creative=19454&creativeASIN=0137081073&linkCode=as2&tag=matnehblo-21",
    "unclebob-cleancoder.link.GB" -> "http://www.amazon.co.uk/gp/product/0137081073/ref=as_li_tl?ie=UTF8&camp=1634&creative=19450&creativeASIN=0137081073&linkCode=as2&tag=matnehblo0e-21",
    "unclebob-cleancoder.link.FR" -> "http://www.amazon.fr/gp/product/0137081073/ref=as_li_tl?ie=UTF8&camp=1642&creative=19458&creativeASIN=0137081073&linkCode=as2&tag=matthiasneh03-21",
    "unclebob-cleancoder.link.CA" -> "http://www.amazon.ca/gp/product/0137081073/ref=as_li_ss_tl?ie=UTF8&camp=15121&creative=390961&creativeASIN=0137081073&linkCode=as2&tag=matthiasneh0d-20",
    "unclebob-cleancoder.link.IT" -> "http://www.amazon.it/gp/product/0137081073/ref=as_li_ss_tl?ie=UTF8&camp=3370&creative=24114&creativeASIN=0137081073&linkCode=as2&tag=matthiasneh01-21",
    "unclebob-cleancoder.link.ES" -> "http://www.amazon.es/gp/product/0137081073/ref=as_li_ss_tl?ie=UTF8&camp=3626&creative=24822&creativeASIN=0137081073&linkCode=as2&tag=matthiasne0ac-21",

    // Sony A7 - iFrame
    "sony-a7.iframe.US" -> "//ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=US&source=ss&ref=ss_til&ad_type=product_link&tracking_id=matthiasnehls-20&marketplace=amazon&region=US&placement=B00FRDUZXM&asins=B00FRDUZXM&linkId=W3JU6YUGAP2PCAQI&show_border=false&link_opens_in_new_window=true",
    "sony-a7.iframe.DE" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",
    "sony-a7.iframe.AT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",
    "sony-a7.iframe.GB" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0c-21&o=2&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",
    "sony-a7.iframe.FR" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh03-21&o=8&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",
    "sony-a7.iframe.CA" -> "http://rcm-na.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0d-20&o=15&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FRDUZXM",
    "sony-a7.iframe.IT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh01-21&o=29&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",
    "sony-a7.iframe.ES" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasne0ac-21&o=30&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FWUDE9W",

    // Zeiss 24-70mm 4.0 - iFrame
    "zeiss-24-70.iframe.US" -> "//ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=US&source=ss&ref=ss_til&ad_type=product_link&tracking_id=matthiasnehls-20&marketplace=amazon&region=US&placement=B00FSB79FU&asins=B00FSB79FU&linkId=IDVUN4G4M63KJ6OY&show_border=false&link_opens_in_new_window=true",
    "zeiss-24-70.iframe.DE" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",
    "zeiss-24-70.iframe.AT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",
    "zeiss-24-70.iframe.GB" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0c-21&o=2&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",
    "zeiss-24-70.iframe.FR" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh03-21&o=8&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",
    "zeiss-24-70.iframe.IT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh01-21&o=29&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",
    "zeiss-24-70.iframe.ES" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasne0ac-21&o=30&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00FYRLSIC",

    // Sony A7R - link
    "sony-a7r.link.US" -> "http://www.amazon.com/gp/product/B00FRDUZUK/ref=as_li_tl?ie=UTF8&camp=1789&creative=390957&creativeASIN=B00FRDUZUK&linkCode=as2&tag=matthiasnehls-20&linkId=HFHEMMGVXCWFHZOL",
    "sony-a7r.link.DE" -> "http://www.amazon.de/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=1638&creative=19454&creativeASIN=B00G34CVWW&linkCode=as2&tag=matnehblo-21",
    "sony-a7r.link.AT" -> "http://www.amazon.de/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=1638&creative=19454&creativeASIN=B00G34CVWW&linkCode=as2&tag=matnehblo-21",
    "sony-a7r.link.GB" -> "http://www.amazon.co.uk/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=1634&creative=19450&creativeASIN=B00G34CVWW&linkCode=as2&tag=matthiasneh0c-21",
    "sony-a7r.link.FR" -> "http://www.amazon.fr/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=1642&creative=19458&creativeASIN=B00G34CVWW&linkCode=as2&tag=matthiasneh03-21",
    "sony-a7r.link.CA" -> "",
    "sony-a7r.link.IT" -> "http://www.amazon.it/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=3370&creative=24114&creativeASIN=B00G34CVWW&linkCode=as2&tag=matthiasneh01-21",
    "sony-a7r.link.ES" -> "http://www.amazon.es/gp/product/B00G34CVWW/ref=as_li_ss_tl?ie=UTF8&camp=3626&creative=24822&creativeASIN=B00G34CVWW&linkCode=as2&tag=matthiasne0ac-21",

    // Mastering AngularJS - 178216183X - iframe
    "mastering-angular.iframe.US" -> "//ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=US&source=ss&ref=ss_til&ad_type=product_link&tracking_id=matthiasnehls-20&marketplace=amazon&region=US&placement=B00EQ67J30&asins=B00EQ67J30&linkId=QGX6R3SXAZVZRK3R&show_border=false&link_opens_in_new_window=tru",
    "mastering-angular.iframe.DE" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.AT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.GB" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0c-21&o=2&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.FR" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh03-21&o=8&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.CA" -> "http://rcm-na.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0d-20&o=15&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.IT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh01-21&o=29&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",
    "mastering-angular.iframe.ES" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasne0ac-21&o=30&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EQ67J30",

    // AngularJS Directives - 1783280344 - iframe
    "angular-directives.iframe.US" -> "//ws-na.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=US&source=ss&ref=ss_til&ad_type=product_link&tracking_id=matthiasnehls-20&marketplace=amazon&region=US&placement=B00EXNI5Z2&asins=B00EXNI5Z2&linkId=RT5HE24DXVERHKC4&show_border=true&link_opens_in_new_window=true",
    "angular-directives.iframe.DE" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.AT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matnehblo-21&o=3&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.GB" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0c-21&o=2&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.FR" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh03-21&o=8&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.CA" -> "http://rcm-na.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh0d-20&o=15&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.IT" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasneh01-21&o=29&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",
    "angular-directives.iframe.ES" -> "http://rcm-eu.amazon-adsystem.com/e/cm?lt1=_blank&bc1=FFFFFF&IS2=1&bg1=FFFFFF&fc1=000000&lc1=0000FF&t=matthiasne0ac-21&o=30&p=8&l=as4&m=amazon&f=ifr&ref=ss_til&asins=B00EXNI5Z2",

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
