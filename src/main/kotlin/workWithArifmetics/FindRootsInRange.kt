package workWithArifmetics

fun main() {
    val firstElement = 1
    val lastElement = readln().toInt()
    for (i in firstElement..lastElement) {
        if (i * i <=lastElement) {
            println(i * i)
        }else break
    }
}