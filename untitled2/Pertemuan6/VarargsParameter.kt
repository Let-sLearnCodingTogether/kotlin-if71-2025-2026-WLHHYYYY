fun contohArray(angka: Array<Int>) {
    for (i in angka) {
        println(i)
    }
}

fun main() {
    contohArray(arrayOf(1, 2, 3, 4, 5))
    contohArray(arrayOf(10, 20))
}

fun contohArray(vararg angka: Int) {
    for (i in angka) {
        println(i)
    }
}
