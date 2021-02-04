import io.gatling.core.Predef._
import io.gatling.http.Predef._

class SimplestPossibleSimulation extends Simulation {

  val baseHttpProtocol =
    http.baseUrl("https://computer-database.gatling.io")

  val scn = scenario("JSON")
    .exec(
      http("GET")
        .get("http://jsonplaceholder.typicode.com/comments")
         .check(jsonPath("$[0].name").saveAs("commentName"))
    )

    .exec { session => 
      println(">>>>" + session("commentName").as[String] + "<<<<")
      session
    }

  setUp(
    scn.inject(atOnceUsers(1))
  )
}