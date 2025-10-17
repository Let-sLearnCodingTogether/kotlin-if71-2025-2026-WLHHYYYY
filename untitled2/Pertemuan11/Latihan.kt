package OOP

class Player(val name : String) {
    var health : Int = 100
    var level : Int = 1

    fun takeDamage(damage : Int){
        health -= damage
        if(health < 0){
            health = 0
        }
    }
    fun levelUp(){
        level += 1
        health = 100
    }
    fun showStatus(){
        println("Nama : $name, Level : $level, Health : $health")
    }
}

fun main(){
    val player = Player("Willi")

    player.showStatus()
    player.takeDamage(30)
    player.showStatus()
    player.levelUp()
    player.showStatus()

}

