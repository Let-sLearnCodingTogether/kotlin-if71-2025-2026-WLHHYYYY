package oop

data class GameItem(
    val id: Int,
    val name: String,
    val value: Int,
    val rarity: String
)

fun main() {
    val inventory = mutableListOf<GameItem>()

    val item1 = GameItem(0, "Pedang Besi", 100, "Common")
    val item2 = GameItem(1, "Ramuan Kesehatan", 50, "Common")
    val item3 = GameItem(2, "Jubah Bayangan", 500, "Epic")

    inventory.addAll(listOf(item1, item2, item3))

    val cursedSword = item1.copy(name = "Pedang Besi Terkutuk", value = 250)

    println("Objek Pedang Besi asli: $item1")
    println("Objek Pedang Besi Terkutuk: $cursedSword")

    println("\nIsi Inventaris:")
    inventory.forEach { println(it) }
}

