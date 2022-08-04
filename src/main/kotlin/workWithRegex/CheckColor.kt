package workWithRegex

fun main() {
    val color = readln()
    val regex = Regex("colo.?r.?")
    println(color.matches(regex))
}