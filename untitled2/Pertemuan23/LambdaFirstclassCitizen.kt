package FunctionalProgramming

fun operateNumbers(a : Int, b : Int, operation : (Int,Int) -> Unit){
    return operation(a,b)
}

fun main(){
    operateNumbers(1,2){x,y -> println(x+y)}
    operateNumbers(6, 2) { x, y -> println(x + y) }
    operateNumbers(1,2){x,y -> x-y}
    operateNumbers(1,2){x,y -> x*y}
}