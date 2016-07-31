package pt.sergio.beers_song

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "solution" should "have size 100" in {
    val r = Solution.sing()
    r.size shouldBe 100
    r.foreach(println)
  }
}
