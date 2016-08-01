package pt.sergio.magic_index

/**
  * A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted array, write a
  * method to find a magic index, if one exists, in array A.
  */
object Solution {

  def processArray(a: Seq[Int]) = {
    a.indices.foldLeft(Vector.empty[Int]) {
      case (v, e) if a(e) == e => v :+ e
      case (v, e) => v
    }
  }
}