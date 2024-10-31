package singleton

object DatabaseConnection {
    init {
        println("Created!")
    }

    fun executeQuery(query:String){
        println("Executing $query")
    }
}

fun main() {
    var dbConnection1 = DatabaseConnection
    dbConnection1.executeQuery("SELECT * FROM users")
    var dbConnection2 = DatabaseConnection
    dbConnection2.executeQuery("DELETE FROM users WHERE id = 5")














}