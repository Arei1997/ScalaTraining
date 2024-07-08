// Animal Class
 abstract class Animal(val name: String, val age: Int, val dietType: String)
//Mammal Class
class Mammal(name: String, age: Int, val furColour: String, val hasTai: Boolean, dietType: String) extends Animal(name, age,dietType)
//Bird Class
class Bird(name: String, age: Int, val beakLength: Double, val featherColour: String, dietType: String) extends Animal(name, age,dietType)
// Insect Class
class Insect( name: String, age:Int, val numOfLimbs: Int, dietType: String) extends Animal(name, age,dietType)
//Diet sealed trait
sealed trait Diet
case object Herbivore extends Diet
case object Carnivore extends Diet
case object Omnivore extends Diet



//Flying Trait
trait Flyable{
  def canFly: Boolean
  def wingSpan: Double
}

//make the animals into classes??
class Warthog(name: String, age: Int, furColour: String, hasTail: Boolean, val hasTusks: Boolean, dietType: String) extends Mammal(name, age, furColour, hasTail,dietType)
class Owl(name: String, age: Int, beakLength: Double, featherColour: String, val hootsPerNight: Int, dietType: String) extends Bird(name, age, beakLength, featherColour,dietType)
class Dragonfly(name: String, age: Int, numOfLimbs: Int, val wingPairs: Int, dietType: String) extends Insect(name, age, numOfLimbs,dietType) with Flyable {
  override def canFly: Boolean = true
  override def wingSpan: Double = 8.6
}


//Display Animals
val dragonfly = new Dragonfly("Spark", 1, 8, 2,"Herbivore")
println(s"Name: ${dragonfly.name}, Age: ${dragonfly.age}, Num of Limbs: ${dragonfly.numOfLimbs}, Wing Pairs: ${dragonfly.wingPairs}, Can Fly: ${dragonfly.canFly}, Wing Span: ${dragonfly.wingSpan}, Diet: ${dragonfly.dietType}")

val warthog = new Warthog("Jack", 6, "Brown", true, false,"Omnivore")
println(s"Name: ${warthog.name}, Age: ${warthog.age}, Fur Color: ${warthog.furColour}, Has husks: ${warthog.hasTusks}, Has Tail: ${warthog.hasTai}")

val owl = new Owl("Bert", 25, 12.8, "Yellow", 50,"Carnivore")
println(s"Name: ${owl.name}, Age: ${owl.age},Feather Color: ${owl.featherColour}, Beak Length: ${owl.beakLength}, Hoots per night: ${owl.hootsPerNight}")
warthog.furColour
//Sanctuary Object
object Sanctuary{
  
}