package workWithStrings

fun main() {
    val inputString = readln().split(" ")
    var numberDrop = inputString[1].toInt()
    if (numberDrop < 0) numberDrop = 0
    if (numberDrop > inputString[0].length) println(inputString[0])
    else println(inputString[0].substring(numberDrop) + inputString[0].substring(0, numberDrop))
}