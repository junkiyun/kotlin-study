package junkiyun.kotlinstudy.parameter

/**
 * Default Parameter, Named Parameter
 */

fun main() {
    val list = IntRange(1, 12).toList()

    println(count(list))
    println(count(list) { it % 3 == 0 })

    println(count(filter = { it % 5 == 0 }, list = list))
}

fun count(list: List<Int>, filter: (Int) -> Boolean = { true } ) : Int {
    return list.count(filter)
}