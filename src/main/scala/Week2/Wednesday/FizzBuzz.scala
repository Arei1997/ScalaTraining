package Week2.Wednesday


class FizzBuzzFunction {

  def FizzBuzz(n: Int): String = {
    if ( n % 3 ==0 && n %5 ==0) {
      "FizzBuzz"
    } else if (n % 3 == 0) {
      "Fizz"
    } else if (n %5 ==0){
      "Buzz"
    } else {"Meow"}
  }
}
object main extends App{
  val fizzBuzzFunction = new FizzBuzzFunction
  println(fizzBuzzFunction.FizzBuzz(-30))
}

