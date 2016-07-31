package pt.sergio.odd_word

object Solution {

  def process(sentence: String): String = {
    val a = sentence.split(" ")
    var r = Vector(): Vector[String]
    for(i: Int <- a.indices) {
      i match {
        case x if i % 2 != 0 => r = r :+ invert(a(i))
        case z if i % 2 == 0 => r = r :+ a(i)
      }
    }
    r.mkString(" ")
  }

  def invert(s: String): String = (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString

  // TODO recursive
}