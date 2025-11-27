package FunctionalProgramming
//pure
fun add(a:Int , b:Int) : Int = a + b

//impure
var count = 0
fun addImpureFunction(a:Int) : Int {
    count += 1
    return a + count
}

fun main(){
    addImpureFunction(1)
    addImpureFunction(2)

    add(1,2)
    add(3,4)
    add(3,7)
}