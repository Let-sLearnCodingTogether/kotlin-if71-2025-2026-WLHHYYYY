fun main() {
    val myInt : Int = 120
    val myByte : Byte = myInt.toByte()

    println(myByte)

    val myInt2 : Int = 130
    val myByte2 : Byte = myInt2.toByte()

    println(myByte2)

    println(Integer.toBinaryString(myInt2).padStart(32, '0'))

    //Byte : 8bit
    // 10000010
    // Kalau bit pertama 0 hasilnya positif, jika 1 hasilnya negatif

    //Invertst biner ( 0->1, 1->0)
    //01111101 (125 + 1 = -126) rumus complement harus ditambah 1

    //rentang byte 0 - 127, -128
}