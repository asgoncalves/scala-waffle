object Solution extends App {
  99 to 0 by -1 foreach{ n =>
    n match {
      case 0 => println("No more bottles of beer on the wall. No more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.")
      case _ => println(f"$n%d bottles of beer on the wall. $n%d bottles of beer.\nTake one down, pass it around.\n${n - 1}%d bottles of beer on the wall.\n")
    }
  }
}