package inheritance

open class Animal {
    var name: String = ""
    var type: String = ""

    constructor(name:String, type:String){
        this.name = name
        this.type = type
    }
}

class Cat(name:String, type:String) :Animal(name, type)


fun main() {
    var animal = Animal("kobe", "dog")
    var cat = Cat("moki", "persian")
}