package Sanctuary

object Sanctuary extends App {

  val pumbaTheWarthog  = new Warthog("Pumba", 40,"Brown", true,true)
  val JeffTheDragonfly = new Dragonfly("Jeff", 2, true,6,5.0f,5)
  val OscarTheOwl      = new Owl("Oscar", 30, true, 16.0f, 7, "Brown")

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



