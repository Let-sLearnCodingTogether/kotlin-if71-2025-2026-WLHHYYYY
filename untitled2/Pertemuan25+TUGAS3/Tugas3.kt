class Smartphone(
    val merk: String,
    val model: String,
    var harga: Double,
    var stok: Int
) {

    fun beli(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            val total = harga * jumlah
            println("Pembelian berhasil! Anda membeli $jumlah unit. Total harga: Rp$total")
        } else {
            println("Stok tidak mencukupi! Stok tersedia hanya $stok unit.")
        }
    }

    fun restock(jumlah: Int) {
        stok += jumlah
        println("Stok berhasil ditambah sebanyak $jumlah unit.")
    }

    fun tampilkanInfo() {
        val hargaFormatted = String.format("%,.0f", harga)   // format tanpa notasi ilmiah

        println(
            """
        === Informasi Smartphone ===
        Merk  : $merk
        Model : $model
        Harga : Rp$hargaFormatted
        Stok  : $stok
        """.trimIndent()
        )
    }

}

fun main() {

    println("===== BAGIAN 1: SMARTPHONE =====")

    val hp1 = Smartphone("Samsung", "SX", 15000000.0, 10)
    val hp2 = Smartphone("iPhone", "20", 25000000.0, 2)

    println("\n--- Info Awal ---")
    hp1.tampilkanInfo()
    hp2.tampilkanInfo()

    println("--- Transaksi ---")
    hp1.beli(3)             // berhasil
    hp2.beli(5)             // gagal (stok kurang)

    println("--- Update Harga & Restock ---")
    hp1.harga = 11000000.0           // diskon
    hp2.restock(10)          // tambah stok

    println("\n--- Info Akhir ---")
    hp1.tampilkanInfo()
    hp2.tampilkanInfo()
}
