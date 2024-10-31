package interfaces

interface Vehicle {
    fun start()
    fun stop()
    var color: String
    var numberOfDoors: Int
    var numberOfWheels: Int
}

interface ElectricVehicle {
    fun charge()
    var batteryLevel: Int
    var shouldSelfNavigate: Boolean
    fun showBatterLevel(): Int
}

class Tesla : Vehicle, ElectricVehicle {
    override fun start() {
        println("STARTING!")
    }

    override fun stop() {
        println("Vehicle is stopped")
    }

    override var color: String = "Black"
    override var numberOfDoors: Int = 4
    override var numberOfWheels: Int = 4

    override fun charge() {
        batteryLevel++
        println("Charging....")
    }

    override var batteryLevel: Int = 4
    override var shouldSelfNavigate: Boolean = true

    override fun showBatterLevel(): Int {
        return batteryLevel
    }
}

fun main() {
    var tesla = Tesla()
    println("${tesla.batteryLevel}% ")
    tesla.charge()
    tesla.batteryLevel = 100
    println("${tesla.batteryLevel}% ")
}

























