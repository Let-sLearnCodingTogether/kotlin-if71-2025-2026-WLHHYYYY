package FunctionalProgramming

fun createMultiplier(factor : Int) : (Int) -> Int {
    return {
        number : Int -> number * factor
    }
}

fun main() {
    val doubled = createMultiplier(2)
    println(doubled(4))
}