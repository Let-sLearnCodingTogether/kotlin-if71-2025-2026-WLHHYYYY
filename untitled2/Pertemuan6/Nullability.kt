fun hitungPanjangNama(name:String?): Int{
    if(name!=null){
        return name.length
    }
    return 0
}
fun main(){
    println(hitungPanjangNama("wili"))
    println(hitungPanjangNama(null))
}
------------

val name: String? = null
val finalName = name ?: "Tidak diketahui"

println(finalName) // output: Tidak diketahui

val name: String? = null
val length = name?.length ?: 0

---------------

println(length) // output: 0
fun greetUser(name: String?) {
    val finalName = name ?: "Tamu"
    println("Halo, $finalName!")
}

fun main() {
    greetUser("William") // Halo, William!
    greetUser(null)      // Halo, Tamu!
}

------------

fun main() {
    print("Masukkan nama Anda: ")
    val input = readLine()

    val name = input ?: "Anonim"
    println("Selamat datang, $name!")
}

-----------
fun getUsername(name: String?): String {
    return name ?: throw IllegalArgumentException("Nama tidak boleh kosong!")
}

fun main() {
    println(getUsername("William")) // ✅ William
    println(getUsername(null))      // ❌ Error: Nama tidak boleh kosong!
}

---------------
fun printLength(text: String?) {
    val length = text?.length ?: return
    println("Panjang teks: $length")
}

fun main() {
    printLength("Halo") // Panjang teks: 4
    printLength(null)   // tidak mencetak apa-apa
}

---------------

data class User(val name: String?, val age: Int?)

fun printUserInfo(user: User?) {
    val userName = user?.name ?: "Tanpa Nama"
    val userAge = user?.age ?: 0

    println("Nama: $userName, Umur: $userAge tahun")
}

fun main() {
    val user1 = User("William", 20)
    val user2 = User(null, null)
    val user3: User? = null

    printUserInfo(user1) // Nama: William, Umur: 20 tahun
    printUserInfo(user2) // Nama: Tanpa Nama, Umur: 0 tahun
    printUserInfo(user3) // Nama: Tanpa Nama, Umur: 0 tahun
}

-------------------
fun sapa(nama: String?) {
    val finalNama = nama ?: "Tamu"
    println("Halo, $finalNama!")
}

fun main() {
    sapa("William") // Halo, William!
    sapa(null)      // Halo, Tamu!
}

--------------------
fun ambilNama(nama: String?): String {
    return nama ?: throw IllegalArgumentException("Nama tidak boleh kosong!")
}

println(ambilNama("William")) // OK
println(ambilNama(null))      // ❌ Error: Nama tidak boleh kosong!

-------------------
        