fun main() {
    val ages: Array<Int> = arrayOf(35,32,31,31)
    println("Contains : ${ages.contains(31)}")
    println("Contains : ${ages.contains(32)}")
    println("Contains : ${ages.indexOf(35)}")
    println("Ant : ${ages.any({it>10})}")
    println("Ant : ${ages.all({it>10})}")
}