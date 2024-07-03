val weather: String = "cold"
val season: String = "winter"

//if(weather == "cold" || season == "winter"){
//  println(s"It is $weather, " + "Take a coat or something")
//} else {Ω
//  println("yoooooo its not cold")
//}

//if (weather == "cold") {
//  println("Take a coat")
//} else if (weather == "rain"){
//  println("take an umbrella")
//} else {
//  println("take nothing")
//}
val Score: Double = 92.0
val Score1: Double = 75.5
val Score2: Double = 48.3

if (Score >= 90 ){
  println("A")
} else if (Score >= 80){
  println("B")
} else if (Score >= 70){
  println("C")
} else if (Score >= 60){
  println("D")
} else if (Score >= 50){
  println("E")
} else if (Score <= 490){
  println("F")
}

val Age:Int = -2
if (Age >= 0 && Age <= 4){
  println("U")
} else if (Age >= 4 && Age <= 8){
  println("PG")
}else if (Age >= 8 && Age <= 15){
  println("12A")
}else if (Age >= 15 && Age <= 18){
  println("15+")
}else if (Age >= 18){
  println("18+")
} else {
  println{"do you have a negative age? "}
}