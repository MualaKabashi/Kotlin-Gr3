package list

fun main() {
    var set = setOf(1, 2, 2, 3, 4, 5)
    println(set)
    println(set.contains(1))

    var mutableSet = mutableSetOf(1, 2, 3, 4)
    mutableSet.add(123)
    println(mutableSet.joinToString("-"))


    var map = mapOf<String, Int>("Muala" to 1, "Olti" to 4, "Adonit" to 200, "Muala" to 12)
    println(map)
    println(map.values)
    println(map.keys)

    var mutableMap = mutableMapOf(1 to 12, 12 to 134)
    println(mutableMap)
    mutableMap[1] = 234
    println(mutableMap)


    //1

    println(removeStringIfShort(mutableListOf("Muala", "12","a", "Long string")))
}

fun removeStringIfShort(mutableList: MutableList<String>): MutableList<String> {
    mutableList.removeIf { it.length < 3 }
    return mutableList
}
















