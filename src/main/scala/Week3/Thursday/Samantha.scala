object Samantha extends App{


case class Property(price:Int,mortgage:Int)
case class Buyer(salary:Int, deposit:Int, creditScore:Int)

  val house = Property(280000, 280000 - 20000) // Flat cost minus deposit
  val samantha = Buyer(45000,20000,577)


 def canMortgage(salary:Int,mortgage:Int):Either[String,String] = {
   val mortgageAmount = 4 * salary
   if (mortgageAmount < mortgage)  Left(s"Samantha cannot get a mortgage with a salary of £$salary. Maximum she can borrow is £$mortgageAmount.")
   else Right(s"Samantha can get a mortgage with a salary of £$salary. She can borrow up to £$mortgageAmount.")
 }


 val canMortgageCheck = canMortgage(samantha.salary,house.mortgage)
  canMortgageCheck match {
    case Left(message) => println(message)
    case Right(message) => println(message)
  }

  def eligibilityCheck (buyer: Buyer, property: Property):Either[String,String] = {
    val depositRequire = property.price * 0.1
    if (buyer.deposit < depositRequire){
      Left(s"Samantha does not meet the minimum deposit requirement of £20000. She has ${buyer.deposit}")
    }else if (buyer.creditScore <550){
      Left(s"Samantha does not meet the minimum credit score requirement of 550. She has a credit score of ${buyer.creditScore}")
    } else {
      Right("Samantha meets the requirements of a credit score and a deposit")
    }
}

  val eligibilityResult = eligibilityCheck(samantha,house)
  eligibilityResult match {
    case Left(message) => println(message)
    case Right(message) => println(message)
  }


}
