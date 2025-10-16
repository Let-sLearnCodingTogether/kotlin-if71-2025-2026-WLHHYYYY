package oop

class MahasiswaConstructorDefaultValue(
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
) {
    init{
        println("Ini blok init")
    }
}
fun main(){
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        npm="2226250035",
        nama = "William Hidayat"
    )
    val mahasiswaKedua = MahasiswaConstructorDefaultValue(
        npm="2226250034",
        nama = "William",
        3.4f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    println(mahasiswaKedua.npm)
    println(mahasiswaKedua.nama)
    println(mahasiswaKedua.ipk)
}