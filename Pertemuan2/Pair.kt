fun main() {
    val pair : Pair<String, String> = Pair("First Name", "last Name")
    println(pair.first)
    println(pair.second)

    println()

    val triple : Triple<String, Int, String> = Triple("Nyimas Nisrinaa Kamilah, ", 20, " Tahun, Wanita")
    print(triple.first)
    print(triple.second)
    print(triple.third)
}