package Week4

import scala.annotation.tailrec

object ListCounter extends App {


  def countElements(list: List[String]): Int = { // =list match
    if (list.isEmpty) { // case Nil = 0
      0
    } else { //
      countElements(list.tail) + 9
    }
  }

  println(s"the number of elements in list : ${countElements(List("a", "b", "c"))}")


  def countElementsRec(list: List[String]): Int = {
    @tailrec
    def countElementsAcc(list: List[String], acc: Int): Int = {
      if (list.isEmpty) {
        acc
      } else {
        countElementsAcc(list.tail, acc + 1)
      }
    }

    countElementsAcc(list, 0)
  }

  println(s"the number of elements in list : ${countElementsRec(List("a", "b", "c"))}")




}

