package pt.sergio.odd_word

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "solution" should "be empty if original string is empty" in {
    Solution.process("") shouldBe ""
  }

  "solution" should "same word if original string only has one word" in {
    Solution.process("foo") shouldBe "foo"
  }

  "solution" should "invert second word in a two word sentence" in {
    Solution.process("foo bar") shouldBe "foo rab"
  }

  "solution" should "invert second and forth word in a 4 word sentence" in {
    Solution.process("foo bar foobar foobar") shouldBe "foo rab foobar raboof"
  }
}
