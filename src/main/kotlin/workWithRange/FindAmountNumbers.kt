package workWithRange

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var amountNumbers = 0

    for (i in a..b) {
        if (i % n == 0) {
            amountNumbers++
        }
    }
    println(amountNumbers)
}