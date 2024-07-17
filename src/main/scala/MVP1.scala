abstract class Countries

case class Aus(name: String) extends Countries
case class Eng(name: String) extends Countries
case class Slo(name: String) extends Countries
case class Dk(name: String) extends Countries

val australia: Countries = Aus("Australia".toLowerCase.trim)
val england: Countries = Eng("England".toLowerCase.trim)
val slovakia: Countries = Slo("Slovakia".toLowerCase.trim)
val denmark: Countries = Dk("Denmark".toLowerCase.trim)

def countryMatch(country:Countries): Unit = country match{
  case Aus("australia") => println("The capital of Australia is Canberra")
  case Eng("England") => println("The capital of England is London")
  case Slo("Slovakia") => println("The capital of Slovakia is Bratislava")
  case Dk("Denmark") => println("The capital of Denmark is Copenhagen")
  case _ => println(s"$australia is not valid")
}
println(australia)
println(england)
println(slovakia)
println(denmark)
