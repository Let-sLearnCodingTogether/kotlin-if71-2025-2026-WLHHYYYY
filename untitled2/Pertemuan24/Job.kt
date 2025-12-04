import kotlinx.coroutines.*

fun main() = runBlocking {  // runBlocking untuk menjalankan coroutine dalam main thread
    println("Aplikasi dimulai")

    // CoroutineScope menjalankan coroutine dengan launch
    val job: Job = launch {
        updateVersion1()
    }

    // Menunggu job selesai
    println("Job selesai? ${job.isCompleted}")
    println("Apakah job ini aktif? ${job.isActive}")
    println("Apakah job ini dibatalkan? ${job.isCancelled}")
}

suspend fun updateVersion1() {
    // Fungsi ini bisa berisi proses suspend, misalnya delay atau pemanggilan API
    delay(2000)  // Contoh simulasi tugas yang memerlukan waktu
    println("Version 1 diperbarui!")
}
