package inheritance

open class Book(var page:Int, author:String) {

}

class Booklet(page:Int, author: String, cost:Double) : Book(page, author)


fun main() {
    fun isLargerBook(book: Book) : Boolean{
        return book.page >= 50
    }

    var book = Book(122, "Gjon Buzuku")
    var booklet = Booklet(300, "Migjeni", 25.0)

    println(isLargerBook(book))
    println(isLargerBook(booklet))

}