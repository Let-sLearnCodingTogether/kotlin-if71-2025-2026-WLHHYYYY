package oop

data class User(val name: String, val age : Int)

fun main(){
    val user = User(name = "William", age = 21)
    val userCopy = user.copy()
    val userCopyAge = user.copy(age=22)
    println(user)
    println(userCopy)
    println(userCopyAge)
}