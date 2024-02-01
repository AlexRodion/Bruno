package org.example

fun main() {
    val mlman = true
    val totalPrice = 100000
    val discount = 100
    val discountStart = 1000
    val percentDiscount = 0.05 * totalPrice
    val percentDiscountStart = 10000
    val mlmanDiscount = 0.99

    val result = if (!mlman) {
        if (totalPrice > percentDiscountStart) totalPrice - percentDiscount
        else if (totalPrice > discountStart) totalPrice - discount
        else totalPrice
    } else {
        if (totalPrice > percentDiscountStart) (totalPrice - percentDiscount) * mlmanDiscount
        else if (totalPrice > discountStart) (totalPrice - discount) * mlmanDiscount
        else totalPrice * mlmanDiscount
    }
    println("Итоговая цена в рублях: $result")
}