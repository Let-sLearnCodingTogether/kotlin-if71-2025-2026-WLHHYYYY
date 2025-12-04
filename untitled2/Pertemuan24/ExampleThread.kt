import java.util.Date

fun main() {

    val task = Runnable {
        println(Date())
        Thread.sleep(2_000)
        println("hello")
    }

    val thread0 = Thread(task)
    val thread1 = Thread(task)

    thread0.start()
    thread1.start()

    println("program selesai")
}
