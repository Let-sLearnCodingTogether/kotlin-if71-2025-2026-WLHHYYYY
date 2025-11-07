class Gedung (val nama : String){
    private val alamat : String = "Jln. Sudirman"

    class RuanganRapat {
        fun mulaiRapat(){
            println("Rapat di mulai")
            //println("Rapat di gedung $nama di alaman $alamat")
        }
    }
}

fun main() {
    val ruanganRapat = Gedung.RuanganRapat()
    ruanganRapat.mulaiRapat()
}