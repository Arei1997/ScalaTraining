/**  funcgtions and methods*/

//anonymous function
(number:Int) => number +1
// named function
val addition=(number:Int) => number +1

//Method
def addition:Int => Int = (number:Int) => number +1

//Ovverride method
def addition: Int => Int = (number:Int) => number +10

def makeTea(sugars:Int): String ={
  s"you made tea with $sugars sugar"
}

makeTea(9)

//VAT
val vat: Double = 1.2
def priceWithVAT(price:Double): Double = {
  price * vat
}
priceWithVAT(5.0)

class Number(num:Int) {
  def addition(x:Int): Int = {
    num + x
  }
}
val newNumberClass =  new Number(10).addition((5))
//val classAddition = newNumberClass.addition(2)



//pure
val sentence1: String = ""
def append(sentence:String, word:String): String = {
  sentence + "" + word.trim
}
val a = append(sentence1, "meow")
val b = append(sentence1, "meow")

//impure
var sentence: String = ""
def cat(word:String): String = {
  sentence = sentence + " " + word
  sentence.trim
}
val g = cat("meow")
val h = cat("meoeffwefw")
