package workWithRegex

fun main() {
    val report = readLine()!!
    val regex = Regex(".? wrong answer.?")
    println(report.matches(regex))

}