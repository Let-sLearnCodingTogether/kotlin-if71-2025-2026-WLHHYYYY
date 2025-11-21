package Exception

class SaldoKurangException(msg : String) : Exception(msg)

val saldo : Int = 100_000

fun tarikTunai(jumlah : Int){
    if(jumlah > saldo){
        throw SaldoKurangException("sadar diri")
    }
    println("Penarikan berhasil")
}

fun main(){
    try {
        tarikTunai(200_000)
    }catch (error : SaldoKurangException){
        println("Error saldo kurang ${error.message}")
    }
}