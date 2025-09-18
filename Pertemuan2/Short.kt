fun main() {
    val myInt : Int = 30000
    val myShort : Short = myInt.toShort()

    println(myShort)

    val myInt2 : Int = 40000
    val myShort2 : Short = myInt2.toShort()

    println(myShort2)

    println(Integer.toBinaryString(myInt2).padStart(32, '0'))

    //Short : 16bit
    // 1001110001000000
    // Kalau bit pertama 0 hasilnya positif, jika 1 hasilnya negatif

    //Invertst biner ( 0->1, 1->0)
    // 0110001110111111 (25.535 + 1 = -25.356) rumus complement harus ditambah 1
}