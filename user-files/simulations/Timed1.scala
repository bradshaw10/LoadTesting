
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Timed1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:5000")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.104 Safari/537.36")

	
    val url = "https://booktoursstapi.azurewebsites.net/"

	val r = scala.util.Random

	val scn = scenario("Timed1")
		.exec(http("GetToken")
			.post(url + "/api/Auth/GetToken/001")
			.check(status is 200)
			.check(jsonPath("$.accessToken").saveAs("tokenID")))
		.exitHereIfFailed 
		.pause(1)

		.exec(http("AddToCart")
			.put(url + "/api/Cart/Add/")
			.body(RawFileBody("../resources/timed1/0004_request.json"))
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json"))
		.exitHereIfFailed 		
		.pause(1)

		.tryMax(2, "FailRetry"){
		exec(http("GetTours")
			.post(url + "/api/Meridian/")
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json")
			.body(RawFileBody("../resources/timed1/0007_request.json")))
		}
		.exitHereIfFailed 
		.pause(1)

		.tryMax(2, "FailRetry"){
		exec(http("AddTourToCart")
			.put(url + "/api/Cart/Event/")
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json")
			.body(RawFileBody("../resources/timed1/0011_request.json")))
			}
		.exitHereIfFailed 
		.pause(1)
		.pause(r.nextInt(8))

		.exec(http("CreateTimed")
			.post(url + "/api/Booking/CreateTimed")
			.check(status.is(200))
			.check(jsonPath("$.accessToken").saveAs("checkoutTokenID"))	
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json"))
		.exitHereIfFailed
		.pause(1)

		.exec(http("BookingDetails")
			.put(url + "/api/Booking/Details")	
			.check(status is 200)
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer ${checkoutTokenID}")
			.body(RawFileBody("../resources/timed1/0019_request.json")))
		.exitHereIfFailed
		.exec(http("ConfirmPayment")
			.post(url + "/api/Stripe/ConfirmPayment")
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer ${checkoutTokenID}"))
		.exitHereIfFailed
		.pause(r.nextInt(4))


	setUp(scn.inject(
		rampUsers(200)during 2.minute))
		.protocols(httpProtocol)
}