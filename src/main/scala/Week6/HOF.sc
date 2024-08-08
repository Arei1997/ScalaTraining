val addition: (Int,Int) =>Int = (x,y) => x + y
addition(2,3)

val functionList = List(
  (a:Int, b:Int) => a + b,
  (a:Int, b:Int) => a * b,
  (a:Int, b:Int) => a - b
)

functionList.head(1,2)
functionList(1)(1,2)
functionList.tail(1)


def manipulateNumbers (x:Int,y:Int,function:(Int,Int)=>Int): Int = {
  function(x,y)
}
manipulateNumbers(1,2,addition)

def createAdditionFunction(x:Int):Int => Int = {
  (y:Int) => x + y
}
createAdditionFunction(1)
val addition: Int  => Int = createAdditionFunction(1)
//addOne(2)



def firstHOF(x:Int,function:Int => Int):Int = {
  function(x)
}

def addTwo(n:Int):Int = n + 2
firstHOF(3,addTwo)
def square(n:Int): Int = n*n
firstHOF(3,square)

def processTheList(list1:List[String], function:String => String): List[String] = {
list1.map(function)
}

def addS(word:String): String = word +"s"
def upperCase(word:String):String = word.toUpperCase
val newList: List[String] = List("apple","banana","pear","mango")
processTheList(newList,addS)
processTheList(newList,upperCase)

val numbers = Seq(1,2,3,4,5)
val doubleNumbers = numbers.map(num => num*2)




//foldLeft= reduce a collection to a single value
val foldLeftExample = numbers.foldLeft(0)(_+_)
val stringList = List("we","Love","scala")
val  concatenatedString = stringList.foldLeft("")(_+""+_).trim

case class Male (male:Boolean)
case class Animal(name:String, male:Male)
val animalList = List(Animal("fred to Fox", Male(true)),Animal("sally the seahorse",Male(false)),
  Animal("Lucky the lion",Male(true)))

val foldAnimalLeft = animalList.foldLeft(List[String]()) { (acc,animal)=>
  val sirOrMadam = animal.male match{
    case Male(true)=> "sir"
    case Male(false)=> "madam"

  }
  acc :+ s"$sirOrMadam ${animal.name}"
}

val productOfNumbers = numbers.foldLeft(1)(_ * _)
println(productOfNumbers)

val evenNumbers = numbers.filter(_ % 2 == 0)
println(evenNumbers)


/** returning functions */
def smallRise(salary:Double): (Int,Double) => Double = {
  (lengthOfEmployment:Int ,salary:Double ) => salary * 1.1
}
def mediumRise(salary:Double): (Int,Double) => Double = {
  (lengthOfEmployment:Int ,salary:Double ) => salary * 1.2
}
def largeRise(salary:Double): (Int,Double) => Double = {
  (lengthOfEmployment:Int ,salary:Double ) => salary * 1.5
}

case class Employee(name:String, salary:Double, lengthOfEmployment:Int)
def getPayRise ( employee:Employee): (Int,Double) => Double = {
  employee.lengthOfEmployment match {
    case year if year <= 3 => smallRise(employee.salary)
    case year if year <= 5 => mediumRise(employee.salary)
    case year if year > 5 => largeRise(employee.salary)

  }
}

val Amanda = Employee("Amanda",30000.0,2)
val choosePayRise = getPayRise(Amanda)
val getNewSalary = choosePayRise(Amanda.lengthOfEmployment,Amanda.salary)