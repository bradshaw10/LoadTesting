
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TimedOriginal extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:5000")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.104 Safari/537.36")

	val headers_0 = Map(
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

	val headers_1 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

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
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiOGMwMmYyYjEtYzFhZC00MGU0LWExMzYtZGIxMmNmNTY5ZjBlIiwiRXZlbnRDb2RlIjoiMDAxIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQmFzaWNVc2VyIiwiQm9va2luZ1JlZiI6IjYwMzYzIiwiZXhwIjoxNjEyMjg5ODk2LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.1yLKN0KJMZA14RjxR7v3lWGAfa8Iw3q_0mIaCsHSlrA",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_4 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiOGMwMmYyYjEtYzFhZC00MGU0LWExMzYtZGIxMmNmNTY5ZjBlIiwiRXZlbnRDb2RlIjoiMDAxIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQmFzaWNVc2VyIiwiQm9va2luZ1JlZiI6IjYwMzYzIiwiZXhwIjoxNjEyMjg5ODk2LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.1yLKN0KJMZA14RjxR7v3lWGAfa8Iw3q_0mIaCsHSlrA",
		"content-type" -> "application/json",
		"origin" -> "null",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_6 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_18 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiOGMwMmYyYjEtYzFhZC00MGU0LWExMzYtZGIxMmNmNTY5ZjBlIiwiRXZlbnRDb2RlIjoiMDAxIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQ2hlY2tvdXRVc2VyIiwiQm9va2luZ1JlZiI6IjYwMzYzIiwiZXhwIjoxNjEyMjg5OTA4LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.8-0KnBHb_Nt7EqU6cpoEcxot3sjKsqt_1_pdhvBSnX8",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_19 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"authorization" -> "Bearer eyJhbGciOiJodHRwOi8vd3d3LnczLm9yZy8yMDAxLzA0L3htbGRzaWctbW9yZSNobWFjLXNoYTI1NiIsInR5cCI6IkpXVCJ9.eyJodHRwOi8vc2NoZW1hcy54bWxzb2FwLm9yZy93cy8yMDA1LzA1L2lkZW50aXR5L2NsYWltcy9uYW1lIjoiOGMwMmYyYjEtYzFhZC00MGU0LWExMzYtZGIxMmNmNTY5ZjBlIiwiRXZlbnRDb2RlIjoiMDAxIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy9yb2xlIjoiQ2hlY2tvdXRVc2VyIiwiQm9va2luZ1JlZiI6IjYwMzYzIiwiZXhwIjoxNjEyMjg5OTA4LCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEiLCJhdWQiOiJodHRwOi8vbG9jYWxob3N0OjQyMDEifQ.8-0KnBHb_Nt7EqU6cpoEcxot3sjKsqt_1_pdhvBSnX8",
		"content-type" -> "application/json",
		"origin" -> "null",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_20 = Map(
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_21 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Access-Control-Request-Headers" -> "authorization,content-type",
		"Access-Control-Request-Method" -> "GET",
		"Origin" -> "http://localhost:4200",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_24 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin")

	val headers_25 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"access-control-request-headers" -> "authorization,content-type",
		"access-control-request-method" -> "GET",
		"origin" -> "null",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_29 = Map(
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_30 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site")

	val headers_35 = Map(
		"Accept" -> "application/json",
		"Content-Type" -> "application/x-www-form-urlencoded",
		"sec-ch-ua" -> """Chromium";v="88", "Google Chrome";v="88", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_50 = Map(
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
    val uri4 = "https://api.stripe.com/v1/payment_intents/pi_1IGTDvICfKXrqv8pgqBEcZkp/confirm"
    val uri5 = "https://q.stripe.com"

	val scn = scenario("TimedOriginal")
		.exec(http("request_0")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FHome&dr=http%3A%2F%2Flocalhost%3A4200%2FSlotPayment&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&_s=8")
			.headers(headers_0)
			.body(RawFileBody("/timedoriginal/0000_request.txt")))
		.pause(2)
		
		.exec(http("request_1")
			.post("/api/Auth/GetToken/001")
			.headers(headers_1))
		.pause(1)
		
		.exec(http("request_2")
			.options("/api/Cart/Add/")
			.headers(headers_2)
			.resources(http("request_3")
			.put("/api/Cart/Add/")
			.headers(headers_3)
			.body(RawFileBody("/timedoriginal/0003_request.json")),
            http("request_4")
			.put("https://" + uri2 + ":5001/api/Cart/Add/")
			.headers(headers_4)
			.body(RawFileBody("/timedoriginal/0004_request.json"))))
		.pause(2)
		
		.exec(http("request_5")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FSlot%2F001&dr=http%3A%2F%2Flocalhost%3A4200%2FConfirm&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&_s=9")
			.headers(headers_0)
			.body(RawFileBody("/timedoriginal/0005_request.txt"))
			.resources(http("request_6")
			.options("/api/Meridian/")
			.headers(headers_6),
            
			http("PostTicket")
			.post("/api/Meridian/")
			.headers(headers_3)
			.body(RawFileBody("/timedoriginal/0007_request.json")),
            http("PostTicket")
			.post("https://" + uri2 + ":5001/api/Meridian/")
			.headers(headers_4)
			.body(RawFileBody("/timedoriginal/0008_request.json"))))
		.pause(3)
		
		.exec(http("PostEvent")
			.options("/api/Cart/Event/")
			.headers(headers_2)
			.resources(http("request_10")
			.put("/api/Cart/Event/")
			.headers(headers_3)
			.body(RawFileBody("/timedoriginal/0010_request.json")),
            http("request_11")
			.put("https://" + uri2 + ":5001/api/Cart/Event/")
			.headers(headers_4)
			.body(RawFileBody("/timedoriginal/0011_request.json")),
            http("request_12")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FTours%2F20210219&dr=http%3A%2F%2Flocalhost%3A4200%2FHome&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&_s=10")
			.headers(headers_0)
			.body(RawFileBody("/timedoriginal/0012_request.txt"))))
		.pause(1)
		
		.exec(http("CreteTimed")
			.options("/api/Booking/CreateTimed")
			.headers(headers_6)
			.resources(http("request_14")
			.post("/api/Booking/CreateTimed")
			.headers(headers_3)
			.body(RawFileBody("/timedoriginal/0014_request.json")),
            http("request_15")
			.post("https://" + uri2 + ":5001/api/Booking/CreateTimed")
			.headers(headers_4)
			.body(RawFileBody("/timedoriginal/0015_request.json"))))
		.pause(5)

		.exec(http("request_16")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FSlotPayment&dr=http%3A%2F%2Flocalhost%3A4200%2FSlot%2F001&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&_s=11")
			.headers(headers_0)
			.body(RawFileBody("/timedoriginal/0016_request.txt")))
		.pause(1)
		
		.exec(http("request_17")
			.options("/api/Booking/Details")
			.headers(headers_2)
			.resources(http("request_18")
			.put("/api/Booking/Details")
			.headers(headers_18)
			.body(RawFileBody("/timedoriginal/0018_request.json")),
            
			http("BookingDetails")
			.put("https://" + uri2 + ":5001/api/Booking/Details")
			.headers(headers_19)
			.body(RawFileBody("/timedoriginal/0019_request.json")),
            
			http("request_20")
			.get(uri3 + "/controller-2081928771a31398a2804aefca7db625.html")
			.headers(headers_20),
            http("request_21")
			.options("/api/Stripe/CreatePaymentIntent")
			.headers(headers_21),
            http("request_22")
			.get(uri3 + "/elements-inner-card-9beed05d9ce0894eb6fe4bdfbb93c8ab.html")
			.headers(headers_20),
            http("request_23")
			.get("/api/Stripe/CreatePaymentIntent")
			.headers(headers_18),
            http("request_24")
			.get(uri3 + "/fingerprinted/js/controller-8b09b914fa569f94ccd836565c2c4b2a.js")
			.headers(headers_24),
            http("request_25")
			.options("https://" + uri2 + ":5001/api/Stripe/CreatePaymentIntent")
			.headers(headers_25),
            http("request_26")
			.get(uri3 + "/fingerprinted/js/shared-3d42574f44dcc47e2d826bdab8fbb396.js")
			.headers(headers_24),
            http("request_27")
			.get(uri3 + "/fingerprinted/js/ui-shared-77d83ae5e1abb33bad88237e96ab4439.js")
			.headers(headers_24),
            http("request_28")
			.get(uri3 + "/fingerprinted/js/elements-inner-card-3eab6cbf214191312e313ea83f91ccd8.js")
			.headers(headers_24),
            http("request_29")
			.get(uri3 + "/fingerprinted/css/ui-shared-1a3494666c8cbd375492e006f2e840cd.css")
			.headers(headers_29),
            http("request_30")
			.get(uri5 + "/?event=elements.controller.load&event_count=1&timestamp=1612289015654&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_30),
            http("request_31")
			.get(uri5 + "/?event=elements.fetch_locale&event_count=2&timestamp=1612289015743&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_30),
            http("request_32")
			.get(uri5 + "/?event=elements.elements&event_count=3&timestamp=1612289015746&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&options-betas=")
			.headers(headers_30),
            http("request_33")
			.get(uri5 + "/?event=elements.fetch_locale&event_count=4&timestamp=1612289015750&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_30),
            http("request_34")
			.get("https://" + uri2 + ":5001/api/Stripe/CreatePaymentIntent")
			.headers(headers_19),
            http("request_35")
			.get(uri3 + "/fingerprinted/data/countryRanges-e0a096641b94a5ef23aa7191acc0b7a2.json")
			.headers(headers_35),
            http("request_36")
			.get(uri5 + "/?event=elements.timings&event_count=5&timestamp=1612289016320&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=ControllerApp&dom_loading=81&dom_interactive=224&dom_complete=879&since_sjs_load=117933&since_stripe_create=224&since_create=224&mount_duration=216&since_fetch=213&load_count=1&match_frame=true&resource_timings-shared.js-transfer_size=0&resource_timings-shared.js-duration=0&resource_timings-controller.js-transfer_size=0&resource_timings-controller.js-duration=0")
			.headers(headers_30),
            http("request_37")
			.get(uri5 + "/?event=elements.create&event_count=6&timestamp=1612289016535&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&options-style-base-type=blocks&options-style-base-blocks=%5Bobject+Object%5D+%5Bobject+Object%5D&options-betas=&options-componentName=card&options-controllerId=__privateStripeController6897&options-referrer=http%3A%2F%2Flocalhost%3A4200%2FSlotPayment&options-wait=false&options-rtl=false&options-keyMode=test&options-apiKey=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&element=card")
			.headers(headers_30),
            http("request_38")
			.get(uri5 + "/?event=elements.event.load&event_count=7&timestamp=1612289016538&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_30),
            http("request_39")
			.get(uri5 + "/?event=elements.event.ready&event_count=8&timestamp=1612289016574&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_30),
            http("request_40")
			.get(uri5 + "/?event=elements.timings&event_count=9&timestamp=1612289016579&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&dom_loading=220&dom_interactive=656&dom_complete=1105&since_sjs_load=118335&since_stripe_create=628&since_group_create=619&since_create=619&mount_duration=608&since_fetch=604&load_count=1&match_frame=true&resource_timings-ui-shared.css-transfer_size=0&resource_timings-ui-shared.css-duration=15&resource_timings-shared.js-transfer_size=0&resource_timings-shared.js-duration=0&resource_timings-ui-shared.js-transfer_size=0&resource_timings-ui-shared.js-duration=0&resource_timings-elements-inner-card.js-transfer_size=0&resource_timings-elements-inner-card.js-duration=0&resource_timings-countryRanges.json-transfer_size=0&resource_timings-countryRanges.json-duration=5&element=card")
			.headers(headers_30),
            http("request_41")
			.get(uri5 + "/?event=elements.event.focus&event_count=10&timestamp=1612289016803&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_30),
            http("request_42")
			.get(uri3 + "/fingerprinted/img/visa-365725566f9578a9589553aa9296d178.svg")
			.headers(headers_29),
            http("request_43")
			.get(uri5 + "/?event=elements.event.first_interaction&event_count=11&timestamp=1612289017893&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_30)))
		.pause(2)
		.exec(http("request_44")
			.get(uri5 + "/?event=elements.retrieve_card_metadata&event_count=12&timestamp=1612289020187&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_30)
			.resources(http("request_45")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&_s=12&dl=http%3A%2F%2Flocalhost%2FSlotPayment&dr=http%3A%2F%2Flocalhost%3A4200%2FTours%2F20210219&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&en=add_address&_et=5936&ep.page_path=%2FSlotPayment&ep.eventCategory=shop&ep.eventLabel=click&ep.eventAction=cart&epn.eventValue=1")
			.headers(headers_0)))
		.pause(3)
		.exec(http("request_46")
			.get(uri5 + "/?event=elements.card_number_field_blurred&event_count=13&timestamp=1612289023577&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&card_brand=visa&bin_prefix=424242&card_length=16&min_expected_card_length=16&max_expected_card_length=16&metadata_brand=unknown&metadata_card_length=0&metadata_country=&metadata_matches=-1&card_number_input_width=211&element=card")
			.headers(headers_30))
		.pause(4)
		.exec(http("request_47")
			.get(uri5 + "/?event=elements.event.blur&event_count=14&timestamp=1612289028216&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&element=card")
			.headers(headers_30)
			.resources(http("request_48")
			.get(uri5 + "/?event=elements.postal_code_autocorrected&event_count=15&timestamp=1612289028327&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&postal_code_bin_country=US&postal_code_removed_values=2%2C4%2C2&postal_code_removed_values_count=5&postal_code_autocorrect_complete=true&postal_code_locale=auto&element=card")
			.headers(headers_30),
            http("request_49")
			.get(uri5 + "/?event=elements.confirm_payment_intent&event_count=16&timestamp=1612289028373&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890")
			.headers(headers_30),
            http("request_50")
			.post(uri4)
			.headers(headers_50)
			.formParam("payment_method_data[type]", "card")
			.formParam("payment_method_data[card][number]", "4242424242424242")
			.formParam("payment_method_data[card][cvc]", "242")
			.formParam("payment_method_data[card][exp_month]", "04")
			.formParam("payment_method_data[card][exp_year]", "24")
			.formParam("payment_method_data[billing_details][address][postal_code]", "42424")
			.formParam("payment_method_data[guid]", "NA")
			.formParam("payment_method_data[muid]", "NA")
			.formParam("payment_method_data[sid]", "NA")
			.formParam("payment_method_data[payment_user_agent]", "stripe.js/085547e42; stripe-js-v3/085547e42")
			.formParam("payment_method_data[time_on_page]", "130662")
			.formParam("payment_method_data[referrer]", "http://localhost:4200/")
			.formParam("expected_payment_method_type", "card")
			.formParam("use_stripe_sdk", "true")
			.formParam("spc_eligible", "false")
			.formParam("key", "pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8")
			.formParam("client_secret", "pi_1IGTDvICfKXrqv8pgqBEcZkp_secret_HRLCzBoYFfI9Sv9vLoSgYzWtQ"),
            http("request_51")
			.options("/api/Stripe/ConfirmPayment")
			.headers(headers_6),
            http("request_52")
			.post("/api/Stripe/ConfirmPayment")
			.headers(headers_18)
			.body(RawFileBody("/timedoriginal/0052_request.json")),
            http("request_53")
			.get(uri5 + "/?event=rum.stripejs&event_count=17&timestamp=1612289030173&version=3&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&requestId=req_u3kkS0mwfIYDt5&tokenType=unknown&url=https%3A%2F%2Fapi.stripe.com%2Fv1%2Fpayment_intents%2Fpi_1IGTDvICfKXrqv8pgqBEcZkp%2Fconfirm&status=200&start=1612289028382&end=1612289030173&resourceTiming[startTime]=12947.155&resourceTiming[duration]=1787.07&resourceTiming[redirectStart]=0&resourceTiming[redirectEnd]=0&resourceTiming[fetchStart]=12947.155&resourceTiming[domainLookupStart]=12947.155&resourceTiming[domainLookupEnd]=12947.155&resourceTiming[connectStart]=12947.155&resourceTiming[connectEnd]=12947.155&resourceTiming[secureConnectionStart]=12947.155&resourceTiming[requestStart]=12950.255&resourceTiming[responseStart]=14733.39&resourceTiming[responseEnd]=14734.225&paymentUserAgent=stripe.js%2F085547e42%3B+stripe-js-v3%2F085547e42")
			.headers(headers_30),
            http("request_54")
			.get(uri5 + "/?event=elements.confirm_payment_intent.success&event_count=18&timestamp=1612289030175&version=085547e42&key=pk_test_u3zsnS1lVhIakEHkbEVQ08Vz00PAy2QGA8&referrer=http%3A%2F%2Flocalhost%3A4200%2F&stripe_js_id=267450ea-bf6f-499f-aa51-7037f4da1bc3&controller_load_time=1612289015652&wrapper=unknown&es_module=false&flag_cl=false&flag_clc=false&flag_cm=false&flag_pc=false&frame_width=890&object_id=pi_1IGTDvICfKXrqv8pgqBEcZkp&object_kind=payment_intent&object_type=undefined&object_livemode=false&element=card&payment_method_type=card")
			.headers(headers_30),
            http("request_55")
			.post("https://" + uri2 + ":5001/api/Stripe/ConfirmPayment")
			.headers(headers_19)
			.body(RawFileBody("/timedoriginal/0055_request.json")),
            http("request_56")
			.post(uri1 + "?v=2&tid=G-JM0RFMB8WQ&gtm=2oe1k0&_p=1551272413&sr=1920x1080&ul=en-us&cid=752747071.1603966879&dl=http%3A%2F%2Flocalhost%2FSlotPayment&dr=http%3A%2F%2Flocalhost%3A4200%2FTours%2F20210219&dt=Book%20Tours&sid=1612288539&sct=105&seg=1&_s=13")
			.headers(headers_0)
			.body(RawFileBody("/timedoriginal/0056_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}