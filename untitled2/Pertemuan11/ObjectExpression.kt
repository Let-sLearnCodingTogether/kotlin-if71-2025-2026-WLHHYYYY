package OOP

fun main(){
    val person = object{
        val name = "William"
        fun greet() : String {
            return "Hello $name"
        }
    }
    println(person.greet())
}