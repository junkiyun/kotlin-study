package junkiyun.kotlinstudy.string

fun main() {
    printFormattedMessage(3000)
    printMultiLineMessage("adsf", "my book", 1000)
}

private fun printFormattedMessage(price: Int) {
    println("price of the book is $price")
    println(String.format(messageFormat, price))
}

/**
 * Java 는 Java 15부터 text block 지원함.
 */
private fun printMultiLineMessage(id: String, name: String, price: Int) {
    println("""
        id: $id
        name: $name
        price: $price
    """.trimIndent())
}

private const val messageFormat = "price of the book is %s"