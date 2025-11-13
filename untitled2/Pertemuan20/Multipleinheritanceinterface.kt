package nextOOp

interface Wheeled {
    val numberOfWheels: Int
}

interface Vehicle1 {
    fun drive()
}

class SepedaRodaTiga(override val numberOfWheels: Int = 3) : Wheeled, Vehicle1 {
    override fun drive() {
        println("Sepeda bergerak dengan $numberOfWheels roda")
    }
}

fun main() {
    val sepedaRodaTiga1 = SepedaRodaTiga()
    sepedaRodaTiga1.drive()
}
