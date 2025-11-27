package FunctionalProgramming

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }
    val even = numbers.filter { it % 2 == 0 }
    val sum = numbers.reduceOrNull { acc, i -> acc + i } ?: 0

    println("Doubled numbers: $doubled")
    println("Even numbers: $even")
    println("Sum of numbers: $sum")
}
