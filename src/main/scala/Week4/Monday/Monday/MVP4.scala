package Week4.Monday.Monday

import scala.annotation.tailrec

object MVP4 extends App{

  def Sum(n:Int):Int = {
    @tailrec
    def sumHelper(x:Int,acc:Int) : Int = {
      if (x <= 0) acc
      else sumHelper(x-1, x+acc)
    }
    sumHelper(n,0)// n goes into x and 0 is the acc value. n ==> x , if n = 5 , then pass to x =5 etc
  }

  val number = -6
  println(Sum(number))

}
