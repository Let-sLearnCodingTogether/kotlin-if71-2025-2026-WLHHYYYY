fun main() {
    val mk : List<String> = listOf(
        "kotlin",
        "kalkulus",
        "Algoritma dan struktur data"
    )
    println("List mk wajib : $mk" )
    println("Size List mk wajib : ${mk.size}")

    println("Index pertama mk wajib : ${mk[0]} ")

    val mkUpperCase = mk.map {
        it.uppercase()
    }
    println("list mk uppercase : $mkUpperCase")

    val mkLebihdariNKarakter = mk.filter {
        it.length > 10
    }
    println("mk lebih dari 10 karakter : $mkLebihdariNKarakter")
}