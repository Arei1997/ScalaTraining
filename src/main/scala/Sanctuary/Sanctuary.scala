package Sanctuary

object Sanctuary extends App {

  val pumbaTheWarthog = new Warthog("Pumba", 40,"Brown", true, Herbivore,true)
  val JeffTheDragonfly = new Dragonfly("Jeff", 2, true,6,5,5)
  val OscarTheOwl      = new Owl("Oscar", 30, true, 16, 7, "Brown")
  println(s"Name: ${JeffTheDragonfly.name}, Age: ${JeffTheDragonfly.age}, Can fly: ${JeffTheDragonfly.canFly}, Wing span: ${JeffTheDragonfly.wingSpan}, Number of Limbs: ${JeffTheDragonfly.numberOfLimbs}, Antennae Length: ${JeffTheDragonfly.antennaeLength}, Diet Type: ${JeffTheDragonfly.dietType}")
  println(s"Name: ${pumbaTheWarthog.name}, Age: ${pumbaTheWarthog.age}, Fur Color: ${pumbaTheWarthog.furColour}, Has Tail: ${pumbaTheWarthog.hasTail}, Diet Type: ${pumbaTheWarthog.dietType}, Has tusks: ${pumbaTheWarthog.hasTusks}")
  println(s"Name: ${OscarTheOwl.name}, Age: ${OscarTheOwl.age}, Can fly: ${OscarTheOwl.canFly}, Wing Span: ${OscarTheOwl.wingSpan}, Diet Type: ${OscarTheOwl.dietType}, Beak Length: ${OscarTheOwl.beakLength}, Diet Type: ${OscarTheOwl.dietType}")

}
