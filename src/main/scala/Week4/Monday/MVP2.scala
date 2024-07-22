import Euro.Euro

import scala.annotation.tailrec

sealed class Team(val name: String)

object Team {
  case object Germany extends Team("Germany")

  case object Spain extends Team("Spain")

  case object Italy extends Team("Italy")

  case object France extends Team("France")

  case object Portugal extends Team("Portugal")

  case object Netherlands extends Team("Netherlands")

  case object England extends Team("England")

  case object Belgium extends Team("Belgium")

  case object Croatia extends Team("Croatia")

  case object Switzerland extends Team("Switzerland")

  case object Austria extends Team("Austria")

  case object Hungary extends Team("Hungary")

  case object Denmark extends Team("Denmark")

  case object Czechia extends Team("Czechia")

  case object Serbia extends Team("Serbia")

  case object Scotland extends Team("Scotland")

  case object Poland extends Team("Poland")

  case object Slovakia extends Team("Slovakia")

  case object Albania extends Team("Albania")

  case object Romania extends Team("Romania")

  case object Finland extends Team("Finland")

  case object Turkey extends Team("Turkey")

  case object Georgia extends Team("Georgia")

  case object Slovenia extends Team("Slovenia")

  val allTeams: List[Team] = List(Germany, Spain, Italy, France, Portugal, Netherlands, England, Belgium, Croatia, Switzerland, Austria,
    Hungary, Denmark, Czechia, Serbia, Scotland, Poland, Slovakia, Albania, Romania, Finland, Turkey,
    Georgia, Slovenia)

  def printTeams(Team: List[Team]): String = {
    @tailrec
    def loop(remainingTeams: List[Team], acc: String): String = {
      remainingTeams match {
        case Nil => acc
        case head :: tail => loop(tail, if (acc.isEmpty) head.toString else acc + " , " + head.toString)
      }
    }

    loop(Team, "")
  }
}