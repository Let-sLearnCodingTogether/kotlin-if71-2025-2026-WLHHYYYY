fun main() {

    print("Masukkan nama pemain: ")
    val namaPemain: String = readln()
    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2
    var sedangBermain = true

    println("\n=== PETUALANGAN GUA ===")
    while (sedangBermain) {
        println("\nStatus Pemain:")
        println("Nama       : $namaPemain")
        println("Kesehatan  : $kesehatanPemain")
        println("Potion     : $jumlahPotion")
        println("Punya Kunci: $punyaKunciEmas")

        if (kesehatanPemain <= 0) {
            println("️ Kamu kehabisan kesehatan. Permainan berakhir!")
            break
        }

        println("\nDidepan kamu terdapat 2 buah jalur (1, 2):")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1/2): ")
        val pilihanJalur = readln()

        if (pilihanJalur == "1") {
            // Ruangan Teka-teki (looping selama belum dapat kunci emas dan masih hidup)
            println("\nKamu berada di sebuah ruangan dengan tiga patung: naga, griffin, dan ular.")

            print("Pilih salah satu patung: ")
            val pilihanPatung = readln().lowercase()

            when (pilihanPatung) {
                "naga" -> {
                    println("Patung naga menyemburkan api! Kesehatanmu berkurang 35.")
                    kesehatanPemain -= 35
                }
                "griffin" -> {
                    println("Patung griffin bersinar dan kamu mendapatkan kunci emas!")
                    punyaKunciEmas = true
                    jumlahPotion = 0
                }
                "ular" -> {
                    println("Patung ular menggigitmu! Kesehatanmu berkurang 15.")
                    kesehatanPemain -= 15
                }
                else -> {
                    println("Kamu kebingungan dan tidak memilih patung dengan benar, waktumu terbuang sia-sia.")
                }
            }

            if (jumlahPotion > 0 && kesehatanPemain > 0) {
                print("Gunakan potion untuk memulihkan kesehatan? (y/n): ")
                val pakaiPotion = readln().lowercase()
                if (pakaiPotion == "y") {
                    kesehatanPemain += 10
                    if (kesehatanPemain > 100) kesehatanPemain = 100
                    jumlahPotion--
                    println("Kesehatanmu sekarang: $kesehatanPemain (Potion tersisa: $jumlahPotion)")
                }
            }

        } else if (pilihanJalur == "2") {
            println("Kamu menginjak perangkap! Kesehatanmu berkurang 25.")
            kesehatanPemain -= 25
        } else {
            println("Pilihan tidak valid, kamu tersesat!")
        }

        if (punyaKunciEmas) {
            println("\nKamu menemukan pintu terakhir...")
            println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
            println("\n=== Permainan Selesai, kamu MENANG! ===")
            sedangBermain = false
        } else if (kesehatanPemain <= 0) {
            println("\nKamu tidak sanggup melanjutkan perjalanan...")
            println("=== Permainan Selesai, kamu KALAH ===")
            sedangBermain = false
        }
    }
}
