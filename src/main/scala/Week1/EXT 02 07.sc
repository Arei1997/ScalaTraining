//1
val test = "STRING" == "string" // False due to containing different characters

//2

// Define a Map to store string to integer mappings
val stringToIntMap = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  // Add more mappings as needed
)

// Function to convert string to integer using pattern matching
def convertStringToInt(input: String): Option[Int] = {
  stringToIntMap.get(input)
}

// Example usage:
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





