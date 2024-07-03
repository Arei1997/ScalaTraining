//John from primary school maths is trying to buy as many watermelons as possible and we need to give him a reality check. John can reasonably carry 3 watermelons without a bad, and 5 with one bad.
// part 1 , 2 a b c
val watermelon: Int = 6
if (watermelon <= 3) {
  println("Does not need a bag")
} else if (watermelon > 3 && watermelon <= 5) {
  println("Needs a bag")
} else {
  println("Can't Carry them")
}

//part 3
println(s"John is trying to buy $watermelon watermelons.")
//Part4
