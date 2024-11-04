package extensionFunctions

fun main() {
    fun Int.power(): Int = this * this

    fun calculatePower(number: Int): Int = number * number
    var element = calculatePower(12)

    var number: Int = 25
    println(number.power())


    fun String.startsWithA(): Boolean = this.toUpperCase()[0] == 'A'

    var name = "Muala"
    var otherName = "Alban"
    println("----------------------------------------")
    println(name.startsWithA())
    println(otherName.startsWithA())
    println("----------------------------------------")


    fun Int.lastDigit(): Int = this % 10
    println(12.lastDigit())
    println(1256.lastDigit())
    println(1289.lastDigit())

    println("---------------------------------------")

    fun Int.findNext(): Int = this + 1

    var number1 = 2
    var number2 = 259
    println(number1.findNext())
    println(number2.findNext())
    println("---------------------------------------------")


}