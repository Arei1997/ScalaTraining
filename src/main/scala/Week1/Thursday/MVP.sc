val list1:List[Int] = List(1 , 2 ,3,  4 , 5)
val seq1:Seq[String] = Seq("Blue", "Red" , "Orange", "Yellow")
val listMul = list1.map(number => number*3)
val noBlue = seq1.filter(_ != "Orange")

val ifOrange: Boolean = seq1.exists{names => names.contains("Orange")}

//2
val evenNums = list1.filter(_% 2 ==0)
val oddNums = list1.filter(_% 2 !=0)
// ok this is not correct
val list2 = (1 to 10).toList
val oddeven = list2.map(_% 2 ==0)

//3
val Pets: Map[String, List[String]] =Map(
  "Dog" -> List("Donald", "Alfie"),
  "Cat" -> List("meow", "meoooow"),
  "Iguana" -> List("henry", "peter"),
  "Horse" -> List("steve", "harvey"),
  "Mountain Bear" -> List("sylvester", "bron")
)
val dogs = Pets("Dog")



