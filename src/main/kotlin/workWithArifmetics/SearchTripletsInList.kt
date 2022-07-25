package workWithArifmetics

fun main() {
    var count = 0
    val listElements = MutableList(readln().toInt()) { readln().toInt() }
    for (i in 0 until listElements.size - 2) {
        if (listElements[i] + 1 == listElements[i + 1] && listElements[i + 1] + 1 == listElements[i + 2]) count++
    }
    println(count)
}