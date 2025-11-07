enum class DayOfTheWeek2(val isWeekend : Boolean) {
    Senin(isWeekend = false),
    Selasa(isWeekend = false),
    Rabu(isWeekend = false),
    Kamis(isWeekend = false),
    Jumat(isWeekend = false),
    Sabtu(isWeekend = true),
    Minggu(isWeekend = true)
}

fun main() {
    val today = DayOfTheWeek2.Minggu
    println("hari ini : hari ${today.name}, " +
            "hari ini weekend : ${today.isWeekend}")
}