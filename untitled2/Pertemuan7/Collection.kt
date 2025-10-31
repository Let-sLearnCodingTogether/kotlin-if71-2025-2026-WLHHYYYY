fun main(){
    val mkwajib : MutableList<String> = mutableListOf(
        "IOT"
    )
    val mkpilihan : MutableList<String> = mutableListOf(
        "Kotlin",
        "Fuzzy"
    )

    mkpilihan.add("web 2")

    println(mkpilihan[0])
    println(mkpilihan[1])
    println(mkpilihan[2])

    mkpilihan.add(index = 1, "solid")
    println(mkpilihan[1])

    mkpilihan.removeAt(index = 1)
    println(mkpilihan)

    val mk = mkpilihan + mkwajib
    println(mk)
}

fun tambahBuku(inventaris: MutableMap<String, String>, isbn: String, judul: String) {
    if (inventaris.containsKey(isbn)) {
        println("Buku dengan ISBN $isbn sudah ada dan tidak akan ditambahkan.")
    } else {
        inventaris[isbn] = judul
        println("Buku dengan ISBN $isbn berhasil ditambahkan: $judul")
    }
}

fun cariBuku(inventaris: Map<String, String>, isbn: String): String {
    return inventaris[isbn] ?: "Buku tidak ditemukan."
}

fun main() {
    val inventarisBuku = mutableMapOf<String, String>()

    tambahBuku(inventarisBuku, "978-602-03-8591-0", "Bumi")
    tambahBuku(inventarisBuku, "978-602-06-3841-8", "Bulan")
    tambahBuku(inventarisBuku, "978-602-06-3841-8", "Matahari")

    println()
    println(cariBuku(inventarisBuku,"978-602-03-8591-0"))
    println(cariBuku(inventarisBuku,"978-979-3062-79-8"))
    println("Daftar Buku : $inventarisBuku")
}
--------------

class Player(val name: String) {
    var health: Int = 100
    var level: Int = 1

    fun takeDamage(damage: Int) {
        health -= damage
        if (health < 0) {
            health = 0
        }
    }

    fun levelUp() {
        level += 1
        health = 100
    }

    fun showStatus() {
        println("Nama: $name, Level: $level, Health: $health")
    }
}

fun main() {
    // a. Buat objek Player
    val player = Player("Excel")

    // b. Tampilkan status awal
    player.showStatus()

    // c. Pemain terkena serangan
    player.takeDamage(30)

    // d. Tampilkan status setelah terkena serangan
    player.showStatus()

    // e. Pemain naik level
    player.levelUp()

    // f. Tampilkan status setelah naik level
    player.showStatus()
}

---------------------
fun main() {
    // Immutable List
    val produkAwal = listOf("Sabun", "Sampo", "Pasta Gigi")
    println("Daftar produk awal (immutable): $produkAwal")

    // Mutable List
    val keranjang = mutableListOf("Sabun", "Sampo")
    println("Keranjang awal: $keranjang")

    // Tambah produk
    keranjang.add("Pasta Gigi")
    keranjang.add("Tisu")

    // Hapus produk
    keranjang.remove("Sabun")

    // Ubah produk
    keranjang[0] = "Sampo Herbal"

    println("Keranjang setelah update: $keranjang")

    // Hitung total produk
    println("Total item: ${keranjang.size}")

    // Iterasi daftar produk
    for (item in keranjang) {
        println("Produk: $item")
    }
}

-----------------------
fun main() {
    // Immutable Set
    val pesertaTetap = setOf("Ayu", "Budi", "Cici", "Ayu") // duplikat diabaikan
    println("Peserta tetap: $pesertaTetap")

    // Mutable Set untuk pendaftaran baru
    val peserta = mutableSetOf("Ayu", "Budi")
    peserta.add("Doni")
    peserta.add("Ayu") // Tidak ditambah karena duplikat

    println("Peserta saat ini: $peserta")

    // Menghapus peserta
    peserta.remove("Budi")
    println("Setelah update: $peserta")

    // Mengecek keberadaan
    println("Apakah Doni sudah terdaftar? ${"Doni" in peserta}")
}


