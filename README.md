amzn-geo-defragmenter
=====================

Amazon has **[affiliate programs](https://affiliate-program.amazon.com/gp/associates/join/landing/main.html)** in multiple countries, each of which is separate from the others. For example, if you only send visitors of your page to the U.S. store but they are then redirected to their home store, you earn nothing. Thus, the affiliate links program works particularly well when most users come from the same country.

But what if your visitors come from all over the planet? This application can help! Instead of linking to a URL in a particular store, you create a shortened link with this tool and internally have a lookup table that maps this link to different store links depending on the country. Each time one of the shortened URLs is requested, this application will perform a local and superfast GeoIP lookup to determine the country of the requester. If a link for the country of the requester is found, that link will be delivered. Otherwise, users are sent to the U.S. store as a default.

From a technical perspective, this is what happens:

* Links are stored in a Scala Map inside the Play Framework application with different formats, e.g. with the key "slideshow1.narrow.DE"
* When a visitor comes to the page and requests "/slideshow1/narrow", a GeoIP lookup for the visitor's IP address will be performed
* If the Map contains the composite key, the user will be redirected to the appropriate URL
* Otherwise, the user will be redirected to a default URI

The (very fast) GeoIP lookup is performed locally by talking to an instance of **[freegeoip](https://github.com/fiorix/freegeoip)**. This allows for response times below 10ms.

## Licence

This software is licensed under the **Apache 2 license** as mentioned below.

Copyright &copy; 2014 **[Matthias Nehlsen](http://www.matthiasnehlsen.com)**.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
