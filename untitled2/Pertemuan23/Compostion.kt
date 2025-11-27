package FunctionalProgramming

fun compose(f :(Int) -> Int, g : (Int) -> Int):(Int) -> Int {
    return{x : Int -> f(g(x))}
}

fun square(x:Int) = x*x
fun increment(x:Int) = x+1

fun main() {
    val result = compose(::square,::increment)
    println(result(5))
}
