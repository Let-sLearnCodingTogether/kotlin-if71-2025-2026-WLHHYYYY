fun main(){
    println("Nama kamu ?")
    val name = readln()

    println("Umur kamu ?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()

    if(age != null){
        println("Nama kamu : $name")
        println("Umur kamu :$age")
    }
    else{
        println("Umur tidak valid")
    }
}