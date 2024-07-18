
val weather: String = "cold"
val season: String = "winter"


if (weather == "cold") {
  println("Take a coat")
} else if (weather == "rain"){
  println("take an umbrella")
} else {
  println("take nothing")
}

weather.toLowerCase match {
  case "cold" => println("Take a coat.")
  case "Rain" => println("take an umbrella")
  case _ => println(s"$weather is not valid")
}


//Match off int

val numOfWatermelons: Int = -6
numOfWatermelons match {
  case x if x <= 0 => println("must be more than zeo")
  // case 0 => println("must be more than 0")
  case 1 | 2 | 3 => println("John can carry these without a bag")
  case 4 | 5 => println("John needs a bag")
  case _ => println(s"$numOfWatermelons is invalid")

} // if guard

//Matching off objects
sealed trait Temperature // can only be extended within same file
object Cold extends Temperature
object Hot extends Temperature
object Mild extends Temperature

val weather: Temperature = Cold
weather match {
  case Cold => "Take a coat"
  case Hot => "Wear sun cream"
  case Mild => "Light Jacket"
  case _ => "Not valid"
}

abstract class Notification //cannot be instantiated - must be extended
case class Email(sender:String,title:String,body:String) extends Notification
case class SMS(caller:String, message:String) extends Notification
case class VoiceRecording(contactName:String, link:String) extends Notification

val notification: Notification = SMS("mum", "are you home?")
notification match {
  case Email(sender, title, body) => "Email from " + sender +"Title: " + title
  case SMS(caller, message) if caller  == "mum" => "Sms from " + caller + ", Dont ignore."
  case SMS(caller, message) => "SMS from " + caller
  case VoiceRecording(contactName, link) => "Recording from " + contactName
  case _ => "Not Valid"
}

abstract class Pizza
case class Pepperoni(sauce: String, cheese: String, topping: String) extends Pizza
case class Margherita(sauce: String, cheese: String, topping: String) extends Pizza
val pepperoni:Pizza = Pepperoni("Tomato Sauce","American Cheese","Pepperoni")
val margherita:Pizza = Margherita("Cheese Sauce","chedder","More cheese")

val pizzas  = margherita match {
  case Pepperoni(sauce, cheese, topping) => s"This Pepperoni pizza has: $sauce, $cheese, and $topping as toppings."
  case Margherita(sauce, cheese, topping) => s"This Margherita pizza has: $sauce, $cheese, and $topping as toppings."
  case _ => "Unknown pizza type"
}

