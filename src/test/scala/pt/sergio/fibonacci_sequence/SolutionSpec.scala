package pt.sergio.fibonacci_sequence

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "solution" should "give 0 when the value is 0" in {
    Solution.fib(0) shouldBe 0
  }

  "alternative solution" should "give 0 when the value is 0" in {
    Solution.fibAlternative(0) shouldBe 0
  }

  "solution" should "give 1 when the value is 1" in {
    Solution.fib(1) shouldBe 1
  }

  "alternative solution" should "give 1 when the value is 1" in {
    Solution.fibAlternative(1) shouldBe 1
  }

  "solution" should "give 34 when the value is 9" in {
    Solution.fib(9) shouldBe 34
  }

  "alternative solution" should "give 34 when the value is 9" in {
    Solution.fibAlternative(9) shouldBe 34
  }

  "solution" should "give 63245986 when the value is 39" in {
    Solution.fib(39) shouldBe 63245986
  }

  "alternative solution" should "give 63245986 when the value is 39" in {
    Solution.fibAlternative(39) shouldBe 63245986
  }
}
