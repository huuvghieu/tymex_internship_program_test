import entities.Product
import java.text.DecimalFormat

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val inventory = listOf(
        Product("Laptop", 999.99, 5),
        Product("Smartphone", 499.99, 10),
        Product("Tablet", 299.99, 0),
        Product("Smartwatch", 199.99, 3),
    )

    println("Product List:\n")
    for (product in inventory) {
        println(product)
    }

    // Calculate the total inventory value
    println()
    val totalProductValues = inventory.sumOf { it.price * it.quantity }
    val formattedTotalValue = DecimalFormat("#,##0.00").format(totalProductValues)
    println("Total inventory value: $formattedTotalValue\n")

    // Find the most expensive product
    val mostExpensiveProduct = inventory.maxBy{ it.price }.name
    println("Most expensive product: $mostExpensiveProduct\n")

    // Check if "Headphones" is in stock
    val isHeadphonesInStock = inventory.any { it.name == "Headphones" }
    println("\"Headphones\" is in stock: $isHeadphonesInStock\n")

    // Sort products by price in descending order
    val listSortedByPriceDescending = inventory.sortedByDescending { it.price }
    println("Products sorted by price (descending): ${listSortedByPriceDescending.map { it.name }}\n")

    // Sort products by quantity in ascending order
    val listSortedByQuantityAscending = inventory.sortedBy { it.quantity }
    println("Products sorted by quantity (ascending): ${listSortedByQuantityAscending.map { it.name }}\n")
}
