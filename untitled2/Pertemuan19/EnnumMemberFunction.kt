enum class DayOfTheWeek3(val isWeekend : Boolean) {
    Senin(isWeekend = false),
    Selasa(isWeekend = false),
    Rabu(isWeekend = false),
    Kamis(isWeekend = false),
    Jumat(isWeekend = false),
    Sabtu(isWeekend = true),
    Minggu(isWeekend = true);

    fun daysUntil(targetHari: DayOfTheWeek3): Int {
        return if(this.ordinal < targetHari.ordinal){
            targetHari.ordinal - this.ordinal
        }else{
            0
        }

    }
}

fun main() {
    println(DayOfTheWeek3.Senin.daysUntil(DayOfTheWeek3.Minggu))
}