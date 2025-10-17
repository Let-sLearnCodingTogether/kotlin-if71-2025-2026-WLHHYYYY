package OOP

class Kalkulator(){
    companion object {
        fun tambah(a : Int, b : Int) : Int {
            return a + b
        }
    }
}

fun main (){
    println(Kalkulator.tambah(3,2))
}