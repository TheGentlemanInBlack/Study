package workWithArifmetics

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600
const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24
const val MILLIS = 1000
const val SECONDS_IN_DAY = SECONDS_IN_HOUR * HOURS_IN_DAY

fun main() {
    val totalSeconds = System.currentTimeMillis() / MILLIS
    val hours = totalSeconds % SECONDS_IN_DAY / SECONDS_IN_HOUR
    val minutes = totalSeconds % SECONDS_IN_DAY % SECONDS_IN_HOUR / MINUTES_IN_HOUR
    val seconds = totalSeconds % SECONDS_IN_MINUTE
    println("$hours:$minutes:$seconds")
}