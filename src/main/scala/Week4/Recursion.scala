package Week4

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n:Int): Int = {
    if (n <= 1 ){
      1
    }else {
//      println(s"currently working on ${n-1}")
      val finalResult = n * factorial(n-1)
//      println(s"final call of $n")
      finalResult
    }
  }
  println("\n Factorial method (4) - standard rec: ")
  println(factorial(4))
  // println(factorial(400000)) - error limited memory



  //Tail Recursion - Stops stack overflow error by reusing the call stack

  def smartFactorial (n:Int):Int = {
    @tailrec
    def factorialHelper(x:Int,acc:Int):Int = {// helper method has an accumulator and other params needed during recursion
      if (x <= 1) acc
      else {
//        println(s"current X :$x")
//        println(s"current acc :$acc")
        factorialHelper(x-1,x * acc)
        // acc holds the running total
      }
    }
    factorialHelper(n,1)
  }
  println("\n factorial - tail rec (4): ")
  println(smartFactorial(4))
  println(smartFactorial(4000))


  // tail rec -> concatenatea stribng n times

  def concatenateWords(aWord:String, n:Int,acc:String):String = {

    if (n <= 0) acc
    else {
      concatenateWords(aWord, n-1, aWord+acc)
    }
  }
  println(" /n tail rec concatenate words:   ")
  println(concatenateWords("hello ",3,"WORLD"))










}
