package workWithLists

fun main() {
    val amountIteration = readln().toInt()
    val amountAllGrades = mutableListOf(0, 0, 0, 0)
    repeat(amountIteration) {
        when(readln().toInt()) {
            2 -> amountAllGrades[0] += 1
            3 -> amountAllGrades[1] += 1
            4 -> amountAllGrades[2] += 1
            5 -> amountAllGrades[3] += 1
            else -> println("Grade not exist")
        }
    }
    println(amountAllGrades.toString()
        .replace("[","")
        .replace("]","")
        .replace(",",""))
}