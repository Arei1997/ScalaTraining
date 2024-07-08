class coolMethod {
  def getBigVal(input1: Int, input2: Int): String = {
    if (input1 > input2) {
      "first"
    } else if (input1 < input2) {
      "second"
    } else {
      "same"
    }
  }
}


val comparison = new coolMethod()
val test1 = comparison.getBigVal(5,5)
