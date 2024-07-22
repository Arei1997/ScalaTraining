import scala.annotation.tailrec



object Euro extends Enumeration {
  type Euro = Value

  val Germany, Spain, Italy, France, Portugal, Netherlands, England, Belgium, Croatia, Switzerland, Austria,
  Hungary, Denmark, Czechia, Serbia, Scotland, Poland, Slovakia, Albania, Romania, Finland, Turkey,
  Georgia, Slovenia = Value

  def printTeams(teams: List[Euro]): String = {
    @tailrec
    def loop(remainingTeams: List[Euro], acc: String): String = {
      remainingTeams match {
        case Nil => acc
        case head :: tail => loop(tail, if (acc.isEmpty) head.toString else acc + " , " + head.toString)
      }
    }

    loop(teams, "")
  }

  val allTeams = List(Germany, Spain, Italy, France, Portugal, Netherlands, England, Belgium, Croatia, Switzerland, Austria,
    Hungary, Denmark, Czechia, Serbia, Scotland, Poland, Slovakia, Albania, Romania, Finland, Turkey,
    Georgia, Slovenia)

  println(printTeams(allTeams))

}

object Main extends App {
  import Euro._

  val allTeams = List(Germany, Spain, Italy, France, Portugal, Netherlands, England, Belgium, Croatia, Switzerland, Austria,
    Hungary, Denmark, Czechia, Serbia, Scotland, Poland, Slovakia, Albania, Romania, Finland, Turkey,
    Georgia, Slovenia)

  // Print teams
  println(printTeams(allTeams))
}