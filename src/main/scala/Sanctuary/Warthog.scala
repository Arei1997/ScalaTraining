// Warthog.scala
package Sanctuary

class Warthog(
               val name: String,
               val age: Int,
               val furColour: String,
               val hasTail: Boolean,
               val dietType: DietType,
               val hasTusks: Boolean
             ) extends Mammal with DietType

