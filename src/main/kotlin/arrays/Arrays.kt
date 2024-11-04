package arrays

fun main() {

    var integers = intArrayOf(1, 2, 3, 4)
    println(integers.joinToString())

    var doubles = doubleArrayOf(5.0, 1.0, 3.0)
    println(doubles.joinToString())

    var characters = charArrayOf('a', 'e', 'p')
    println(characters.joinToString())

    println(integers[0])
    integers[0] = 12
    println(integers.joinToString())


    var integerNumbers = IntArray(5)
    println(integerNumbers.joinToString())

    var doubleNumber = DoubleArray(6)
    println(doubleNumber.joinToString())

    doubleNumber[5] = 10.3

    var array1 = intArrayOf(1, 2, 3)
    var array2 = intArrayOf(1, 2, 3)
    var array3 = array1
    var array4 = intArrayOf(1, 3, 2)
    println(array1 == array2)
    println(array1 == array3)

    println(array1.contentEquals(array2))
    println(array1.contentEquals(array4))


    var newArray = arrayOf<Any>("item1", "item2", 12, 12.0, 'y')



}