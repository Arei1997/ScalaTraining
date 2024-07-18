//package Week2.Wednesday
//
//import org.scalatest.FlatSpec
//
//class TwoNumbersSpec extends FlatSpec{
//
//"add" should "add numbers" in {
//  val nums = new TwoNumbers(1,2)// new instance of the class
//  assert(nums.add == 3)
//}
//
//"subtract" should "subtract numbers" in {
//  val nums = new TwoNumbers(1,2)
//  assert(nums.subtract == 1)
//}
//
//"multiply" should "multiply numbers" in{
//  val nums = new TwoNumbers(5,5)
//  assert(nums.multiply == 25)
//}
//
//"divide" should "divide numbers" in {
//  val nums = new TwoNumbers(10,2)
//  assert(nums.divide == 5)
//}
//
//"divide" should "Throw IllegalDivision when divided by 0" in {
//
//  assertThrows[IllegalArgumentException]{
//    val nums = new TwoNumbers(x = 1,y = 0).divide
//  }
//}
//
//}
