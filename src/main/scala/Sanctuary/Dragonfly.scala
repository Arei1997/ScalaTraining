package Sanctuary

class Dragonfly(
                 val name: String,
                 val age: Int,
                 val canFly: Boolean,
                 val numberOfLimbs: Int,
                 val wingSpan: Float,
                 val antennaeLength: Int
               ) extends Insect with DietType {
  val dietType: DietType = Omnivore
}
