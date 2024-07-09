case  class Person ( name: String, age: Int, nationality: String, isStudent: Boolean )

val firstPerson = new Person( "Carlos", 23, "Spanish", true)
val secondPerson = new Person( "Carlos", 23, "Spanish", true)
val thirdPerson = new Person( "Chloe", 25, "British", false)
case class Animal(name: String, Colour:String,pet:Boolean)
val cat = new Animal("cat","black",true)// Error class animal needs to be a case class, and a new constuctor is needed
val dog = new Animal("dog","white",true)

case class Muffin(flavour: String,price:Double, storeBoughtFrom:String)

val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val blueberryMuffin = Muffin ("blueberry", 3.50, "Mercator Bakery")
val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
val anotherChocolateMuffin = Muffin ("chocolate", 3.50, "Mercator Bakery")
val oneMoreChocolateMuffin = Muffin ("Chocolate", 3.50, "Mercator Bakery")
val finalChocolateMuffin = Muffin ("choocolate", 2.50, "MercatorBakery")

chocolateMuffin == blueberryMuffin
chocolateMuffin == oneMoreChocolateMuffin
chocolateMuffin == anotherChocolateMuffin //True

chocolateMuffin == oneMoreChocolateMuffin
chocolateMuffin == finalChocolateMuffin
