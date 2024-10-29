package inheritance

fun main() {
    //not allowed
//    var name:String ="Muala"
//    name = null

    var name: String? = null
    println(name?.length)


    var list: List<String?> = listOf("item1","item2", null, null)
    var list1: List<Int?> = listOf(11,22, null, null)

    for (item in list){
//        if (item != null)  println(item)

        item?.let {
            println(it)
        }
    }


}