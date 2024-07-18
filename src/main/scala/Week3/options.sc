trait Pizza {

  val size: Int
  val crust: Option[String]

}

object Personal extends Pizza{

  val size:Int = 7
  val crust: Option[String] = None

}

object smallClassic extends Pizza{
  val size: Int = 9
  val crust: Option[String] = Some("classic")
}

object smallItalian extends Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("Italian")

}

val pizzaOrder:Pizza = new Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("Italian")
}

def whatCrust(pizza:Pizza):String ={
  pizza.crust match {
    case Some("classic") => "classic crust"
    case Some("Italian") => "italian crust"
    case Some(x)=> s"$x is not a valid crust type"
    case None => "Default crust"
  }
}
whatCrust(pizzaOrder)
//.get
val getCrust:String = pizzaOrder.crust.get
//.getOrEse
val getOrElseCrust:String = pizzaOrder.crust.getOrElse("classic")





case class ChocolateBar(filling: Option[String])

val hazelnutChocolate = ChocolateBar(Some("Hazelnut"))
val plainChocolate = ChocolateBar(None)


def whatFilling(chocolateBar:ChocolateBar, optionalFilling:String):String ={
chocolateBar.filling.getOrElse(optionalFilling)

}
println(s"Plain Chocolate Filling: ${whatFilling(plainChocolate)}")