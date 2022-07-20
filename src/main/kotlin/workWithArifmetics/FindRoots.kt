package workWithArifmetics

const val FIRST_ELEMENT = 0
const val LAST_ELEMENT = 1000

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (i in FIRST_ELEMENT..LAST_ELEMENT) {
        if (a * i * i * i + b * i * i + c * i + d == 0) {
            println(i)
        }
    }
}