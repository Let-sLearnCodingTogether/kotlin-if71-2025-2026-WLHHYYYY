package oop

class MahasiswaFunctionOverloading(val nama : String){
    fun sayHello(word : String){
        println("$word $nama")
    }
}
fun main(){
    val mahasiswaPertama = MahasiswaFunctionOverloading(nama = "William")
    mahasiswaPertama.sayHello(word = "selamat pagi")
}

🔷 class

class adalah template atau cetakan objek.
Kita bisa membuat objek dari class untuk merepresentasikan entitas dunia nyata seperti Mobil, Produk, Siswa, dll.

class Produk(val nama: String, var harga: Int)

property adalah variabel yang dimiliki oleh class.
Tiap objek dari class punya nilai property-nya sendiri.
val p1 = Produk("Laptop", 15000000)
println(p1.nama)  // "Laptop"
println(p1.harga) // 15000000

method adalah fungsi di dalam class yang mendefinisikan perilaku dari objek.
Misal class Produk punya method untuk menampilkan informasi atau menghitung diskon.
class Produk(val nama: String, var harga: Int) {
    fun info() {
        println("Nama produk: $nama, Harga: Rp$harga")
    }

    fun diskon(persen: Int): Int {
        return harga - (harga * persen / 100)
    }
}

------------------
// ===============================
// Class Produk
// ===============================
class Produk(val nama: String, var harga: Int, var stok: Int) {

    fun kurangiStok(jumlah: Int): Boolean {
        return if (stok >= jumlah) {
            stok -= jumlah
            true
        } else {
            println("⚠️ Stok $nama tidak mencukupi! (tersisa $stok)")
            false
        }
    }

    fun infoProduk() {
        println("Nama: $nama | Harga: Rp$harga | Stok: $stok")
    }
}

// ===============================
// Class Transaksi
// ===============================
class Transaksi(val pembeli: String) {
    private val keranjang = mutableMapOf<Produk, Int>()

    fun tambahItem(produk: Produk, jumlah: Int) {
        if (produk.kurangiStok(jumlah)) {
            keranjang[produk] = (keranjang[produk] ?: 0) + jumlah
            println("✅ ${produk.nama} ditambahkan ke keranjang ($jumlah pcs)")
        }
    }

    fun totalBelanja(): Int {
        var total = 0
        for ((produk, jumlah) in keranjang) {
            total += produk.harga * jumlah
        }
        return total
    }

    fun cetakStruk() {
        println("\n🧾 STRUK PEMBELIAN - $pembeli")
        println("==============================")
        for ((produk, jumlah) in keranjang) {
            println("${produk.nama} x$jumlah = Rp${produk.harga * jumlah}")
        }
        println("------------------------------")
        println("TOTAL: Rp${totalBelanja()}")
        println("==============================\n")
    }
}

// ===============================
// Fungsi Main (Simulasi Program)
// ===============================
fun main() {
    // 1. Daftar Produk Awal (Immutable -> tidak diubah langsung)
    val daftarProduk = mutableListOf(
        Produk("Laptop", 12000000, 5),
        Produk("Headphone", 800000, 10),
        Produk("Mouse", 150000, 20)
    )

    println("=== 🏪 Daftar Produk di Toko ===")
    daftarProduk.forEach { it.infoProduk() }

    // 2. Tambahkan Produk Baru
    daftarProduk.add(Produk("Keyboard", 300000, 8))
    println("\n📦 Produk baru ditambahkan!")
    daftarProduk.forEach { it.infoProduk() }

    // 3. Buat Transaksi Pelanggan
    val transaksi1 = Transaksi("William")
    transaksi1.tambahItem(daftarProduk[0], 1) // Laptop
    transaksi1.tambahItem(daftarProduk[2], 2) // Mouse
    transaksi1.tambahItem(daftarProduk[1], 5) // Headphone

    // 4. Cetak Struk
    transaksi1.cetakStruk()

    // 5. Tampilkan stok setelah transaksi
    println("📉 Stok produk terbaru:")
    daftarProduk.forEach { it.infoProduk() }
}

-------------------

// ===============================
// Class Buku
// ===============================
class Buku(val judul: String, val penulis: String, var stok: Int) {

    fun pinjam(): Boolean {
        return if (stok > 0) {
            stok--
            true
        } else {
            println("❌ Buku \"$judul\" sedang habis.")
            false
        }
    }

    fun kembalikan() {
        stok++
    }

    fun info() {
        println("$judul oleh $penulis | Stok: $stok")
    }
}

// ===============================
// Class Anggota
// ===============================
class Anggota(val id: Int, val nama: String) {
    val daftarPinjaman = mutableSetOf<Buku>()

    fun pinjamBuku(buku: Buku) {
        if (buku.pinjam()) {
            daftarPinjaman.add(buku)
            println("✅ $nama meminjam buku \"${buku.judul}\"")
        }
    }

