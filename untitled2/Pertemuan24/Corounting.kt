fun main (){
    val thread0 = Thread {
        println("Thread 0 : ${Thread.currentThread().name}")
        Thread.sleep(2_000)
        println("Hello dari thread 0")
    }
    val thread1 = Thread {
        println("Thread 1 : ${Thread.currentThread().name}")
        Thread.sleep(2_000)
        println("Hello dari thread 1")
    }

    thread0.start()
    thread1.start()
}