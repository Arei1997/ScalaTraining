package Week3.Thursday


  object Extension extends App {

    case class Name(value: String)
    case class Postcode(value: String)

    case class Letter(name: Name,postcode: Postcode)

    trait genericPostageError{
      def message: String
    }

    case class invalidNameError(message:String) extends genericPostageError

    case class invalidPostcodeError(message:String) extends genericPostageError

    val letter:Either[genericPostageError,Letter] = Right(Letter(name=Name("David"),postcode = Postcode("AB2 CD3"))) // takes two parameters name and postcode

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



  }


