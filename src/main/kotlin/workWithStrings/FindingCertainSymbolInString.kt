package workWithStrings

fun main() {
    val inputString = readln()
    val inputNumber = readln().toInt()
    println("Symbol # $inputNumber of the string \"$inputString\" is \'${inputString[inputNumber - 1]}\'")
}