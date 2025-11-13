interface Electronic {
    val brand: String

    fun turnOn()
    fun turnOff()

    fun cleanDrive() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Lampu pintar merek $brand menyala dengan cahaya hangat")
    }

    override fun turnOff() {
        println("Lampu pintar merek $brand mati")
    }
}

fun main() {
    print("Masukkan merek lampu pintar: ")
    val inputBrand = readLine() ?: "Tanpa Merek"

    val smartLight = SmartLight(inputBrand)

    print("Nyalakan lampu? (y/n): ")
    val onInput = readLine()

    if (onInput == "y") {
        smartLight.turnOn()
    } else {
        smartLight.turnOff()
    }

    smartLight.cleanDrive()
}
