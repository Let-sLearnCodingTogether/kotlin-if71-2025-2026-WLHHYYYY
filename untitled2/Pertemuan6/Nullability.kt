fun hitungPanjangNama(name:String?): Int{
    if(name!=null){
        return name.length
    }
    return 0
}
fun main(){
    println(hitungPanjangNama("wili"))
    println(hitungPanjangNama(null))
}