package oop

data class Kendaraan(val merek : String, val tahun : String)

fun main(){
    val toyota = Kendaraan(merek = "Toyota", tahun = "2015")
    val(merek,tahun) = toyota
    println(merek)
    println(tahun)
}