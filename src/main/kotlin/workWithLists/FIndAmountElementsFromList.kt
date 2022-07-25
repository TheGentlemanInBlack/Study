package workWithLists

fun main() {
    var count = 0
    val listElements = MutableList(readln().toInt()) { readln().toInt() }
    val checkElement = readln().toInt()
    for (i in listElements) {
        if (i == checkElement) count++
    }
    println(count)
}