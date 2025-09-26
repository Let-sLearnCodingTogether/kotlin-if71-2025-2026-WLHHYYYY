fun String.greeting():String {
    return "Hello, $this"
}

fun Int.Genap(): Boolean {
    return this %2 == 0
}
fun main(){
    val username : String = "budi"
    val age : Int = 33

    println(username.greeting())
    println(age.Genap())
}