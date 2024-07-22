package Week3.Friday

import java.util.concurrent.TimeUnit

import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, Future, ExecutionContext}
import ExecutionContext.Implicits.global


object Futures extends App {

  // act as a placeholder
  def addition(x:Int, y:Int):Int = {
    Thread.sleep(1000) // long time in computation
    x + y
  }

  def additionInTheFuture: Future [Int]  = Future {
    addition(1,2)
  }

  val waitTime: FiniteDuration = Duration(5,TimeUnit.SECONDS)
  println(Await.result(additionInTheFuture,waitTime))


}
