fun main() {
    val firstUser : Triple<String, Int, Boolean> = Triple("user 1", 20, true)

    println(firstUser.first)
    println(firstUser.second)
    println(firstUser.third)
    println()

    val secondUser : Triple<String, Int, Boolean> = Triple("user 1", 20, true)
    val(username, age, bool) = secondUser

    println(username)
    println(age)
    println(bool)
}