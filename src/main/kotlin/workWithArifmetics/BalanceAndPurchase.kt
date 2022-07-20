package workWithArifmetics

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    val totalBalance = balance
    var purchase = 0
    var totalPurchase = 0
    while (scanner.hasNextInt()) {
        purchase = scanner.nextInt()
        totalPurchase += purchase
        if (totalBalance >= totalPurchase) {
            balance -= purchase
        } else break
    }
    if (totalBalance < totalPurchase) {
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
    } else {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}