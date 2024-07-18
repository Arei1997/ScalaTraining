//
////abstract class Animal(val name: String, val age: Int)
////
////case class Bird(override val name: String, override val age: Int) extends Animal(name, age)
////case class Fish(override val name: String, override val age: Int) extends Animal(name, age)
////case class Mammal(override val name: String, override val age: Int) extends Animal(name, age)
////case class Reptile(override val name: String, override val age: Int) extends Animal(name, age)
//
//
//val eagle: Bird = Bird("Ben", 10)
//val salmon: Fish = Fish("Sally", 3)
//val tiger: Mammal = Mammal("Tanya", 5)
//val python: Reptile = Reptile("Paul", 7)
//
//val Animals = List[Bird,Fish,Mammal,Reptile]

sealed trait Animal

case class Bird(name: String, age: Int) extends Animal
case class Fish(name: String, age: Int) extends Animal
case class Mammal(name: String, age: Int) extends Animal

val fish:Animal = Fish("Nemo",900)
val bird:Animal = Bird("Barry",8)

def describeAnimal(animal: Animal): String = animal match {
  case Bird(name, age) => s"The bird is called $name and its age is $age"
  case Fish(name, age) => s"The fish is called $name and its age is $age"
  case Mammal(name, age) => "Just a mammal"

}

println(describeAnimal((fish)))
println(describeAnimal((bird)))