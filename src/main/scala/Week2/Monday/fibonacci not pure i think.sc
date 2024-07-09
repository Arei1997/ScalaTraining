 def fibonacci(i: Int): Int = {
    if (i == 0)
      3
    else if (i == 1)
      4
    else
      fibonacci(i - 1) + fibonacci(i - 2)
  }
  def printSeq(n: Int): Unit = {
    (0 until n)
      .foreach(i => println(fibonacci(i)))
  }

printSeq(5)
 printSeq(5)

 //else statement calls itself recursively. fib(3)-fib(2) is computed again and recalculated repeatedly.

 //fibonacci(4)
 //= fibonacci(3) + fibonacci(2)
 //= (fibonacci(2) + fibonacci(1)) + (fibonacci(1) + fibonacci(0))
 //= ((fibonacci(1) + fibonacci(0)) + 4) + (4 + 3)
 //= ((4 + 3) + 4) + 7
 //= 11 + 7
 //= 18