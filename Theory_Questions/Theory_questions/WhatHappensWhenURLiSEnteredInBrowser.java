package Theory_questions;

/*In an extremely rough and simplified sketch, assuming the simplest possible HTTP request, no proxies and IPv4 (this would work similarly for IPv6-only client, but I have yet to see such workstation):

browser checks cache; if requested object is in cache and is fresh, skip to #9 
browser asks OS for server's IP address 
OS makes a DNS lookup and replies the IP address to the browser 
browser opens a TCP connection to server (this step is much more complex with HTTPS) 
browser sends the HTTP request through TCP connection 
browser receives HTTP response and may close the TCP connection, or reuse it for another request 
browser checks if the response is a redirect (3xx result status codes), authorization request (401), error (4xx and 5xx), etc.; these are handled differently from normal responses (2xx) 
if cacheable, response is stored in cache 
browser decodes response (e.g. if it's gzipped) 
browser determines what to do with response (e.g. is it a HTML page, is it an image, is it a sound clip?) 
browser renders response, or offers a download dialog for unrecognized types 
Again, discussion of each of these points have filled countless pages; take this as a starting point. Also, there are many other things happening in parallel to this (processing typed-in address, adding page to browser history, displaying progress to user, notifying plugins and extensions, rendering the page while it's downloading, pipelining, connection tracking for keep-alive, etc.).

*/


/*You enter "facebook.com" into the address bar. 
Browser resolves this to the numeric IP address (this can be cached by the OS or require a trip out to a DNS server). 
Browser issues a "HTTP/GET" request. It passes along an HttpRequest which includes metadata about the browser, user preferences (like preferred language) and any stored cookies for that domain. 
Facebook servers receive the request and their code begins to craft a response. 
Facebook will use the passed information including cookies to determine who the user is and what information to send back 
A HTTP Response is returned from Facebook including a status line (200 OK, etc). Headers which include content-type, etc and the HTML body. 
The browser receives the Response and begins to parse it for display. 
The HTML body will include links to CSS, JS and images. 
All of these will trigger additional calls back to servers to retrieve those bits 
The browser layout engine will start to assemble the final page for display. 
CSS information may alter the layout and look of the page 
JS and DHTML may alter the layout of the page 
The final page is assembled and rendered to the end user. 
*/

public class WhatHappensWhenURLiSEnteredInBrowser {

}
