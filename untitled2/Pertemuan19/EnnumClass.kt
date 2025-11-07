enum class DayOfTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }

    println(DayOfTheWeek.valueOf("Senin"))

    val today = DayOfTheWeek.valueOf("Senin")

    when (today){
        DayOfTheWeek.Senin -> println("Yesss harini senin!!")
        DayOfTheWeek.Selasa -> println("Waduh selasa ni!!")
        DayOfTheWeek.Rabu -> println("Kacauu minggu masih lama!!")
        DayOfTheWeek.Kamis -> println("ayo ayo udah kamis!!")
        DayOfTheWeek.Jumat -> println("jumat males banget!!")
        DayOfTheWeek.Sabtu -> println("gamau sabtuu!!")
        DayOfTheWeek.Minggu -> println("widihh minggu ni!!")
        else -> println("kalo ga hari liburr ya apalagi?")
    }
}