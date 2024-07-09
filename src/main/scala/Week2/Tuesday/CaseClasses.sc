case class Dog(name: String, breed: String, age: Int)
case class Cat(name: String, breed: String, age: Int, favoriteToy: String)
case class Bird(name: String, breed: String, age: Int, flightSpeed: Double)

//Dogs
val dog1 = Dog("Buddy", "Golden Retriever", 3)
val dog2 = Dog("Max", "German Shepherd", 5)
val dog3 = Dog("Bella", "Bulldog", 2)
val dog4 = Dog("Lucy", "Beagle", 4)

//Cats
val cat1 = Cat("Whiskers", "Siamese", 2, "Feather Wand")
val cat2 = Cat("Shadow", "Maine Coon", 4, "Laser Pointer")

//Birds
val bird1 = Bird("Tweety", "Canary", 1, 5.5)
val bird2 = Bird("Polly", "Parrot", 3, 10.0)


case class Kennel(name: String, dogs: List[Dog], cats: List[Cat], birds: List[Bird])
val myKennel = Kennel("Happy Paws Kennel", List(dog1, dog2, dog3, dog4),cats = List(cat1, cat2),birds = List(bird1, bird2)) // empty lists are needed to contain cat and bird


def addDog(kennel: Kennel, dog: Dog): Kennel = {
kennel.copy(dogs = kennel.dogs :+ dog)
}


def addCat(kennel: Kennel, cat: Cat): Kennel = {
  kennel.copy(cats = kennel.cats :+ cat)
}

def addBird(kennel: Kennel, bird: Bird):Kennel = {
  kennel.copy(birds = kennel.birds :+ bird)
}


val newDog = Dog("Rex", "Dalmatian", 2)
val updatedKennel = addDog(myKennel, newDog)
println(updatedKennel)





