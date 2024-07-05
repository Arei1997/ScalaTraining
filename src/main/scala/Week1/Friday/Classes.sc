class ThemeParkEmptyParams (val hasRollerCoasters: Boolean, val diameterOfLargestLoop: Double)

//or

class ThemeParkDefaultParams {
  val hasRollerCoasters: Boolean = true
  val diameterOfLargestLoop: Double = 30.24
}
// everything in {} belongs to that class
class ThemeParkBoth (val diameterOflargestLoop: Double){
  val HasRollerCoasters: Boolean = true
}

//objects
// keyword - new


val mercatorPark: ThemeParkEmptyParams = new ThemeParkEmptyParams(hasRollerCoasters = true, diameterOfLargestLoop = 7.95)
mercatorPark.getClass
mercatorPark.hasRollerCoasters
mercatorPark.diameterOfLargestLoop

//default params

val disneyWorld: ThemeParkDefaultParams = new ThemeParkDefaultParams
disneyWorld.diameterOfLargestLoop

  /** Parameters */
//meaningful name
// raw values or existing values can be passed in

class Hamster (age:Int, colour: String)
val orange: String = "Orange"
//Make hamster object
val BooTheHamster: Hamster = new Hamster(1, orange)

/** objects without classes */
// only need one of it
// no params
// dont use new keyword
// global

object DavidsDogs {
  val Loki: String = "Loki"
  val Tayamul: String = "Tayamul"
  val Isla: String = "Isla"
  val Bilal: String = "Bilal"

}
DavidsDogs.Loki

/** inheritence */

// use the 'extends' keyword
// declare the class we want to extend

class Bakken extends ThemeParkDefaultParams{
  override val diameterOfLargestLoop: Double = 400
  val oldestThemePark: Boolean = true
}

class Bakken extends ThemeParkEmptyParams (hasRollerCoasters = true, diameterOfLargestLoop = 99){
  val oldestThemePark: Boolean = true
}


class Person (firstName: String) {
  val surname: String = "Smith"
}

class Dad extends Person ("Steve")
class girlFriend extends Person ("Jess"){
  override val surname: String = "jones"
}

/** Traits */

//Keywoard - with
// extend multiple traits
// unimplemented members

trait Mascot {
  val nameOfMainCharacter: String
}


trait OversizedFood{
  val hugeTurkeyLeg: Boolean
}


class DisneyWorld extends ThemeParkDefaultParams with Mascot with OversizedFood
{
  override val nameOfMainCharacter: String = "Mickey"
  override val hasRollerCoasters: Boolean = false
  override val hugeTurkeyLeg: Boolean = true
}






















