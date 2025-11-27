package FunctionalProgramming

fun factorial(n : Int) : Long {
    return if (n==1) 1 else n* factorial (n-1)
}