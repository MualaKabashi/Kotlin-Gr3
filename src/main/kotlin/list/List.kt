package list

fun main() {
    var list = listOf<String>("item1", "item2")
    var newList = mutableListOf("item3", "item4")

    var array = arrayOf("Muala", "Item2")
    array[0] = "item1"

    newList[0] = "item1"

    newList.addAll(list)
    newList.add("1222")
    println(newList)


    var list1 = buildList {
        add("item12")
        add("item15")
    }
    println(list1)


    var list3 = listOf(1, 2, 3, 4)
    for (element in list3) {
        println("element: $element")
    }


    var mutableList1 = MutableList(5) { "hi" }
    println(mutableList1.joinToString("->"))
    mutableList1.removeAt(0)
    println(mutableList1.joinToString("->"))


    var firstList = listOf(1, 2, 3, 4)
    var secondList = listOf(5, 6, 7, 8, 1)

    var concatinatedList = secondList + firstList
    var combine = firstList.plus(secondList)
    println(concatinatedList)

    var replacementList = mutableListOf(66,778,88)

    var mutableList4 = mutableListOf(1, 2, 3, 4)
    val mutableList6 = mutableListOf(1, 2, 3, 4)

    mutableList4 = replacementList

}