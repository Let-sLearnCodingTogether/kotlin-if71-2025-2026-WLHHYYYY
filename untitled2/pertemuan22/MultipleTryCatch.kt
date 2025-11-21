package Exception

fun validasiUmur2(umur : Int) : Int {
    if(umur<0){
        throw IllegalArgumentException("umur Tidak Boleh Kurang adri 0")
    }
    return umur / 0
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