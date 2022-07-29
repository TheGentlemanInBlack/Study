package workWithStrings

fun main() {
    val inputString = readln()
    println(inputString.last() + inputString.substring(1, inputString.length - 1) + inputString.first())
}