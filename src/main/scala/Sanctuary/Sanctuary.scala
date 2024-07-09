package Sanctuary

object Sanctuary extends App {

  val pumbaTheWarthog  = new Warthog(name = "Pumba", age = 40,furColour = "Brown", hasTail = true,hasTusks = true)
  val JeffTheDragonfly = new Dragonfly(name = "Jeff", age = 2, canFly = true,numberOfLimbs = 6,wingSpan = 5.0f,antennaeLength = 5)
  val OscarTheOwl      = new Owl(name = "Oscar", age = 30, canFly = true, wingSpan = 16.0f, beakLength = 7, featherColour = "Brown")

  def printAnimalDetails(animal: Printable): Unit = {
    println(animal.printableDetails)
  }

  printAnimalDetails(pumbaTheWarthog)
  printAnimalDetails(OscarTheOwl)
  printAnimalDetails(JeffTheDragonfly)
}
//pumbathewarthog is outside the sanctuary object
//println(s"Name of Pumba: ${pumbaTheWarthog.name}")

// Cant access printanimaldetails function



