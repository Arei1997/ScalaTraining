package Week2.Wednesday

class TwoNumbers(x:Int, y:Int) {


  def add():Int = {
    x + y
  }

  def subtract():Int = {
    y - x
  }

  def multiply(): Int = {
    x * y
  }

  def divide():Int = {
    require(y != 0, "Impossible division")
    x/y
  }

  def test:Int = {
    require(y != 0, "Impossible division")
    x/y
  }

}
