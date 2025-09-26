infix fun String.to(type : String) : String {
    if(type== "upper"){
        return this.uppercase()
    }
    return this.lowercase()
}

fun main(){
    println("Hello world" to "upper")
    println("HELLO WORLD" to "lower")
}