-------------
fun main() {
    // Immutable Map
    val mahasiswaTetap = mapOf(
        "23001" to "William",
        "23002" to "Ayu"
    )
    println("Mahasiswa tetap: $mahasiswaTetap")

    // Mutable Map
    val mahasiswa = mutableMapOf(
        "23001" to "William",
        "23002" to "Ayu"
    )

    // Tambah data baru
    mahasiswa["23003"] = "Doni"

    // Ubah data
    mahasiswa["23002"] = "Cici"

    // Hapus data
    mahasiswa.remove("23001")

    // Menampilkan semua data
    for ((nim, nama) in mahasiswa) {
        println("NIM: $nim → Nama: $nama")
    }

    // Akses data tertentu
    println("Nama mahasiswa 23003: ${mahasiswa["23003"] ?: "Tidak ditemukan"}")
}

----------------
fun main() {
    // Daftar produk (List)
    val produk = listOf("Nasi Goreng", "Mie Ayam", "Es Teh", "Kopi Hitam")

    // Harga per produk (Map)
    val harga = mapOf(
        "Nasi Goreng" to 15000,
        "Mie Ayam" to 13000,
        "Es Teh" to 5000,
        "Kopi Hitam" to 7000
    )

    // Pesanan pelanggan (Mutable List)
    val pesanan = mutableListOf("Nasi Goreng", "Es Teh", "Kopi Hitam")

    println("Pesanan: $pesanan")

    // Hitung total harga
    var total = 0
    for (item in pesanan) {
        total += harga[item] ?: 0
    }

    println("Total pembayaran: Rp$total")

    // Tambahkan pesanan baru
    pesanan.add("Mie Ayam")
    println("Pesanan terbaru: $pesanan")

    // Hitung ulang
    total = pesanan.sumOf { harga[it] ?: 0 }
    println("Total baru: Rp$total")
}

-----------------------
fun main() {
    // Set untuk memastikan siswa yang hadir unik
    val hadirHariIni = mutableSetOf<String>()

    hadirHariIni.add("William")
    hadirHariIni.add("Ayu")
    hadirHariIni.add("William") // tidak ditambahkan lagi
    println("Siswa hadir hari ini: $hadirHariIni")

    // Map untuk menghitung total kehadiran
    val totalHadir = mutableMapOf(
        "William" to 2,
        "Ayu" to 3,
        "Doni" to 1
    )

    // Tambah 1 jika hadir hari ini
    for (nama in hadirHariIni) {
        val kehadiranSebelumnya = totalHadir[nama] ?: 0
        totalHadir[nama] = kehadiranSebelumnya + 1
    }

    println("Rekap total kehadiran:")
    for ((nama, jumlah) in totalHadir) {
        println("$nama → $jumlah kali hadir")
    }
}


----------------------------------
fun main() {
    val totalKehadiran = mutableMapOf(
        "Ayu" to 2,
        "Budi" to 3,
        "Cici" to 1
    )

    val hadirHariIni = setOf("Ayu", "Budi", "Doni", "Ayu")

    for (nama in hadirHariIni) {
        val sebelumnya = totalKehadiran[nama] ?: 0
        totalKehadiran[nama] = sebelumnya + 1
    }

    println("Total kehadiran siswa:")
    for ((nama, jumlah) in totalKehadiran) {
        println("$nama → $jumlah kali hadir")
    }
}

-------------------
fun main() {
    val hargaBarang = mapOf(
        "Buku" to 12000,
        "Pensil" to 5000,
        "Penghapus" to 3000,
        "Penggaris" to 7000
    )

    val belanja = listOf("Buku", "Pensil", "Pensil", "Penghapus")

    var total = 0
    for (item in belanja) {
        total += hargaBarang[item] ?: 0
    }

    println("Total belanja pelanggan: Rp$total")
}

