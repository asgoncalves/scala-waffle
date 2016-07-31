package pt.sergio.magic_index

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "solution" should "give no indexes back in an empty array" in {
    Solution.processArray(Vector()).size shouldBe 0
  }

  "solution" should "give no indices back in an array without magic indexes" in {
    Solution.processArray(Vector(1, 2, 3, 4)).size shouldBe 0
  }

  "solution" should "give 1 index back in an array with multiple values and a magic index" in {
    val r = Solution.processArray(Vector(1, 2, 2, 4))
    r.size shouldBe 1
    r should contain(2)
  }

  "solution" should "give all indexes back in an array with every element as magic index" in {
    val r = Solution.processArray(Vector(0, 1, 2, 3, 4))
    r.size shouldBe 5
    r should contain(0)
    r should contain(1)
    r should contain(2)
    r should contain(3)
    r should contain(4)
  }
}
