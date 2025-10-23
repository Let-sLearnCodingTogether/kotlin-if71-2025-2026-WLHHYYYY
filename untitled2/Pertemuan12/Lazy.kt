package oop

class TranskripNilai{
    val list : List<Char> by lazy {
        println("list pada akses")
        listOf('A','B','C')
    }
}

fun main(){
    val nilaiMhs = TranskripNilai()
    println(nilaiMhs.list)
}