class Gedung2 (val nama : String){
    private val alamat : String = "Jln. Sudirman"

    inner class RuanganRapat {
        fun mulaiRapat(){
            println("Rapat di mulai")
            println("Rapat di gedung $nama di alaman $alamat")
        }
    }
}

fun main() {
    val gedungA = Gedung2("Universitas MDP")
    val ruangRapat = gedungA.RuanganRapat()
    ruangRapat.mulaiRapat()
}