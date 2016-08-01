package pt.sergio.odd_word

object Solution {

  // TODO recursive
  def process(sentence: String): String = {
    val a = sentence.split(" ")
    a.indices.foldLeft(Vector.empty[String]) {
      case (v, e) if e % 2 != 0 => v :+ invert(a(e))
      case (v, e) => v :+ a(e)
    }.mkString(" ")
  }

  def invert(s: String): String = (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString
}