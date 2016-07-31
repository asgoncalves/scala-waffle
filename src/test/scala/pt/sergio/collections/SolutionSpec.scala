package pt.sergio.collections

import java.util.NoSuchElementException

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "getLastElement" should "throw NoSuchElementException when the list is empty" in {
    an [NoSuchElementException] should be thrownBy Solution.getLastElement(List(): List[Int])
  }

  "getLastElement" should "give the correct last element" in {
    Solution.getLastElement(List(1,2,3,4)) shouldBe 4
  }

  "getLastElementRecursive" should "throw NoSuchElementException when the list is empty" in {
    an [NoSuchElementException] should be thrownBy Solution.getLastElementRecursive(List(): List[Int])
  }

  "getLastElementRecursive" should "give the correct last element" in {
    Solution.getLastElementRecursive(List(1,2,3,4)) shouldBe 4
  }

  "getBeforeLastElement" should "throw NoSuchElementException when the list is empty" in {
    an [UnsupportedOperationException] should be thrownBy Solution.getBeforeLastElement(List(): List[Int])
  }

  "getBeforeLastElement" should "give the correct before last element" in {
    Solution.getBeforeLastElement(List(1,2,3,4)) shouldBe 3
  }

  "getBeforeLastElementRecursively" should "throw NoSuchElementException when the list is empty" in {
    an [NoSuchElementException] should be thrownBy Solution.getBeforeLastElementRecursive(List(): List[Int])
  }

  "getBeforeLastElementRecursively" should "give the correct before last last element" in {
    Solution.getBeforeLastElementRecursive(List(1,2,3,4)) shouldBe 3
  }

  "getLastNthElement" should "throw IllegalArgumentException when n is negative" in {
    an [IllegalArgumentException] should be thrownBy Solution.getLastNthElement(-1, List(1,2,3): List[Int])
  }

  "getLastNthElement" should "throw IllegalArgumentException when n bigger than the list size" in {
    an [IllegalArgumentException] should be thrownBy Solution.getLastNthElement(4, List(1,2,3): List[Int])
  }

  "getLastNthElement" should "give the correct nth element" in {
    Solution.getLastNthElement(4, List(1,2,3,4,5,6,7,8,9,10)) shouldBe 7
  }

  "getLastNthElement" should "give the correct before last last element" in {
    Solution.getBeforeLastElementRecursive(List(1,2,3,4)) shouldBe 3
  }

}
