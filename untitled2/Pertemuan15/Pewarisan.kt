package OOP

open class Hewan(val name : String) {
    open fun suara(){
        println("Suara hewan")
    }
}

class Ayam(name: String) : Hewan(name) {
    override fun suara(){
        println("kukuruyuk!!")
    }
}

fun main() {
    val rembo = Ayam("rembo")
    rembo.suara()
}