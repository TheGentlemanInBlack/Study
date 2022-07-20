package workWithArifmetics

import kotlin.math.roundToInt
const val TWO = 2

fun main() {
    val group1 = readln().toDouble() / TWO
    val group2 = readln().toDouble() / TWO
    val group3 = readln().toDouble() / TWO
    val sumAllStudents = group1.roundToInt() + group2.roundToInt() +group3.roundToInt()
    println(sumAllStudents)
}