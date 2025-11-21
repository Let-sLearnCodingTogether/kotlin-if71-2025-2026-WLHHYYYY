package Exception

class StokHabisException(message: String) : Exception(message)

class Barang(
    val nama: String,
    var stok: Int
)

fun beliBarang(barang: Barang, jumlahBeli: Int) {
    if (jumlahBeli > barang.stok) {
        throw StokHabisException(
            "Gagal beli ${barang.nama}. Stok hanya sisa ${barang.stok}"
        )
    }
    barang.stok -= jumlahBeli
    println("Berhasil membeli $jumlahBeli .${barang.nama}.")
}

fun main() {
    val barang = Barang("Xiaomi", 5)

    try {
        beliBarang(barang, 3)
        beliBarang(barang, 4)
    } catch (error: StokHabisException) {
        println(error.message)
    }
}
