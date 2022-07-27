package workWithRange

fun main() {
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    for (i in firstNumber..secondNumber) {
        if (i % 3 == 0 && i % 15 != 0) println("Fizz")
        else if (i % 5 == 0 && i % 15 != 0) println("Buzz")
        else if (i % 3 == 0) println("FizzBuzz")
        else println(i)
    }
}