package Week3.Thursday

import sun.security.util.Password

import java.time.LocalDate

object Eithers extends App {


  //Left - error
  //Right - success

  def isEven(x: Int): Either[String, String] =
    if (x % 2 == 0) Right(s"$x is even") else Left(s"$x is odd")

  println(isEven(4))


  //custom error
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception

  case object isOddError extends NewError(400, "Bsd request in the is off method")

  def isOdd(x: Int): Either[NewError, String] =
    if (x % 2 != 0) Right(s"$x is odd") else Left(isOddError)

  println(isOdd(4))
  println(isOdd(-1))


  case class User(username: String, password: String, dateOfBirth: LocalDate)

  case class ValidatedUser(username: String, password: String, dateOfBirth: LocalDate)
  //validate the user

  def validateUsername(username: String): Either[String, String] = {
    if (username.length < 12) Left("Username must be more than 12 characters")
    else Right(username)

  }

  //validate the password
  def validatePassword(password: String): Either[String, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password) Left("password must be a mixture of both")
    else Right(password)
  }

  //validate the age

  def validateAge(dateOfBirth:LocalDate): Either[String,LocalDate] = {
    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left("user must be at least 18") else Right(dateOfBirth)
  }

  //combine
  def validateUser(user: User): Either[String,ValidatedUser] =
    for {
      username <- validateUsername(user.username)
      password <- validatePassword(user.password)
      dateOfBirth      <- validateAge(user.dateOfBirth)
      createValidateUser = ValidatedUser(username,password, dateOfBirth)

    }yield createValidateUser

  val usernameBad = User("april", "Password", LocalDate.of(1994,3,30))

  println(validateUser(usernameBad))

}


