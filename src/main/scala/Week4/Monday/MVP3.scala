package Week4.Monday

import scala.annotation.tailrec

object MVP3 {

  val numbers: List[Int] = (1 to 20).toList


  def isEven(index: Int): Either[String, Boolean] = {
    @tailrec
    def loop(numList: List[Int], currentIndex: Int): Either[String, Boolean] = {
      if (numList.isEmpty) {
        Left("Index is out of bounds")
      } else if (currentIndex < 0) {
        Left("Index is negative")
      } else if (currentIndex == 0) {
        Right(numList.head % 2 == 0)
      } else {
        loop(numList.tail, currentIndex - 1)
      }
    }

    loop(numbers, index)

  }
}