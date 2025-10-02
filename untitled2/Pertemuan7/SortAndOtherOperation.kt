fun main(){
    val ages : Array<Int> = arrayOf(60,25,30,40,50)

    println("Ages : ${ages.joinToString ()}")

    ages.sorted()
    println("Age sort : ${ages.joinToString()}")

    ages.reverse()
    println("Ages reverse : ${ages.joinToString()}")

    println("Slise : ${ages.slice(2..4).joinToString ()}")
}