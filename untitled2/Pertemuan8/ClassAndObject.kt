package oop

class MahasiswaFunctionOverloading(val nama : String){
    fun sayHello(word : String){
        println("$word $nama")
    }
}
fun main(){
    val mahasiswaPertama = MahasiswaFunctionOverloading(nama = "William")
    mahasiswaPertama.sayHello(word = "selamat pagi")
}