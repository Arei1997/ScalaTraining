import Week1.Friday.{Insect, Mammal}

class Animal(val age:Int, val name: String)

object Animal extends App {

  val Lion = new Animal(5,"David")
  println(s"Animal: Name: ${Lion.name} || Age: ${Lion.age}")

  val dog = new Mammal(furColor = "Brown", hasTail = true)
  println(s"Mammal: Fur Color - ${dog.furColor}, Has Tail - ${dog.hasTail}")

  val spider = new Insect(numOfLimbs = 8)
  println(s"Insect: Number Of Limbs - ${spider.numOfLimbs}")

}
Animal.dog