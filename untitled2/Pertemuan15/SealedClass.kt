package nextOOP

sealed class HasilOperasi(){
    data class Success(val message : String) : HasilOperasi()
    data class Error(val message : String) : HasilOperasi()
    object Loading : HasilOperasi()
}

fun prosesHasil(hasilOperasi : HasilOperasi){
    when(hasilOperasi){
        is HasilOperasi.Loading -> println("System Loading")
        is HasilOperasi.Success -> println(hasilOperasi.message)
        is HasilOperasi.Error -> println(hasilOperasi.message)
    }
}

fun main() {
    prosesHasil(HasilOperasi.Loading)
    prosesHasil(HasilOperasi.Success("Success Message"))
    prosesHasil(HasilOperasi.Error("Error Message"))
}