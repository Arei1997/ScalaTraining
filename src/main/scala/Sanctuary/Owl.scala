package Sanctuary

class Owl (
  val name: String,
  val age: Int,
  val canFly: Boolean,
  val wingSpan: Float,
  val beakLength: Float,
  val featherColour: String

  ) extends Bird with DietType with Printable {

  val dietType: DietType = Herbivore

  def printableDetails: String = {
    s"name: $name, Age: $age, Can fly: $canFly, Wing Span: $wingSpan, Beak Length: $beakLength, Feather Colour: $featherColour, Diet Type: $dietType"
  }
}


//val tripleAge = age * 3