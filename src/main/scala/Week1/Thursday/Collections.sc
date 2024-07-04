//Sequences

val seq1: Seq[Int] = Seq(1 , 2 , 3)
val list1: List[Int] = List(1 , 2 , 3)

//Map -- key value pairs : key -> value
val map1: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3
)

val getSeqData: Int = seq1(1)
// tail gives everything but the head
val getListData: Int = list1(1)

val getMapData = map1("one")

val tripledSeq: Seq[Int] = seq1.map {
  number  => number * 3
}

val tripledList: List[Int] = list1.map {
  number  => number * 3
}

val tripledMap: Map[String, Int] = map1.mapValues(_*3).toMap

val changeKey: Map[String, Int] = map1.map {
  case (key, value) => (key + " !!", value)
}

val changeKeyAndValue: Map[String, Int] = map1.map {
  case(key, value) => (key + "  multiplied by 20", value*20)
}

//filter

val filteredSeq: Seq[Int] = seq1.filter {
  number => number > 1
}
val filteredSeq: Seq[Int] = list1.filter {
  number => number > 1
}

val filteredMap: Map[String, Int] = {
  map1.filter(number => number._2 > 1)
}

val filterNotList: List[Int] = {
  list1.filterNot(number => number >= 2)
}

//logical
// exists, boolean

val listExists: Boolean = list1.exists{
  number => number > 1
}

val mapExists: Boolean = map1.exists{
  number => number._2 >3
}

//contains, checks for a parameter
val containsSeq: Boolean = seq1.contains(2 + 2)
val containsMap: Boolean = map1.contains("two")
