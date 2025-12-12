class ArrayListQueue<T> {

    private val items = ArrayList<T>()

    fun enqueue(value: T) {
        items.add(value)
    }

    fun dequeue(): T? {
        return if (items.isNotEmpty()) items.removeAt(0) else null
    }

    fun peek(): T? {
        return items.firstOrNull()
    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun size(): Int {
        return items.size
    }

    override fun toString(): String {
        return items.toString()
    }
}

fun main() {
    val queue = ArrayListQueue<Int>()

    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)

    println("Queue awal: $queue")
    println("Peek: ${queue.peek()}")

    println("Dequeue: ${queue.dequeue()}")
    println("Setelah dequeue: $queue")

    println("Ukuran queue: ${queue.size()}")
    println("Apakah queue kosong? ${queue.isEmpty()}")
}
