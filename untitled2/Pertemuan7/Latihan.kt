fun main() {
   prosesArray()
}

fun prosesArray(){
    val arrayByte : ByteArray = byteArrayOf(80,90,99,40)

    arrayByte.sum()
    arrayByte.average()
    println("Sum : ${arrayByte.sum()}")
    println("Avg : ${arrayByte.average()}")
}