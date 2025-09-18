fun main() {
    val firstUser: Pair<String, Byte> = Pair("User 1", 20)

    //Destructuring
    val(username, age) = firstUser

    println(username)
    println(age)
}