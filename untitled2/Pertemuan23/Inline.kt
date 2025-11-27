package FunctionalProgramming

// Menandakan fungsi ini adalah fungsi inline
inline fun execute(block: () -> Unit) {
    println("start")
    block()  // Memanggil blok kode yang diberikan
    println("end")
}

fun main() {
    // Memanggil fungsi execute dengan blok kode di dalamnya
    execute {
        println("execute block")
    }
}
