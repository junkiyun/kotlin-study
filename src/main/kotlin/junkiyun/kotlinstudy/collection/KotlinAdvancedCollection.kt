package junkiyun.kotlinstudy.collection

fun main() {
    zip()
}

fun flatMap() {
    listOf(listOf(1, 2), listOf(3, 4))
        .flatten() // flatMap { it }
        .forEach { println(it) }
}

fun single() {
    listOf(1).single().also {
        println(it)
    }
}

fun union() {
    listOf(1, 3).union(listOf(2, 3)).also { println(it) }
}

fun unzip() {
    listOf(Pair(1, 2), Pair(3, 4))
        .unzip().also { println(it) }
        .run {
            println(first)
            println(second)
        }
}

fun zip() {
    listOf(1, 3, 5).zip(listOf(2, 4, 6))
        .map { it.toList() }
        .flatten()
        .also { println(it) }
}