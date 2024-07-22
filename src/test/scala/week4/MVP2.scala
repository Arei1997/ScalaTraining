import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TeamTest extends AnyFlatSpec with Matchers {

  "All teams" should "be correctly initialized" in {
    Team.allTeams.length should be (24)
    Team.allTeams should contain (Team.Germany)
    Team.allTeams should contain (Team.Spain)
    Team.allTeams should contain (Team.Italy)
    Team.allTeams should contain (Team.France)

  }

  "printTeams" should "return a correctly formatted string for all teams" in {
    val result = Team.printTeams(Team.allTeams)
    result should include ("Germany")
    result should include ("Spain")
    result should include ("Italy")
    result should include ("France")
    result should include ("Portugal")
    result.split(" , ").length should be (24)
  }

  it should "handle an empty list" in {
    val result = Team.printTeams(List())
    result should be ("")
  }

  it should "handle a single team" in {
    val result = Team.printTeams(List(Team.Germany))
    result should be ("Germany")
  }

  it should "handle two teams" in {
    val result = Team.printTeams(List(Team.Germany, Team.Spain))
    result should be ("Germany , Spain")
  }


}


