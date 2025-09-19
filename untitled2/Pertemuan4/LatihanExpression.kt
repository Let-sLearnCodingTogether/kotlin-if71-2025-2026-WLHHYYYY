fun main() {
    var finalExam = 25

    when(finalExam) {
        in 0..10 -> {
            finalExam = 10
            println(finalExam)
        }
        in 10..20 -> {
            finalExam = 100
            println(finalExam)
        }
        in 20..30 -> {
            finalExam = 1000
            println(finalExam)
        }
        else -> {
            println("salah")
        }
    }
}