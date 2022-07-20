package workWithRange

import java.util.*

const val NEGATIVE_FIFTEEN = -16
const val TWELVE = 12
const val FOURTEEN = 14
const val SEVENTEEN = 17
const val NINETEEN = 19
const val POSITIVE_INFINITY = Double.POSITIVE_INFINITY

fun main() {
    val inputNumber = readln().toInt()
    val checkInterval = inputNumber in NEGATIVE_FIFTEEN..TWELVE || inputNumber in FOURTEEN..SEVENTEEN ||
            NINETEEN <= inputNumber && inputNumber < POSITIVE_INFINITY
    println(checkInterval.toString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}
