package workWithArifmetics

fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    var multiAll: Long = 1
    for (i in firstNumber until secondNumber) {
        multiAll *= i
    }
    println(multiAll)
}