--------------------
fun main() {
    val nilaiSiswa = listOf(95, 82, 75, 88, 100, 67, 73, 90, 85, 79)

    println("📘 Daftar Nilai Siswa: $nilaiSiswa")

    val rataRata = nilaiSiswa.average()
    val nilaiTertinggi = nilaiSiswa.maxOrNull()
    val nilaiTerendah = nilaiSiswa.minOrNull()

    println("\n📊 Statistik Nilai:")
    println("Rata-rata: ${"%.2f".format(rataRata)}")
    println("Tertinggi: $nilaiTertinggi")
    println("Terendah: $nilaiTerendah")

    // Kategorisasi nilai
    val kategori = mutableMapOf("A" to 0, "B" to 0, "C" to 0, "D" to 0)

    for (nilai in nilaiSiswa) {
        when {
            nilai >= 90 -> kategori["A"] = kategori["A"]!! + 1
            nilai in 80..89 -> kategori["B"] = kategori["B"]!! + 1
            nilai in 70..79 -> kategori["C"] = kategori["C"]!! + 1
            else -> kategori["D"] = kategori["D"]!! + 1
        }
    }

    println("\n📈 Jumlah Siswa per Kategori:")
    kategori.forEach { (grade, jumlah) ->
        println("Kategori $grade: $jumlah siswa")
    }
}

--------------- set
fun main() {
    val hadirKemarin = setOf("William", "Aulia", "Rafi", "Sinta", "Dewi")
    val hadirHariIni = mutableSetOf("William", "Aulia", "Dewi", "Tono")

    println("👥 Kehadiran Hari Ini: $hadirHariIni")

    // Tambah karyawan baru
    hadirHariIni.add("Lala")
    // Hapus yang salah input
    hadirHariIni.remove("Tono")

    println("\n📋 Kehadiran Final Hari Ini: $hadirHariIni")
    println("Jumlah hadir: ${hadirHariIni.size}")

    // Bandingkan dengan hari kemarin
    val baruHadir = hadirHariIni - hadirKemarin
    val absenHariIni = hadirKemarin - hadirHariIni

    println("\n🧾 Perbandingan dengan kemarin:")
    println("Baru hadir hari ini: $baruHadir")
    println("Tidak hadir hari ini: $absenHariIni")
}

-------- map list
fun main() {
    val stokGudang = mutableMapOf(
        "Laptop" to 8,
        "Mouse" to 3,
        "Keyboard" to 10,
        "Monitor" to 2,
        "Headset" to 5
    )

    println("🏭 Daftar Stok Awal:")
    stokGudang.forEach { (barang, stok) -> println("$barang: $stok unit") }

    // 1️⃣ Tambahkan barang baru
    stokGudang["Printer"] = 6

    // 2️⃣ Update stok barang tertentu
    stokGudang["Mouse"] = stokGudang["Mouse"]!! + 5  // tambah stok Mouse

    // 3️⃣ Hapus barang yang sudah habis
    stokGudang["Monitor"] = 0
    stokGudang.entries.removeIf { it.value == 0 }

    println("\n📦 Stok Setelah Update:")
    stokGudang.forEach { (barang, stok) -> println("$barang: $stok unit") }

    // 4️⃣ Cek barang dengan stok rendah
    val stokRendah = stokGudang.filter { it.value < 5 }.keys
    println("\n⚠️ Barang yang perlu restock: $stokRendah")

    // 5️⃣ Urutkan stok dari terbesar ke terkecil
    val urutan = stokGudang.toList().sortedByDescending { it.second }
    println("\n📈 Urutan Barang Berdasarkan Stok:")
    urutan.forEach { (barang, stok) -> println("$barang: $stok unit") }
}

