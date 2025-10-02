fun main() {
    val users : Array<String> =arrayOf("User 1","User 2","User 3")

    println("Ukuran Array ${users.size}")
    println("Range Array ${users.indices}")
    users.forEach {
        println("Foreach : $it")
    }
    users.forEach { user->
        println("Foreach : $user")
    }

    users.forEachIndexed { index,user->
        println("Foreach index: ${index+1}, $user")
    }
}