fun main() {
    var totalBelanja = 0.0
    println("Status Awal -> Total Belanja: Rp$totalBelanja")

    val barang1 = 3 * 25000
    totalBelanja += barang1
    println("Setelah Item A -> Total Belanja: Rp$totalBelanja")

    val barang2 = 2 * 15000
    totalBelanja += barang2
    println("Setelah Item B -> Total Belanja: Rp$totalBelanja")

    val diskon = 10000
    totalBelanja -= diskon
    println("Setelah Diskon -> Total Belanja: Rp$totalBelanja")

    val biayaLayanan = totalBelanja / 100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")

    println("===================================")
    println("Total Akhir yang Harus Dibayar: Rp$totalBelanja")
}