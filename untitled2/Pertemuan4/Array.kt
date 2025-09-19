fun main() {
    val users : Array<String> = arrayOf("user 1","user 2","user 3")

    println(users[0])

    users.set(2, "user 3 update")
    println(users[2])

    users[2] = "user 3 update user"
    println(users[2])
    
    println("size : ${users.size}")
}