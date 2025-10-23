import kotlin.properties.Delegates

class Game {
    var highScore: Int = 0

    var score: Int by Delegates.observable(initialValue = 0) { property, oldValue, newValue ->
        println("Properti ${property.name} berubah dari $oldValue ke $newValue")
        if (newValue > oldValue) {
            highScore = newValue
        }
    }

    fun updateScore(newScore: Int) {
        score = newScore
    }
}

fun main() {
    val game = Game()

    game.updateScore(newScore = 10)  // Memperbarui score melalui fungsi
    println("High score: ${game.highScore}")  // Menampilkan high score

    game.score = 20  // Mengubah score secara langsung
    println("High score: ${game.highScore}")  // Menampilkan high score
}
