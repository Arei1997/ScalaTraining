package Week4.Monday

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MVP3Spec extends AnyFlatSpec with Matchers {

  "isEven" should "return Right(false) for index 0" in {
    MVP3.isEven(0) should be (Right(false))
  }

  it should "return Right(true) for index 1" in {
    MVP3.isEven(1) should be (Right(true))
  }

  it should "return Right(true) for index 19" in {
    MVP3.isEven(19) should be (Right(true))
  }

  it should "return Left(\"Index is out of bounds\") for index 20" in {
    MVP3.isEven(20) should be (Left("Index is out of bounds"))
  }

  it should "return Left(\"Index is negative\") for index -1" in {
    MVP3.isEven(-1) should be (Left("Index is negative"))
  }

  it should "return Right(true) for index 9" in {
    MVP3.isEven(9) should be (Right(true))
  }

  it should "return Right(false) for index 10" in {
    MVP3.isEven(10) should be (Right(false))
  }

  it should "return Right(false) for index 4" in {
    MVP3.isEven(4) should be (Right(false))
  }

  it should "return Right(true) for index 3" in {
    MVP3.isEven(3) should be (Right(true))
  }

  it should "return Right(false) for index 18" in {
    MVP3.isEven(18) should be (Right(false))
  }
}

