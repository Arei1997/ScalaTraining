package Week1.Friday

class Animal(

              val age:Int,
              val name: String,
              val diet: String
            )

object Sanctuary extends App {

  val lion = new Mammal(5, "Simba", "Gold", true, "Carnivore")
  println(s"Animal: Name - ${lion.name}, Age - ${lion.age}, Fur Color - ${lion.furColor}, Has Tail - ${lion.hasTail}, Diet - ${lion.diet}")

//  val dog = new Mammal("Brown",true,"Carnivore")
//  println(s"Mammal: Fur Color - ${dog.furColor}, Has Tail - ${dog.hasTail}")
//
//  val spider = new Insect(8,"Omnivore")
//  println(s"Insect: Number Of Limbs - ${spider.numOfLimbs}")
//
//  val penguin = new Bird(10, "Black","Herbivore")
//  println(s"Bird: Beak Length - ${penguin.beakLength}, Feather Color - ${penguin.featherColor}")


}



