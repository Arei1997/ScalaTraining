def fibonacci(i: Int): Int = {
  val f1 = 3
  val f2 = 4

  if (i == 0)
    f1
  else if (i == 1)
    f2
  else {
    val fPrev1 = fibonacci(i - 1)
    val fPrev2 = fibonacci(i - 2)
    fPrev1 + fPrev2
  }
}
def printSeq(n:Int): Seq[Int] = {
  val index = 0 until n
  index.map(i => fibonacci(i))
}
printSeq(7).foreach(println)
printSeq(7).foreach(println)