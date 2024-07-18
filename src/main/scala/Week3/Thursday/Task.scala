package Week3.Thursday

object Task extends App {
  val names = List("tom", "james", "amy", "dscfjsdfld")

  def capNames(names: List[String]): List[String] = {
    for (name <- names) yield name.toUpperCase
  }

  println(capNames(names))
}
