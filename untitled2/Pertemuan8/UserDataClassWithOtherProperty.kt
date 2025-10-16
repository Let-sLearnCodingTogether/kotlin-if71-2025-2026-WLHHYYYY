package oop

data class Product(val name : String, val price : Double){
    val isAvailable : Boolean = true

    fun getFormatPrice(): String{
        return "RP $price"
    }
}
fun main (){
    val product1 = Product(name = "acer nitro", 5000_000.0)
    println(product1)
    println(product1.isAvailable)
    println(product1.getFormatPrice())
}