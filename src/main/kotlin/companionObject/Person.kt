package companionObject

class Person {
    companion object {
        var hasIdentity: Boolean = true
        fun breath() {
            var oxygen = 0
            oxygen += 1
            println("Oxygen level is $oxygen")
        }
    }
}

fun main() {
    println(Person.hasIdentity)
    Person.breath()
}