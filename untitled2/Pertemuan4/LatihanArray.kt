fun main() {
    val hari = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    println("Jumlah hari : ${hari.size}")
    println("Hari pertama : ${hari[0]}")
    println("Hari terakhir : ${hari[6]}")

    val idx = hari.indexOf("Jumat")
    if (idx != -1) {
        hari[idx] = "Jum'at Barokah"
        println(hari[idx])
    }
}
