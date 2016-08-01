package pt.sergio.equilibrium_index

/**
  * Created by sgoncalves on 30/07/16.
  */
object Solution {

  /**
    * An equilibrium index of a sequence is an index into the sequence such that the sum of elements at lower indices is
    * equal to the sum of elements at higher indices. For example, in a sequence A:
    * A[0] = -7
    * A[1] = 1
    * A[2] = 5
    * A[3] = 2
    * A[4] = -4
    * A[5] = 3
    * A[6] = 0
    *
    * 3 is an equilibrium index, because:
    *
    * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
    *
    * 6 is also an equilibrium index, because:
    *
    * A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
    * (sum of zero elements is zero)
    * 7 is not an equilibrium index, because it is not a valid index of sequence A.
    *
    * Write a function that, given a sequence, returns its equilibrium indices (if any). Assume that the sequence may be very long.
    */
  def findEquilibrium(seq: List[Int]): Vector[Int] = {
    val partialSums: List[Int] = seq.scanLeft(0)(_+_).tail
    def leftSum(i: Int): Int = if (i == 0) 0 else partialSums(i - 1)
    def rightSum(i: Int): Int = partialSums.last - partialSums(i)
    def isRandLSumEqual(i: Int): Boolean = leftSum(i) == rightSum(i)

    seq.indices.foldLeft(Vector.empty[Int]) {
      case (v, e) if isRandLSumEqual(e) => v :+ e
      case (v, e) => v
    }
  }
}
