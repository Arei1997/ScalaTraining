package Sanctuary

class Owl (
  val name: String,
  val age: Int,
  val canFly: Boolean,
  val wingSpan: Float,
  val beakLength: Float,
  val featherColour: String

  ) extends Bird with DietType{
  val dietType: DietType = Herbivore
}
