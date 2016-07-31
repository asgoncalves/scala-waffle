package pt.sergio.equilibrium_index

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "solution" should "give no indexes back in an empty array" in {
    Solution.findEquilibrium(List()).size shouldBe 0
  }

  "solution" should "give no indexes back in an array without equilibrium indexes" in {
    Solution.findEquilibrium(List(1, 2, 3)).size shouldBe 0
  }

  "solution" should "give 1 index back in an array with an equilibrium index" in {
    val r = Solution.findEquilibrium(List(1, 2, 1))
    r.size shouldBe 1
    r should contain(1)
  }

  "solution" should "give multiple equilibrium indexes in an array with multiple ones" in {
    val r = Solution.findEquilibrium(List(-7, 1, 5, 2, -4, 3, 0))
    r.size shouldBe 2
    r should contain(3)
    r should contain(6)
  }
}