    fun kembalikanBuku(buku: Buku) {
        if (daftarPinjaman.contains(buku)) {
            buku.kembalikan()
            daftarPinjaman.remove(buku)
            println("📗 $nama mengembalikan buku \"${buku.judul}\"")
        } else {
            println("⚠️ Buku tidak ditemukan di daftar pinjaman $nama.")
        }
    }

    fun tampilkanPinjaman() {
        println("\n📚 Buku yang dipinjam $nama:")
        if (daftarPinjaman.isEmpty()) println("Tidak ada buku dipinjam.")
        daftarPinjaman.forEach { println("- ${it.judul}") }
    }
}

// ===============================
// Fungsi Main
// ===============================
fun main() {
    // 1. Daftar buku awal
    val bukuList = mutableListOf(
        Buku("Kotlin for Beginners", "JetBrains", 3),
        Buku("Clean Code", "Robert C. Martin", 2),
        Buku("Design Patterns", "GoF", 1)
    )

    // 2. Daftar anggota
    val anggotaList = listOf(
        Anggota(101, "William"),
        Anggota(102, "Aulia")
    )

    // 3. Aktivitas peminjaman
    anggotaList[0].pinjamBuku(bukuList[0])
    anggotaList[0].pinjamBuku(bukuList[1])
    anggotaList[1].pinjamBuku(bukuList[1])
    anggotaList[1].pinjamBuku(bukuList[2])

    // 4. Tampilkan pinjaman dan stok
    anggotaList.forEach { it.tampilkanPinjaman() }

    println("\n📦 Stok buku terkini:")
    bukuList.forEach { it.info() }

    // 5. Pengembalian buku
    anggotaList[0].kembalikanBuku(bukuList[0])
    anggotaList[1].kembalikanBuku(bukuList[2])

    println("\n📦 Stok buku setelah pengembalian:")
    bukuList.forEach { it.info() }
}

--------------
/// ===============================
// Class Kamar
// ===============================
class Kamar(val nomor: Int, val tipe: String, val harga: Int, var tersedia: Boolean = true) {
    fun infoKamar() {
        val status = if (tersedia) "Tersedia" else "Terisi"
        println("Kamar #$nomor | Tipe: $tipe | Harga: Rp$harga | Status: $status")
    }
}

// ===============================
// Class Pelanggan
// ===============================
class Pelanggan(val nama: String) {
    val daftarKamarDipesan = mutableListOf<Kamar>()

    fun pesanKamar(kamar: Kamar) {
        if (kamar.tersedia) {
            kamar.tersedia = false
            daftarKamarDipesan.add(kamar)
            println("✅ $nama memesan kamar #${kamar.nomor}")
        } else {
            println("❌ Kamar #${kamar.nomor} sudah terisi.")
        }
    }

    fun totalTagihan(): Int {
        return daftarKamarDipesan.sumOf { it.harga }
    }

    fun cetakInvoice() {
        println("\n🧾 Invoice - $nama")
        daftarKamarDipesan.forEach { println("Kamar #${it.nomor} (${it.tipe}) = Rp${it.harga}") }
        println("TOTAL BAYAR: Rp${totalTagihan()}")
    }
}

// ===============================
// Class Hotel
// ===============================
class Hotel(val nama: String) {
    val daftarKamar = mutableListOf<Kamar>()

    fun tambahKamar(kamar: Kamar) {
        daftarKamar.add(kamar)
    }

    fun tampilkanKamar() {
        println("\n🏨 Daftar Kamar di $nama:")
        daftarKamar.forEach { it.infoKamar() }
    }

    fun kamarTersedia(): List<Kamar> {
        return daftarKamar.filter { it.tersedia }
    }
}

// ===============================
// Fungsi Main
// ===============================
fun main() {
    // 1. Inisialisasi hotel dan kamar
    val hotel = Hotel("Hotel Santai Jaya")
    hotel.tambahKamar(Kamar(101, "Deluxe", 500000))
    hotel.tambahKamar(Kamar(102, "Suite", 750000))
    hotel.tambahKamar(Kamar(103, "Standard", 350000))

    // 2. Tampilkan semua kamar
    hotel.tampilkanKamar()

    // 3. Pelanggan melakukan reservasi
    val pelanggan1 = Pelanggan("William")
    val pelanggan2 = Pelanggan("Aulia")

    pelanggan1.pesanKamar(hotel.daftarKamar[0])
    pelanggan2.pesanKamar(hotel.daftarKamar[0]) // Harus gagal
    pelanggan2.pesanKamar(hotel.daftarKamar[2])

    // 4. Tampilkan kamar tersedia setelah reservasi
    println("\n📋 Kamar yang masih tersedia:")
    hotel.kamarTersedia().forEach { println("Kamar #${it.nomor}") }

    // 5. Cetak invoice pelanggan
    pelanggan1.cetakInvoice()
    pelanggan2.cetakInvoice()
}

-------------------
