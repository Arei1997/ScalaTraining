import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExtensionSpec extends AnyFlatSpec with Matchers {
  import Extension._

  "Name validation" should "pass for valid names" in {
    Name.nameOrError("David") shouldEqual Right(Name("David"))
  }

  it should "fail for names containing numbers" in {
    Name.nameOrError("David123") shouldEqual Left(invalidNameError("Contains Numbers"))
  }

  it should "pass for names with spaces" in {
    Name.nameOrError("David Smith") shouldEqual Right(Name("David Smith"))
  }

  it should "pass for names with special characters but no numbers" in {
    Name.nameOrError("David-Smith") shouldEqual Right(Name("David-Smith"))
  }

  it should "fail for names containing both numbers and special characters" in {
    Name.nameOrError("David-Smith123") shouldEqual Left(invalidNameError("Contains Numbers"))
  }

  it should "pass for empty names" in {
    Name.nameOrError("") shouldEqual Right(Name(""))
  }

  "Postcode validation" should "pass for valid postcodes" in {
    Postcode.postcodeOrError("AB2 CD3") shouldEqual Right(Postcode("AB2 CD3"))
  }

  it should "fail for invalid postcodes" in {
    Postcode.postcodeOrError("88AA8A8A8") shouldEqual Left(invalidPostcodeError("Invalid postcode"))
  }

  it should "pass for valid postcodes with leading and trailing spaces" in {
    Postcode.postcodeOrError("AB2 CD3") shouldEqual Right(Postcode("AB2 CD3"))
  }

  it should "fail for empty postcodes" in {
    Postcode.postcodeOrError("") shouldEqual Left(invalidPostcodeError("Invalid postcode"))
  }
}
