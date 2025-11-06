package OOP

open class Pegawai(val nama  : String, val gajiDasar : Int){
    open fun hitungGaji(){
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

class Manager(nama: String,gajiDasar: Int) : Pegawai(nama,gajiDasar){
    override fun hitungGaji() {
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

class Programmer(nama: String,gajiDasar: Int) : Pegawai(nama,gajiDasar){
    override fun hitungGaji() {
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

fun main() {
    val Welly = Manager("Welly", gajiDasar = 10000000)
    Welly.hitungGaji()

    val Willi = Programmer("Willi", gajiDasar = 2000000)
    Willi.hitungGaji()

    val semuaPegawai = mutableListOf(
        Programmer("Willi", gajiDasar = 500000),
        Manager("Reni", gajiDasar = 1000000),
        Programmer("Nyimas", gajiDasar = 500000)
    )

    semuaPegawai.forEach {
        ("${it.hitungGaji()}")

    }
}


