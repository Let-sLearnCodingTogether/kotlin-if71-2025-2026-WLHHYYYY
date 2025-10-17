package OOP

object DatabaseConnection{
    fun connect(){
        println("connect to database")
    }
    fun disconnect(){
        println("Disconnecting from database")
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}