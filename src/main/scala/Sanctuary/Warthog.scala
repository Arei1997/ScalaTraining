// Warthog.scala
package Sanctuary

class Warthog(
               val name: String,
               val age: Int,
               val furColour: String,
               val hasTail: Boolean,
               val hasTusks: Boolean )  extends Mammal with DietType with Printable{

    val dietType: DietType = Herbivore

    def printableDetails: String = {s"Name: $name, Age: $age, Fur Colour: $furColour, Has Tail: $hasTail, Diet Type: $dietType, Has Tusks: $hasTusks"}
}

