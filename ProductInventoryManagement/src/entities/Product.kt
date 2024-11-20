package entities

class Product {
    lateinit var name : String
    var price : Double = 0.0
    var quantity : Int = 0

    constructor(name: String, price: Double, quantity: Int) {
        this.name = name
        this.price = price
        this.quantity = quantity
    }

    override fun toString(): String {
        return "$name: price $price, quantity $quantity"
    }

}