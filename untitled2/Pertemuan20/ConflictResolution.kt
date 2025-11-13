package nextOOP

interface MoveA {
    fun move(){
        print("move A")
    }
}

interface MoveB {
    fun move(){
        print("move B")
    }
}

class Human : MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}

fun main(){
    val human1 = Human()
    human1.move()
}