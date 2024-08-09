def ToUpperCase(input: String): String = {
  input.toUpperCase
}


def ToLowerCase(input: String): String = {
  input.toLowerCase
}


def convertString(UpperCaseString: Boolean, input: String): String = {
  if (UpperCaseString) {
    ToUpperCase(input)
  } else {
    ToLowerCase(input)
  }
}
////////////////////////////////////////////////

def add(a: Double, b: Double): Double = {
  a + b}
def subtract(a: Double, b: Double): Double = {
  a - b}
def multiply(a: Double, b: Double): Double = {
a * b}
def divide(a: Double, b: Double): Double ={
  a / b}

def calculate(function:String,a:Double, b:Double): Double = {
  function match{
    case "add"
    case "subtract"
    case "divide"
    case "multiply"
    case _ =>

  }
