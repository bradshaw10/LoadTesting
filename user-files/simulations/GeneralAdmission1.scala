
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class GeneralAdmission1 extends Simulation {

	val httpProtocol = http
		.baseUrl("https://q.stripe.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.104 Safari/537.36")

	val r = scala.util.Random

    val url = "https://booktoursstapi.azurewebsites.net/"


	val scn = scenario("GeneralAdmission1")
		.exec(http("GetToken")
			.post(url + "/api/Auth/GetToken/GEN")
			.check(status is 200)
			.check(jsonPath("$.accessToken").saveAs("tokenID")))
		.pause(5)
		.exec(http("AddToCart")
			.put(url + "/api/Cart/Add/")
			.body(RawFileBody("../resources/generaladmission1/0003_request.json"))
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json"))
            
		.pause(3)

		.exec(http("AddToCart2")
			.put(url + "/api/Cart/Add/")
			.body(RawFileBody("../resources/generaladmission1/0003_request.json"))
			.header("Authorization", "Bearer ${tokenID}")
			.header("Content-Type", "application/json"))
            
		.pause(2)
		.pause(r.nextInt(5))
		
		.tryMax(2, "FailRetry"){
			exec(http("CreateGeneral")
				.post(url + "/api/Booking/CreateGeneral")
				.check(status.is(200))
				.check(jsonPath("$.accessToken").saveAs("checkoutTokenID"))		
				.header("Authorization", "Bearer ${tokenID}")
				.header("Content-Type", "application/json"))
		}
		.pause(4)
		.exec(http("BookingDetails")
			.put(url + "/api/Booking/Details")	
			.check(status is 200)
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer ${checkoutTokenID}")
			.body(RawFileBody("../resources/generaladmission1/0011_request.json")))


		.exec(http("ConfirmPayment")
			.post(url + "/api/Stripe/ConfirmPayment")
			.header("Content-Type", "application/json")
			.header("Authorization", "Bearer ${checkoutTokenID}"))
		.pause(r.nextInt(8))


	setUp(
		scn.inject(
			// rampUsers(200)during 2.minute))

			atOnceUsers(1)))
			.protocols(httpProtocol)
}