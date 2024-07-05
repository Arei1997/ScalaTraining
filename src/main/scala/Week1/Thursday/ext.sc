val seq1: Seq[Int] = Seq(1,2,3,4,5,6,7,8,9)
val set1: Set[Int] = Set(4,8)
val filteredSeq: Seq[Int] = seq1.filter {
  number => number % 3 != 0 && !set1.contains(number)
}

val list1: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
val listFilter1 = list1.tail.tail.head
val slicing = list1.slice(2, 3)
// can also use slice?

//difference between a set and a seq: 1. seq elemnts have an order but set elements dont 2. you can append a seq but you cant with a set, you can perform actions such as unions

val set2 = Set(1,2)
val set3 = Set(1,1,2,2)
val combined = set2 == set3

// list(3,4) is same as seq(3,4) because list is a subtype of a seq so list is a specific implementation of a seq
// comparing a list and a seq cannot work even if they contain same elements as they are different data structures. logically they cant be equated as a set has no indexing and a list does
