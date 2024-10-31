package enum

enum class Rainbow(var id: Int) {
    RED(1),
    PURPLE(2),
    YELLOW(3),
    GREEN(4),
    BLUE(5);
}

enum class Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    fun isWeekend(): Boolean {
        return this === Week.SATURDAY || this === Week.SUNDAY
    }
}

fun main() {
    var red = Rainbow.RED
    println(red.name)
    println(red.id)


    for (i in Rainbow.values()) {
        println(i)
    }
}