case class Car(make: String, Mileage: Int, Electric: Boolean)

case object Coupe

val car1 = Car(make = "Toyota", Mileage = 73743 , Electric = false)
val car2 = Car(make = "Porsche", Mileage = 18763 , Electric = true)
val car3 = Car(make = "Nissan", Mileage = 145660 , Electric = false)

val modifiedCar1 = car1.copy(Mileage = 80000)
val modifiedCar2 = car2.copy(Mileage = 18763)
val modifiedCar3 = car3.copy(Mileage = 158928)

(modifiedCar1,modifiedCar2,modifiedCar3).toString

car3 == car2
car2 == modifiedCar2
modifiedCar3 == car3

val dd = car2.canEqual(car1)
val ddd = car3.canEqual(car1)
println(dd)
