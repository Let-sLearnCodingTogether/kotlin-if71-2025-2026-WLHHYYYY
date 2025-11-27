package FunctionalProgramming

val repeatFunction: String.(Int) -> String = { times -> this.repeat(times) }

fun main() {
    println("hi".repeatFunction(3))
}
