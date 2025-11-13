package nextOOP

interface PaymentMethod{
    fun pay()
}

interface RefundMethod : PaymentMethod {
    fun refund()
}

class Bank : RefundMethod {
    override fun refund() {
        println("refund")
    }
    override fun pay(){
        println("pay")
    }
}

fun main(){
    val bankA = Bank()
    println(bankA.pay())
    println(bankA.refund())
}