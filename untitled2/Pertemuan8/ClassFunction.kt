package oop

class MahasiswaFunction(val nama : String){
    fun sayHello(){
        println("Selamat Malam $nama")
    }
}
fun main(){
    val mahasiswaPertama = MahasiswaFunction(nama = "welly")
    mahasiswaPertama.sayHello()
}