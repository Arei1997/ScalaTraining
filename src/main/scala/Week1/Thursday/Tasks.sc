val names = Seq("April", "Tayamul","Antony","Spencer","Bilal","Joe","Jamie","Muhammad","Roshan","Tom","Arei")
val myMap: Map[String, Int] =Map(
  "red" -> 1,
  "yellow" -> 2,
  "blue" -> 3,
  "green" -> 4,
  "green" -> 4
)
val stringSet: Set[String] = myMap.keys.toSet
val intSet: Set[Int] = myMap.values.toSet


val numbers: Seq[Int] = Seq(1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10)
val addOne: Seq[Int] = numbers.map {
  number  => number + 1
}

val removeEven: Seq[Int] = numbers.filter(
  number => (number % 2 !=0)
)


val letterR: Boolean = names.exists{names => names.contains("r")}


// a set contains UNIQUE elements and are unordered

val fruits: Seq[String] = Seq("Apple", "Cherry", "Banana" ,"Orange", "Cherry")
val removeDupe = fruits.toSet
println(removeDupe)

//Arrays

val array1:Array[Int] = Array(1,2,3)
val plusTwo: Array[Int] = array1.map{
  _ + 2
}

var x = List[Int]()
x = x :+ 1
x = x :+ 2
println(x)

val y = Seq(3, 4, 5)
val Y = y ++ Seq(6)
val YY  =Seq(2) ++ Y


