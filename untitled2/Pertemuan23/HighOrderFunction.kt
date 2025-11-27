package FunctionalProgramming

fun calculate(x : Int, y:Int, operation :(Int,Int) -> Int) : Int{
    return operation(x,y)
}

fun sum(a:Int, b:Int) = a + b
fun main(){
    val result = calculate(1,2,sum)

    println(result)
}