//case class Person(fullName: String, dateOfBirth: String, lastCountryLivedIn: String, occupation: String, dateOfDeath:String, age: Int, starSign: String, ageAtDeath: String)
//
//
//def createPerson(fullName: String, dateOfBirth: String, lastCountryLivedIn: String, occupation: String, dateOfDeath:String, age: Int, starSign: String, ageAtDeath: String):Person = {
//
//  Person(fullName, dateOfBirth, lastCountryLivedIn, occupation, dateOfDeath, age, starSign, ageAtDeath)
//
//}
//val newPerson = createPerson(
//  fullName = "John Doe",
//  dateOfBirth = "1990-01-01",
//  lastCountryLivedIn = "USA",
//  occupation = "Software Engineer",
//  dateOfDeath = "2070-01-01",
//  age = 33,
//  starSign = "Capricorn",
//  ageAtDeath = "80 years"
//)


case class InitialPerson(
                          fullName: String,
                          dateOfBirth: String,  // Expected format: YYYY-MM-DD
                          lastCountryLivedIn: Option[String] = None,
                          occupation: Option[String] = None
                        )

case class Person(
                   fullName: String,
                   dateOfBirth: String,
                   lastCountryLivedIn: String,
                   occupation: String,
                   age: Int,
                   starSign: String,
                   dateOfDeath: String
                 )
