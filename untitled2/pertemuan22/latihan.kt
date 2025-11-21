package Exception

class NilaiTidakValidException(message: String) : Exception(message)

fun validasiNilai(nilai: Int) {
    if (nilai < 0 || nilai > 100) {
        throw NilaiTidakValidException("Nilai harus antara 0 hingga 100")
    }
    println("Nilai berhasil diinput: $nilai")
}

fun main() {
    try {
        validasiNilai(110)
    } catch (error: NilaiTidakValidException) {
        println("${error.message}")
    }
}
