package interfaces

interface Animal {
    var numberOfLegs: Int
    fun communicate()
    fun move()
}

class Cat(override var numberOfLegs: Int) : Animal {
    override fun communicate() {
        println("Meow")
    }

    override fun move() {
        println("Running!")
    }
}

fun main() {
    var cat =  Cat(4)
    cat.numberOfLegs = 2
    cat.move()
    cat.communicate()
}










