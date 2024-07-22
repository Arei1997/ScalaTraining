object Extension extends App {

  case class Name(value: String)
  case class Postcode(value: String)
  case class Letter(name: Name,postcode: Postcode)

  trait genericPostageError{
    def message: String
  }

  case class invalidNameError(message:String) extends genericPostageError

  case class invalidPostcodeError(message:String) extends genericPostageError


  // sample data
  val letter:Either[genericPostageError,Letter] = Right(Letter(name=Name("David"),postcode = Postcode("AB2 CD3")))
  val invalidLetter:Either[genericPostageError,Letter] = Left(invalidNameError("Invalid Name Given"))
  val invalidPostcode: Either[genericPostageError, Letter] = Left(invalidPostcodeError("Invalid Postcode Given"))
  val validPostcodeLetter: Either[genericPostageError, Letter] = Right(Letter(name = Name("Alice"), postcode = Postcode("VALID123")))


  letter match {
    case Right(x) => println(s"Letter: Name = ${x.name.value}, Postcode = ${x.postcode.value}")
    case Left(y) => println(s"Error: ${y.message}")
  }

  invalidLetter match {
    case Right(x) => println(s"Letter: Name = ${x.name.value}, Postcode = ${x.postcode.value}")
    case Left(y) => println(s"Error: ${y.message}")
  }

  invalidPostcode match {
    case Right(x) => println(s"Letter: Name = ${x.name.value}, Postcode = ${x.postcode.value}")
    case Left(y) => println(s"Error: ${y.message}")
  }

  validPostcodeLetter match {
    case Right(x) => println(s"Letter: Name = ${x.name.value}, Postcode = ${x.postcode.value}")
    case Left(y) => println(s"Error: ${y.message}")
  }

object Postcode {
  def postcodeOrError(maybePostCode:String):Either[invalidPostcodeError,Postcode] = {
    val parts = maybePostCode.trim.split(" ")


    if (parts.length == 2) {
      Right(Postcode(maybePostCode))
    }else {
      Left(invalidPostcodeError("Invalid postcode"))
    }
  }
}


  object Name {
    def nameOrError(maybeName:String):Either[invalidNameError,Name] ={
      val digitCheck = ".*\\d.*".r
      maybeName match{
        case digitCheck() => Left(invalidNameError("Contains Numbers"))
        case _ => Right(Name(maybeName))
      }
    }
  }

}
