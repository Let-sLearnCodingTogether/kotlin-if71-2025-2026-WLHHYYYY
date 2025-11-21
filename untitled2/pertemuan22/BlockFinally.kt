package Exception

fun validasiUmur3(umur:Int): Int {
    if (umur < 0) {
        throw IllegalArgumentException("umur tidak boleh kurang dari 0")
    }
    return umur
}

fun main(){
    try {
        validasiUmur1(10)
        validasiUmur1(umur = -5)
    }catch (error : IllegalArgumentException){
        print("Error dengan msg ${error.message}")
    }catch(error : ArithmeticException) {
        println("error pembagian dengan 0")
    }catch (error: Exception){
        println("error tidak diketahui ${error.message}")
    }
}

