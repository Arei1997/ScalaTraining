//Finite sets of data

/** Native */
object Weekday extends Enumeration {

  val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value

}
Weekday.Monday.toString

object WeekDay1 extends Enumeration {
  val Monday = Value("Mon")
  val Tuesday = Value("Tue")
  val Wednesday = Value("Wed")
  val Thursday = Value("Thu")
  val Friday = Value("Fri")
  val Saturday = Value("Sat")
  val Sunday = Value("Sun")
}

// Useful for acronmyms or long nmes
object BetterWeekday extends Enumeration{
  val Monday = Value(1)
  val Tuesday = Value(2)
  val Wednesday = Value(3)
  val Thursday = Value(4)
  val Friday = Value(5)
  val Saturday = Value(6)
  val Sunday = Value(0)
}
BetterWeekday.Saturday
BetterWeekday.values
Weekday.Monday < Weekday.Sunday

//def exhaustiveMatch(weekday:BetterWeekday.Value):String = {
//  weekday match {
//    case WeekDay1.Monday => "Mon"
//    case WeekDay1.Tuesday => "Tue"
//    case WeekDay1.Wednesday => "Wed"
//    case WeekDay1.Thursday => "Thur"
//    case WeekDay1.Friday => "Fri"
//    case WeekDay1.Saturday => "Sat"
//    case WeekDay1.Sunday => "Sun"
//  }
//}
//
//def nonExhaustiveMatch(weekday:WeekDay1.Value):String = {
//  weekday match {
//    case WeekDay1.Monday => "Mon"
//    case WeekDay1.Tuesday => "Tue"
//  }
//}

/** sealed case objects */
 sealed trait Weekday
case object Monday extends Weekday
case object Tuesday extends Weekday
case object Wednesday extends Weekday
case object Thursday extends Weekday
case object Friday extends Weekday
case object Saturday extends Weekday
case object Sunday extends Weekday

def caseObjectMatch(weekday2: Weekday):String = {
  weekday2 match {
    case Monday => "ewfffeefew"
    case Tuesday => "wwwwww"
    case Wednesday => "546tyrg45rfgtvfbrtb"
    case Thursday => "fgerf"
    case Friday => "refghwrlgfw"
    case Saturday => "euaaa"
    case Sunday => "nyaa"
  }
}
//must be exhaustive

abstract class Error (name: String, errorCode:Int)
case object WeekdayNotFound extends Error("Weekday not found", 404)


object Cars extends Enumeration {
  val Toyota = Value("Toyota")
  val Honda = Value("Honda")
  val Ford = Value("Ford")
  val Chevrolet = Value("Chevrolet")
  val BMW = Value("BMW")
  val Mercedes = Value("Mercedes")
}
Cars.values.foreach(Cars=>println(Cars))
sealed trait Makes

case object Toyota extends Makes
case object Honda extends Makes
case object Ford extends Makes
case object Chevrolet extends Makes
case object BMW extends Makes
case object Mercedes extends Makes

def caseObject(makes: Makes):String = {
  makes match {
    case Toyota => "D"
    case Honda => "a"
    case Ford => "ee"
    case Chevrolet => "Fefwe"
    case BMW => "efwefwe"
    case Mercedes => "Fewfwe"
  }

}















