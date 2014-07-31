amzn-geo-defragmenter
=====================

Amazon has **[affiliate programs](https://affiliate-program.amazon.com/gp/associates/join/landing/main.html)** in multiple countries, each of which are separate from the others. If you only for example send visitors of your page to the U.S. store but they then get redirected to their home store, you earn nothing. Thus, the affiliate links program works particularly well when most users come from the same country.

But what if your visitors come from all over the planet? This application can help! Instead of linking to a URL in a particular store, you create a shortened link with this tool and internally have a lookup table that maps this link to different store links depending on the country. Each time a one of the shortened URLs is requested, this application will perform a local and super fast GeoIP lookup to determine the country of the requester. If a link for the country of the requester is found, that one is delivered. Otherwise, users are sent to the U.S. store as a default.

From a technical perspective, this is what happens:

* links are stored in a Scala Map inside the Play Framework application with different formats, e.g. with the key "slideshow1.narrow.DE"
* when a visitor comes to the page and requests "/slideshow1/narrow", a GeoIP lookup for the visitor's IP address is performed
* if the Map contains the composite key, the user is redirected to the appropriate URL
* otherwise, the user is redirected to a default URI

The (very fast) GeoIP lookup is performed locally by talking to an instance of **[freegeoip](https://github.com/fiorix/freegeoip)**. This allows for response times below 10ms.
