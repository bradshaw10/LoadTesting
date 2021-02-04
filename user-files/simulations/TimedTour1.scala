
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TimedTour1 extends Simulation {

	val stringy = "test12345"

	val httpProtocol = http
		.baseUrl("http://localhost:5000")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.104 Safari/537.36")
		
	
    val uri1 = "https://www.google-analytics.com/g/collect"
    val uri2 = "localhost"
    val uri3 = "https://js.stripe.com/v3"
    val uri4 = "https://m.stripe.com/6"
    val uri5 = "https://m.stripe.network/inner.html"

	val scn = scenario("TimedTour1")
		.exec(http("GetToken")
			.post("/api/Auth/GetToken/001")
			.check(status is 200)
			.check(jsonPath("$.accessToken").saveAs("tokenID")))
		.pause(2)
		.exec(http("addToCart")
			.put("/api/Cart/Add/")
			.body(RawFileBody("../resources/timedtour1/0002_request.json"))
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json")
		
			
			// .put("/api/Cart/Add/")
			// .body(RawFileBody("../resources/timedtour1/0002_request.json"))
            
           )
		
	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}