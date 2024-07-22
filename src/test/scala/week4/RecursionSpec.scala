package week4

import Week4._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RecursionSpec extends AnyWordSpec with Matchers{

  "concatenateWords" should {
    "return the acc if n is negative" in {
      val methodCall = Recursion.concatenateWords("hello",-1,"")
      val expectedResult = ""
      methodCall shouldEqual expectedResult
    }
    "returns the acc if n is 0" in {
      Recursion.concatenateWords("hello ", 0 , "") shouldBe ""
    }
    "return qa soncatenated string of 'hello' 3 times if n is 3" in {
      Recursion.concatenateWords("hello ", 3,"") shouldEqual "hello hello hello "
    }
    "concatenate and empty string" in {
      Recursion.concatenateWords("", 3, "") shouldEqual ""
    }

  }

}
