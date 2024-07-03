//John from primary school maths is trying to buy as many watermelons as possible and we need to give him a reality check. John can reasonably carry 3 watermelons without a bad, and 5 with one bad.
// part 1 , 2 a b c
//Variables
val watermelon: Int = 10001
val cost: Double = 1.397


if (watermelon <= 3) {
  println(s"Does not need a bag as he has $watermelon watermelons")
} else if (watermelon <= 5) {
  println(s"John Needs a bag as he has $watermelon watermelons")
} else {
  println(s"Can't Carry $watermelon watermelons")
}

//part 3

//Part4
val hasBag: Boolean = true
if (hasBag) {
  if (watermelon <= 5) {
    println(s"John can buy $watermelon watermelons with a bag")
  } else {
    println(s"John cant carry $watermelon watermelon even if he has a bag")
  }
} else {
  if (watermelon <= 3 ) {
    println(s"John can buy $watermelon watermelons without a bag")
  } else{
    println(s"John cant buy $watermelon watermelons without a bag")
  }
}

//Part 6


println(f"The total cost for johns purchase to 2 decimal places is £${watermelon * cost}%.3f ")
