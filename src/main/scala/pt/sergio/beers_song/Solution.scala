package pt.sergio.beers_song

object Solution {
  def sing() = {
    (99 to 0 by -1).foldLeft(Vector.empty[String]) {
      case (v, e) if e == 0 => v :+ "No more bottles of beer on the wall. No more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
      case (v, e) => v :+ f"$e%d bottles of beer on the wall. $e%d bottles of beer.\nTake one down, pass it around.\n${e - 1}%d bottles of beer on the wall."
    }
  }
}