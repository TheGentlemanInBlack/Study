package workWithCycles

fun main() {
    val inputNumber = readln().toInt()
    var count = 1
    var iteration = 1
    while (count <= inputNumber) {
        repeat(iteration) {
            if (count <= inputNumber) print("$iteration ")
            count++
        }
        iteration++
    }
}