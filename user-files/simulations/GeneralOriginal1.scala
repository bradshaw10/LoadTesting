
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class GeneralOriginal1 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://q.stripe.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.104 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_1 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "https://m.stripe.network",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_2 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "PUT",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_3 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiNjdlMTE3MzMtYmI0Zi00MGY2LThkMmMtM2U4MmU2MTg2ZDcxIiwiRXZlbnRDb2RlIjoiR0VOIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQmFzaWNVc2VyIiwiQm9va2luZ1JlZiI6IjYwMjIzIiwiZXhwIjoxNjExOTM1ODIwLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.2VVwfKvfHN-hAe2TFY1IQrb9IGMadwq9yvhgUMHYClQ",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiNjdlMTE3MzMtYmI0Zi00MGY2LThkMmMtM2U4MmU2MTg2ZDcxIiwiRXZlbnRDb2RlIjoiR0VOIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQmFzaWNVc2VyIiwiQm9va2luZ1JlZiI6IjYwMjIzIiwiZXhwIjoxNjExOTM1ODIwLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.2VVwfKvfHN-hAe2TFY1IQrb9IGMadwq9yvhgUMHYClQ",
		"content-type" -> "application/json",
		"origin" -> "null",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_5 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_8 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "http://localhost:4200",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_11 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiNjdlMTE3MzMtYmI0Zi00MGY2LThkMmMtM2U4MmU2MTg2ZDcxIiwiRXZlbnRDb2RlIjoiR0VOIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQ2hlY2tvdXRVc2VyIiwiQm9va2luZ1JlZiI6IjYwMjIzIiwiZXhwIjoxNjExOTM1ODI1LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.kprKk82WWCQm1A87_z29KjyG7trL4MexVDOa5r5bnJ4",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_12 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiNjdlMTE3MzMtYmI0Zi00MGY2LThkMmMtM2U4MmU2MTg2ZDcxIiwiRXZlbnRDb2RlIjoiR0VOIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQ2hlY2tvdXRVc2VyIiwiQm9va2luZ1JlZiI6IjYwMjIzIiwiZXhwIjoxNjExOTM1ODI1LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.kprKk82WWCQm1A87_z29KjyG7trL4MexVDOa5r5bnJ4",
		"content-type" -> "application/json",
		"origin" -> "null",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_13 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_14 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_16 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_19 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_20 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_21 = Map(
		"accept" -> "application/json",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"content-type" -> "application/x-www-form-urlencoded",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin")

	val headers_22 = Map(
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_26 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site")

	val headers_36 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_44 = Map(
		"accept" -> "application/json",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "https://js.stripe.com",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-site")

    val uri1 = "https://www.google-analytics.com/g/collect"
    val uri2 = "localhost"
    val uri3 = "https://js.stripe.com/v3"
    val uri4 = "https://m.stripe.com/6"
    val uri5 = "https://api.stripe.com/v1/payment_intents/pi_1IEz6rICfKXrqv8peMJEdmm4/confirm"

	val scn = scenario("GeneralOriginal1")
		.exec(http("request_0")
			.post("http://" + uri2 + ":5000/api/Auth/GetToken/GEN")
			.headers(headers_0)
			.resources(http("request_1")
			.post(uri4)
			.headers(headers_1)
			.body(RawFileBody("/generaloriginal1/0001_request.txt"))))
		.pause(1)

		.exec(http("request_2")
			.options("http://" + uri2 + ":5000/api/Cart/Add/")
			.headers(headers_2)
			
			.resources(http("request_3")
			.put("http://" + uri2 + ":5000/api/Cart/Add/")
			.headers(headers_3)
			.body(RawFileBody("/generaloriginal1/0003_request.json")),

            http("request_4")
			.put("https://" + uri2 + ":5001/api/Cart/Add/")
			.headers(headers_4)
			.body(RawFileBody("/generaloriginal1/0004_request.json"))))
		.pause(1)

		.exec(http("CreateGeneral")
			.options("http://" + uri2 + ":5000/api/Booking/CreateGeneral")
			.headers(headers_5)
			
			.resources(http("GeneralRequest")
			.post("http://" + uri2 + ":5000/api/Booking/CreateGeneral")
			.headers(headers_3)
			.body(RawFileBody("/generaloriginal1/0006_request.json")),
            
			http("GeneralRequest5001")
			.post("https://" + uri2 + ":5001/api/Booking/CreateGeneral")
			.headers(headers_4)
			.body(RawFileBody("/generaloriginal1/0007_request.json")),
            
			http("GoogleAnal")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=267356526&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FGeneral%2FGEN&dr=http%3A%2F%2Flocalhost%3A4200%2FHome&dt=Book%20Tours&sid=1611933596&sct=97&seg=1&_s=10")
			.headers(headers_8)
			.body(RawFileBody("/generaloriginal1/0008_request.txt")),
            
			http("StripeRequest")
			.post(uri4)
			.headers(headers_1)
			.body(RawFileBody("/generaloriginal1/0009_request.txt"))))
		.pause(4)

		.exec(http("BookingDetauks")
			.options("http://" + uri2 + ":5000/api/Booking/Details")
			.headers(headers_2)
			.resources(http("request_11")
			.put("http://" + uri2 + ":5000/api/Booking/Details")
			.headers(headers_11)
			.body(RawFileBody("/generaloriginal1/0011_request.json")),
            
			
			http("request_12")
			.put("https://" + uri2 + ":5001/api/Booking/Details")
			.headers(headers_12)
			.body(RawFileBody("/generaloriginal1/0012_request.json")),
            http("request_13")
			.get(uri3 + "/elements-inner-card-a8800d571bb2bff2d064e01d76769e31.html")
			.headers(headers_13),
            
			
			http("CreatePaymentIntent")
			.options("http://" + uri2 + ":5000/api/Stripe/CreatePaymentIntent")
			.headers(headers_14),
            http("request_15")
			.get("http://" + uri2 + ":5000/api/Stripe/CreatePaymentIntent")
			.headers(headers_11),
            
			
			http("StripeFingerPrint1")
			.get(uri3 + "/fingerprinted/js/ui-shared-121e554d3a08b818808584dff61fc32c.js")
			.headers(headers_16),
            
			http("StripeFingerPrint2")
			.get(uri3 + "/fingerprinted/js/elements-inner-card-77d7d4c2ce976deb5d1dc2ff2a238146.js")
			.headers(headers_16),

            http("StripeFingerPrint3")
			.get(uri3 + "/fingerprinted/js/shared-8b0cf640a52a1422947f168069c49b9d.js")
			.headers(headers_16),


            http("StripeFingerPrint4")
			.get(uri3 + "/fingerprinted/css/ui-shared-1a3494666c8cbd375492e006f2e840cd.css")
			.headers(headers_19),

            http("StripeController")
			.get(uri3 + "/controller-289c8b3fe889dd46a858c9cb640fbf63.html")
			.headers(headers_20),
            
			http("StripeCountryRanges")
			.get(uri3 + "/fingerprinted/data/countryRanges-e0a096641b94a5ef23aa7191acc0b7a2.json")
			.headers(headers_21),

            http("request_22")
			.get(uri3 + "/fingerprinted/js/shared-8b0cf640a52a1422947f168069c49b9d.js")
			.headers(headers_22),
            
			http("request_23")
			.get(uri3 + "/fingerprinted/js/controller-6d15abacacad5eabb07034f26400b450.js")
			.headers(headers_16),
            
			http("request_24")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=267356526&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FGeneralPayment&dr=http%3A%2F%2Flocalhost%3A4200%2FGeneral%2FGEN&dt=Book%20Tours&sid=1611933596&sct=97&seg=1&_s=11")
			.headers(headers_8)
			.body(RawFileBody("/generaloriginal1/0024_request.txt")),
            
			http("PrivateStripe")
			.get("https://" + uri2 + ":5001/api/Stripe/CreatePaymentIntent")
			.headers(headers_12),
            
			http("request_26")
			.get("/?event=elements.fetch_locale&event_count=2&timestamp=1611934931432&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_26),
            http("request_27")
			.get("/?event=elements.elements&event_count=3&timestamp=1611934931434&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&options-betas=")
			.headers(headers_26),
            http("request_28")
			.get("/?event=elements.fetch_locale&event_count=4&timestamp=1611934931435&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_26),
            http("request_29")
			.get("/?event=elements.controller.load&event_count=1&timestamp=1611934931073&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_26),
            http("request_30")
			.get("/?event=elements.create&event_count=5&timestamp=1611934931640&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&options-style-base-type=blocks&options-style-base-blocks=%5Bobject+Object%5D+%5Bobject+Object%5D&options-betas=&options-componentName=card&options-controllerId=__privateStripeController6397&options-referrer=http%3A%2F%2Flocalhost%3A4200%2FGeneralPayment&options-wait=false&options-rtl=false&options-keyMode=test&options-apiKey=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&element=card")
			.headers(headers_26),
            http("request_31")
			.get("/?event=elements.event.load&event_count=6&timestamp=1611934931642&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_26),
            http("request_32")
			.get("/?event=elements.timings&event_count=7&timestamp=1611934931655&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&dom_loading=69&dom_interactive=479&dom_complete=910&since_sjs_load=345565&since_stripe_create=440&since_group_create=429&since_create=429&mount_duration=415&since_fetch=413&load_count=1&match_frame=true&resource_timings-ui-shared.css-transfer_size=67&resource_timings-ui-shared.css-duration=132&resource_timings-shared.js-transfer_size=431&resource_timings-shared.js-duration=128&resource_timings-ui-shared.js-transfer_size=0&resource_timings-ui-shared.js-duration=0&resource_timings-elements-inner-card.js-transfer_size=0&resource_timings-elements-inner-card.js-duration=0&resource_timings-countryRanges.json-transfer_size=64&resource_timings-countryRanges.json-duration=48&element=card")
			.headers(headers_26),
            http("request_33")
			.get("/?event=elements.event.focus&event_count=8&timestamp=1611934931734&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_26),
            http("request_34")
			.get("/?event=elements.event.ready&event_count=9&timestamp=1611934931739&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_26),
            http("request_35")
			.get("/?event=elements.timings&event_count=10&timestamp=1611934931993&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=ControllerApp&dom_loading=272&dom_interactive=617&dom_complete=1531&since_sjs_load=345752&since_stripe_create=626&since_create=626&mount_duration=616&since_fetch=609&load_count=1&match_frame=true&resource_timings-shared.js-transfer_size=0&resource_timings-shared.js-duration=0&resource_timings-controller.js-transfer_size=0&resource_timings-controller.js-duration=0")
			.headers(headers_26),
            http("request_36")
			.get(uri3 + "/fingerprinted/img/visa-365725566f9578a9589553aa9296d178.svg")
			.headers(headers_36),
            http("request_37")
			.get("/?event=elements.event.first_interaction&event_count=11&timestamp=1611934932827&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_26)))
		.pause(1)
		.exec(http("request_38")
			.get("/?event=elements.retrieve_card_metadata&event_count=12&timestamp=1611934934079&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_26))
		.pause(2)
		.exec(http("request_39")
			.get("/?event=elements.card_number_field_blurred&event_count=13&timestamp=1611934936950&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&card_brand=visa&bin_prefix=424242&card_length=16&min_expected_card_length=16&max_expected_card_length=16&metadata_brand=unknown&metadata_card_length=0&metadata_country=&metadata_matches=-1&card_number_input_width=211&element=card")
			.headers(headers_26))
		.pause(2)
		.exec(http("request_40")
			.get("/?event=elements.event.blur&event_count=14&timestamp=1611934939400&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_26)
			.resources(http("request_41")
			.get("/?event=elements.confirm_payment_intent&event_count=15&timestamp=1611934939513&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_26)))
		.pause(1)
		.exec(http("request_42")
			.get("/?event=elements.postal_code_autocorrected&event_count=16&timestamp=1611934941599&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&postal_code_bin_country=US&postal_code_removed_values=2%2C4&postal_code_removed_values_count=3&postal_code_autocorrect_complete=true&postal_code_locale=auto&element=card")
			.headers(headers_26)
			.resources(http("request_43")
			.options("http://" + uri2 + ":5000/api/Stripe/ConfirmPayment")
			.headers(headers_5),
            http("request_44")
			.post(uri5)
			.headers(headers_44)
			.formParam("payment_method_data[type]", "card")
			.formParam("payment_method_data[card][number]", "4242424242424242")
			.formParam("payment_method_data[card][cvc]", "242")
			.formParam("payment_method_data[card][exp_month]", "04")
			.formParam("payment_method_data[card][exp_year]", "24")
			.formParam("payment_method_data[billing_details][address][postal_code]", "42424")
			.formParam("payment_method_data[guid]", "8acaff8a-dd0b-45c9-a4e9-6d50ceb84fcd6d8943")
			.formParam("payment_method_data[muid]", "d229f6d9-f55e-4be7-8c70-faff8bcf97af059d05")
			.formParam("payment_method_data[sid]", "e5ed099b-12eb-4f56-8a25-93a501b198b0dcab71")
			.formParam("payment_method_data[payment_user_agent]", "stripe.js/5ca0c5a13; stripe-js-v3/5ca0c5a13")
			.formParam("payment_method_data[time_on_page]", "354201")
			.formParam("payment_method_data[referrer]", "http://localhost:4200/")
			.formParam("expected_payment_method_type", "card")
			.formParam("use_stripe_sdk", "true")
			.formParam("spc_eligible", "false")
			.formParam("key", "pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8")
			.formParam("client_secret", "pi_1IEz6rICfKXrqv8peMJEdmm4_secret_PT1zhGEYwXqkgVqoQH9QSU90Z"),
            http("request_45")
			.post("http://" + uri2 + ":5000/api/Stripe/ConfirmPayment")
			.headers(headers_11)
			.body(RawFileBody("/generaloriginal1/0045_request.json")),
            http("request_46")
			.get("/?event=rum.stripejs&event_count=17&timestamp=1611934941929&version=3&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&requestId=req_Nl2udoljOYiAxG&tokenType=unknown&url=https%3A%2F%2Fapi.stripe.com%2Fv1%2Fpayment_intents%2Fpi_1IEz6rICfKXrqv8peMJEdmm4%2Fconfirm&status=200&start=1611934939520&end=1611934941928&resourceTiming[startTime]=9068.185&resourceTiming[duration]=2404.465&resourceTiming[redirectStart]=0&resourceTiming[redirectEnd]=0&resourceTiming[fetchStart]=9068.185&resourceTiming[domainLookupStart]=9073.68&resourceTiming[domainLookupEnd]=9099.86&resourceTiming[connectStart]=9099.86&resourceTiming[connectEnd]=9164.9&resourceTiming[secureConnectionStart]=9117.875&resourceTiming[requestStart]=9165.105&resourceTiming[responseStart]=11471.86&resourceTiming[responseEnd]=11472.65&paymentUserAgent=stripe.js%2F5ca0c5a13%3B+stripe-js-v3%2F5ca0c5a13")
			.headers(headers_26),
            http("request_47")
			.get("/?event=elements.confirm_payment_intent.success&event_count=18&timestamp=1611934941930&version=5ca0c5a13&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=da14fe2d-deb4-4083-8f02-1b047315904a&controller_load_time=1611934931070&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&object_id=pi_1IEz6rICfKXrqv8peMJEdmm4&object_kind=payment_intent&object_type=undefined&object_livemode=false&element=card&payment_method_type=card")
			.headers(headers_26),
            http("request_48")
			.post("https://" + uri2 + ":5001/api/Stripe/ConfirmPayment")
			.headers(headers_12)
			.body(RawFileBody("/generaloriginal1/0048_request.json")),
            http("request_49")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=267356526&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FGeneralPayment&dr=http%3A%2F%2Flocalhost%3A4200%2FGeneral%2FGEN&dt=Book%20Tours&sid=1611933596&sct=97&seg=1&_s=12")
			.headers(headers_8)
			.body(RawFileBody("/generaloriginal1/0049_request.txt")),
            http("request_50")
			.post(uri4)
			.headers(headers_1)
			.body(RawFileBody("/generaloriginal1/0050_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}