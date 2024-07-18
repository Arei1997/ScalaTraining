import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import Samantha._


class SamanthaTest extends AnyFunSuite with Matchers {

  test("Samantha can get a mortgage when salary is sufficient") {
    val salary = 45000
    val mortgage = 180000
    val result = canMortgage(salary, mortgage)
    result shouldEqual Right("Samantha can get a mortgage with a salary of £45000. She can borrow up to £180000.")
  }

  test("Samantha cannot get a mortgage when salary is insufficient") {
    val salary = 30000
    val mortgage = 180000
    val result = canMortgage(salary, mortgage)
    result shouldEqual Left("Samantha cannot get a mortgage with a salary of £30000. Maximum she can borrow is £120000.")
  }

  test("Samantha meets eligibility criteria with sufficient deposit and credit score") {
    val buyer = Buyer(45000, 30000, 600)
    val property = Property(280000, 260000)
    val result = eligibilityCheck(buyer, property)
    result shouldEqual Right("Samantha meets the requirements of a credit score and a deposit")
  }

  test("Samantha does not meet deposit requirement") {
    val buyer = Buyer(45000, 15000, 600)
    val property = Property(280000, 260000)
    val result = eligibilityCheck(buyer, property)
    result shouldEqual Left("Samantha does not meet the minimum deposit requirement of £20000. She has 15000")
  }

  test("Samantha does not meet credit score requirement") {
    val buyer = Buyer(45000, 30000, 500)
    val property = Property(280000, 260000)
    val result = eligibilityCheck(buyer, property)
    result shouldEqual Left("Samantha does not meet the minimum credit score requirement of 550. She has a credit score of 500")
  }

}

