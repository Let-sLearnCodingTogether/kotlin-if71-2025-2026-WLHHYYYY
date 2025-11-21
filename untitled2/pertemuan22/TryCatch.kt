package Exception

fun validasiUmur1(umur : Int){
    if(umur < 0){
        throw IllegalArgumentException("Umur tidak valid")
    }
    println("umur valid ${umur}")
}

fun main(){
    println("Start")
    try {
        validasiUmur1(10)
        validasiUmur1(umur = -2)
    }catch (error : IllegalArgumentException){
        print("Error dengan msg ${error.message}")
    }
    println("finish")
}