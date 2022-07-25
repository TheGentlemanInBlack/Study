package workWithArifmetics

import kotlin.math.abs

fun main() {
    val (x1, y1) = readln().split(" ")
    val (x2, y2) = readln().split(" ")
    val x = abs(x2.toInt() - x1.toInt())
    val y = abs(y2.toInt() - y1.toInt())
    if (y == 1 && x == 2 || y == 2 && x == 1) println("YES") else println("NO")

}