def IntManipulation(input:Int): Int = {
  val result = (input*2) +3
  result
}


val output = IntManipulation(10)
def applyTwice(x:Int => Int, y:Int): Int = {
  x(x(y))
}

val input = 5
val result = applyTwice(IntManipulation,input)


def addition(a:Double,b:Double): Double = {
  a + b
}

def multiplication(a:Double,b:Double): Double = {
  a * b
}

def division(a: Double, b:Double): Double = {
  a / b
}

def subtraction(a: Double, b:Double): Double = {
  a - b
}

def mathFunc(a:Double,b:Double,formula:(Double,Double) => Double): Double = {
  formula(a,b)
}
