//1
val test = "STRING" == "string" // False due to containing different characters

//2


val stringToIntMap = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,

)

// Function to convert string to integer using pattern matching
def convertStringToInt(input: String): Option[Int] = {
  stringToIntMap.get(input)
}


val numberString = "one"
convertStringToInt(numberString) match {
  case Some(number) => println(s"$numberString as integer is $number")
  case None => println(s"Cannot convert $numberString to integer")
}

// Convert Lowercase string to uppercase

val lowercaseString = "Hey There!"
val uppercaseString = lowercaseString.toUpperCase

val firstLetter = "abcdef"
val firstletterUpper = firstLetter.capitalize




val new = "Hello" // does not work
// new is used to initialize objects so cannot be used as a variable name
// try use newVal or backticks ``
// cant use true, false, final, def, class, while, for
