package Exception

fun validasiUmur(umur : Int){
    if(umur < 0){
        throw IllegalArgumentException("Umur tidak valid")
    }
    println("umur valid ${umur}")
}

fun main(){
    println("Start")
    validasiUmur(10)
    validasiUmur(umur = -2)
    println("finish")
}