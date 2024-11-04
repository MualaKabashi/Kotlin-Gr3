package list

fun main() {
    var list = listOf<String>("item1", "item2")
    var newList = mutableListOf("item3", "item4")

    newList.addAll(list)
    newList.add("1222")
    println(newList)


    var list1 = buildList {
        add("item12")
        add("item15")
    }
    println(list1)


    var list3 =  listOf(1,2,3,4)
    for (element in list3){
        println("element: $element")
    }















}