package pt.sergio.collections

object Solution {

  /**
    * Find last element of the list
    * @param l the list to evaluate
    * @tparam A the type of the elements in the list
    * @return the last element of the list
    */
  def getLastElement[A](l: List[A]): A = l.last

  /**
    * Find last element of the list recursively
 *
    * @param l the list to evaluate
    * @tparam A the type of the elements in the list
    * @return the last element of the list
    */
  def getLastElementRecursive[A](l: List[A]): A = l match {
    case last :: Nil => last
    case _ :: tail => getLastElementRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  /**
    * Find the last but one element of the list
    * @param l the list to evaluate
    * @tparam A the type of the elements in the list
    * @return the penultimate element of the list
    */
  def getBeforeLastElement[A](l: List[A]): A = l.init.last

  /**
    * Find the last but one element of the list recursively
    * @param l the list to evaluate
    * @tparam A the type of the elements in the list
    * @return the penultimate element of the list
    */
  def getBeforeLastElementRecursive[A](l: List[A]): A = l match {
    case blast :: last :: Nil => blast
    case _ :: tail => getBeforeLastElementRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def getLastNthElement[A](n: Int, l: List[A]): A = n match {
      case x if x < 0 => throw new IllegalArgumentException
      case y if y > l.size => throw new IllegalArgumentException
      case _ => l.takeRight(n).head
    }

  def getNthElement[A](n: Int, l: List[A]): A = n match {
    case x if x < 0 => throw new IllegalArgumentException
    case y if y > l.size => throw new NoSuchElementException
    case _ => l(n)
  }

  def getNthElementRecursive[A](n: Int, l: List[A]): A = (n, l) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => getNthElementRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}