package inheritance

open class Person(var name: String, var age: Int) {
    fun printInformation() {
        println("Person info is: $name, $age")
    }
}

class Student(name: String, age: Int, average: Double) : Person(name, age)
class Programmer(name:String, age:Int, salary:Double) : Person(name, age)

fun main() {
    var student = Student("Muala", 22, 9.8)
    student.printInformation()

    var programmer = Programmer("Muala", 22, 3543243.0)


}


