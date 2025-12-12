enum class StatusPengiriman {
    PROSES, DIKIRIM, SAMPAI
}

interface LayananKurir{
    fun hitungOngkir(jarak : Int): Double
}

class JNE : LayananKurir {
    override fun hitungOngkir(jarak: Int): Double {
        return 1000.0 * jarak
    }
}

class GoSend : LayananKurir {
    override fun hitungOngkir(jarak: Int): Double {
        return 2000.0 * jarak
    }
}

class Paket<T>(
    val isiPaket: T,
    val alamat: String,
    var kurir: LayananKurir,
    var status: StatusPengiriman = StatusPengiriman.PROSES
) {

    fun cekStatus() {
        println("Isi Paket: $isiPaket | Status: $status")
    }

    fun kirimPaket(jarak: Int) {
        status = StatusPengiriman.DIKIRIM
        val biaya = kurir.hitungOngkir(jarak)
        println("Paket dikirim! Biaya ongkir: Rp $biaya")
    }
}

fun main() {
    // Paket berisi String dengan kurir JNE
    val paketDokumen = Paket(
        isiPaket = "Dokumen Rahasia",
        alamat = "Jakarta",
        kurir = JNE()
    )

    paketDokumen.cekStatus()
    paketDokumen.kirimPaket(10)
    paketDokumen.cekStatus()

    println("==============================")

    // Paket berisi Int dengan kurir GoSend
    val paketAngka = Paket(
        isiPaket = 101,
        alamat = "Bandung",
        kurir = GoSend()
    )

    paketAngka.cekStatus()
    paketAngka.kirimPaket(5)
    paketAngka.cekStatus()
}

