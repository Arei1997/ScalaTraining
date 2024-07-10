/** With parentheses () */

//construct with no defined parameters

class Park1
//make object
new Park1

//construct with defined parameter
// not giving default values
class Park2( val rollerCoaster: Boolean, val largestLoop:Double)

val x = new Park2(rollerCoaster = true,largestLoop = 6.3)
x.rollerCoaster
x.largestLoop
new Park2(rollerCoaster = false,largestLoop = 26.5)


abstract class Park8{
  val coaster: Boolean
  val loop: Double
}
new Park8 {
  override val coaster: Boolean = true
  override val loop: Double = 9.9687867
}


abstract class Park10 (val coaster: Boolean){
  val loop: Double = 7.6
}
new Park10 (coaster = true) {
  override val loop: Double = 7.6
}

trait CandyFloss {
  val hasCandyFloss: Boolean
}

object Park10 extends CandyFloss{
  override val hasCandyFloss: Boolean = true
}












