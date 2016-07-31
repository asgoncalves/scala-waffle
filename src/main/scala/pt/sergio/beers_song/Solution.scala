package pt.sergio.beers_song

object Solution {
  def sing() = {
    var r: Vector[String] = Vector()
    99 to 0 by -1 foreach { n =>
      n match {
        case 0 => r = r :+ "No more bottles of beer on the wall. No more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
        case _ => r = r :+ f"$n%d bottles of beer on the wall. $n%d bottles of beer.\nTake one down, pass it around.\n${n - 1}%d bottles of beer on the wall."
      }
    }
    r
  }
}