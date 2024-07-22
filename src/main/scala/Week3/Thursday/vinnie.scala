object Extension extends App {

  case class Name(value: String)

  case class Postcode(value: String)

  case class Letter(name: Name, postcode: Postcode)

  trait genericPostageError {
    def message: String
  }

  case class invalidNameError(message: String) extends genericPostageError

  case class invalidPostcodeError(message: String) extends genericPostageError


  object Postcode {
    def postcodeOrError(maybePostCode: String): Either[invalidPostcodeError, Postcode] = {
      val parts = maybePostCode.trim.split(" ")


      if (parts.length == 2) {
        Right(Postcode(maybePostCode))
      } else {
        Left(invalidPostcodeError("Invalid postcode"))
      }
    }
  }


  object Name {
    def nameOrError(maybeName: String): Either[invalidNameError, Name] = {
      val digitCheck = ".*\\d.*".r
      maybeName match {
        case digitCheck() => Left(invalidNameError("Contains Numbers"))
        case _ => Right(Name(maybeName))
      }
    }
  }

}

object Letter {
  def nameOrError(name:Name,postcode: Postcode): Either[genericPostageError, Letter] = {
    for {
      name<- Name.nameOrError(nameStr)
  }

}
}

