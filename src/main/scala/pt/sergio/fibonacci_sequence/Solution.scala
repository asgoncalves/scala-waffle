package pt.sergio.fibonacci_sequence

import scala.annotation.tailrec

object Solution extends App {
  def fib(i:Int):Int = i match{
    case 0 => 0
    case 1 => 1
    case _ => fib(i-1) + fib(i-2)
  }

  def fibAlternative(i:Int): Double = {
    @tailrec
    def fibHelper(n:Int, a:Double, b:Double): Double ={
      n match {
        case 0 => 0
        case 1 => a
        case _ => fibHelper(n-1, b, a+b)
      }
    }
    fibHelper(i,1,1)
  }
}