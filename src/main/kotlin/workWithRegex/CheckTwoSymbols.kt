package workWithRegex

fun main() {
    val answer = readln()
    val regex = Regex("I can.?.? do my homework on time!")
    println(answer.matches(regex))
}