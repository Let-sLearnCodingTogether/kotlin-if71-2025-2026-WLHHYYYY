package Coroutine

import java.util.concurrent.Executors
fun main(){
    //val executor = Executors.newFixedThreadPool(10)
   // val executor = Executors.newCachedThreadPool(10)
    val executor = Executors.newSingleThreadExecutor(10)

    for(i in 1..10){
        executor.submit{
            val threadName = Thread.currentThread().name

            println("tugas $i berjalan di thread $threadName")

            Thread.sleep(1_000)
        }
    }
}