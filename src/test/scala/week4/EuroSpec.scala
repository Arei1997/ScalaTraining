import week4._

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EuroSpec extends AnyFlatSpec with Matchers {

  "printTeams" should "return an empty string for an empty list" in {
    Euro.printTeams(List.empty) shouldEqual ""
  }

  it should "return a single team name for a list with one team" in {
    Euro.printTeams(List(Euro.Germany)) shouldEqual "Germany"
  }

  it should "return a comma-separated string for a list of teams" in {
    Euro.printTeams(List(Euro.Germany, Euro.Spain, Euro.Italy)) shouldEqual "Germany , Spain , Italy"
  }

  it should "return correctly formatted string for all teams" in {
    val allTeams = List(Euro.Germany, Euro.Spain, Euro.Italy, Euro.France, Euro.Portugal, Euro.Netherlands, Euro.England, Euro.Belgium,
      Euro.Croatia, Euro.Switzerland, Euro.Austria, Euro.Hungary, Euro.Denmark, Euro.Czechia, Euro.Serbia,
      Euro.Scotland, Euro.Poland, Euro.Slovakia, Euro.Albania, Euro.Romania, Euro.Finland, Euro.Turkey,
      Euro.Georgia, Euro.Slovenia)
    Euro.printTeams(allTeams) shouldEqual "Germany , Spain , Italy , France , Portugal , Netherlands , England , Belgium , Croatia , Switzerland , Austria , Hungary , Denmark , Czechia , Serbia , Scotland , Poland , Slovakia , Albania , Romania , Finland , Turkey , Georgia , Slovenia"
  }
}
