package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")
    login()

    println("Pindah Halaman dari login ke Home")
}

suspend fun login() {
    println("melakukan validasi email & password")
    delay(2_000)
    println("Validasi Sukses")
}