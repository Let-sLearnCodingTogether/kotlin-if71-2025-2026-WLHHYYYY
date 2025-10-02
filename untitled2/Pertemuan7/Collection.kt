fun main(){
    val mkwajib : MutableList<String> = mutableListOf(
        "IOT"
    )
    val mkpilihan : MutableList<String> = mutableListOf(
        "Kotlin",
        "Fuzzy"
    )

    mkpilihan.add("web 2")

    println(mkpilihan[0])
    println(mkpilihan[1])
    println(mkpilihan[2])

    mkpilihan.add(index = 1, "solid")
    println(mkpilihan[1])

    mkpilihan.removeAt(index = 1)
    println(mkpilihan)

    val mk = mkpilihan + mkwajib
    println(mk)
}