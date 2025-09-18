fun main() {
    val university : String = "Universitas Multi Data palembang"
    val addres : String = """
        Jln. Rajawali
        Sumatera Selatan
        palembang
    """

    println(university)
    println(addres)

    //==============================Trim Margin========================================

    val university2 : String = "Universitas Multi Data palembang"
    val addres2 : String = """
        |Jln. Rajawali
        |Sumatera Selatan
        |palembang
    """.trimMargin()

    println(university2)
    println(addres2)
    println()

    //========================Custom Trim Margin=====================================

    val university3 : String = "Universitas Multi Data palembang"
    val addres3 : String = """
        +Jln. Rajawali
        +Sumatera Selatan
        +palembang
    """.trimMargin("+")

    println(university3)
    println(addres3)
    println()

    //==========================Trim Indent==========================================

    val university4 : String = "Universitas Multi Data palembang"
    val addres4 : String = """
        Jln. Rajawali
        Sumatera Selatan
        palembang
    """.trimIndent()

    println(university4)
    println(addres4)
}