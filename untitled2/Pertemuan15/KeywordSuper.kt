package nextOOP

open class HewanBaru{
    open fun suara(){
        println("Suara Hewan")
    }
}

class Bebek() : HewanBaru(){
    override fun suara() {
        super.suara()
        println("Suara Bebek : kwek kwek")
    }
}

fun main() {
    val bebek = Bebek()
    bebek.suara()
}