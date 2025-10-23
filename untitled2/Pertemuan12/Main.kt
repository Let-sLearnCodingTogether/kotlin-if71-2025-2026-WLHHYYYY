package oop

class PersegiPanjang(val panjang: Double, val lebar: Double) {
    val luasPersegiPanjang: Double
        get() = lebar * panjang
}

class Mahasiswa(ipk: Double) {
    var ipk: Double = ipk
        set(value) {
            field = if (value < 0) 0.0
            else if (value > 4) 4.0
            else value
        }
}

fun main() {
    val panjang = 70.0
    val lebar = 2.0

    val luasBangun = PersegiPanjang(panjang, lebar)
    println("Luas Persegi Panjang: ${luasBangun.luasPersegiPanjang}")

    val ipkMahasiswa = Mahasiswa(3.8)
    println("IPK Mahasiswa: ${ipkMahasiswa.ipk}")

    ipkMahasiswa.ipk = -2.0
    println("IPK Mahasiswa setelah perubahan: ${ipkMahasiswa.ipk}")

    ipkMahasiswa.ipk = 5.0
    println("IPK Mahasiswa setelah perubahan: ${ipkMahasiswa.ipk}")
}
