package Sanctuary

class Dragonfly(
                 val name: String,
                 val age: Int,
                 val canFly: Boolean,
                 val numberOfLimbs: Int,
                 val wingSpan: Float,
                 val antennaeLength: Int
               ) extends Insect with DietType with Printable {
  val dietType: DietType = Omnivore

  def printableDetails: String = s"Name: $name, Age: $age, Can Fly: $canFly, Wing Span: $wingSpan, Number Of Limbs:  $numberOfLimbs, Antennae Length: $antennaeLength, Diet Type: $dietType"
}
