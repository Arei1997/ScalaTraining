def fibonacci(i:Int): Int = {
  if (i <= 1)
      i
  else
      fibonacci(i-1)+fibonacci(i-2)
}
