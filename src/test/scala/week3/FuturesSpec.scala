package week3
import Week3.Friday.Futures._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.time.{Millis, Seconds , Span}

class FuturesSpec extends AnyWordSpec with Matchers with ScalaFutures {

  implicit val defaultWaitTime: PatienceConfig = PatienceConfig(timeout = Span(3,Seconds),interval=Span(500,Millis))

  "addition method" should {
    "add two ints" in {
      addition(1,2) shouldEqual 3
    }
  }

  "additionInTheFuture" should {
    "eventually return the current sum" in {
      whenReady(additionInTheFuture) {
      result => result shouldEqual 3
     }
    }
  }





}
