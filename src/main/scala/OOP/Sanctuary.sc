// Animal Class
class Animal(val name: String, val age: Int)
//Mammal Class
class Mammal(name: String, age: Int, val furColour: String, val hasTai: Boolean) extends Animal(name, age)
//Bird Class
class Bird( name: String, age: Int, val beakLength: Double, val featherColour: String) extends Animal(name, age)
//Insect Class
class Insect( name: String, age:Int, val numOfLimbs: Int) extends Animal(name, age)

//Flying Trait
trait Flyable{
  def canFly: Boolean
  def wingSpan: Double
}




class Warthog(name: String, age: Int, furColour: String, hasTail: Boolean, val hasTusks: Boolean) extends Mammal(name, age, furColour, hasTail)
class Owl(name: String, age: Int, beakLength: Double, featherColour: String, val hootsPerNight: Int) extends Bird(name, age, beakLength, featherColour)
class Dragonfly(name: String, age: Int, numOfLimbs: Int, val wingPairs: Int) extends Insect(name, age, numOfLimbs) with Flyable {
  override def canFly: Boolean = true
  override def wingSpan: Double = 8.6
}


//Display Animals
val dragonfly = new Dragonfly("Darla", 1, 8, 2)
println(s"Name: ${dragonfly.name}, Age: ${dragonfly.age}, Num of Limbs: ${dragonfly.numOfLimbs}, Wing Pairs: ${dragonfly.wingPairs}, Can Fly: ${dragonfly.canFly}, Wing Span: ${dragonfly.wingSpan}")
