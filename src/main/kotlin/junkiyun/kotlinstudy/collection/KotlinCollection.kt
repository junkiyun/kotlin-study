package junkiyun.kotlinstudy.collection

/**
 * Java에 비해 stream 관련 코드가 간결하다.
 * map 로직만 작성하면 충분하다.
 * @see JavaCollection
 *
 * Kotlin의 Collectable은 mutability가 명시적이다.
 * @see List
 * @see listOf
 * @see MutableList
 * @see mutableListOf
 */

fun main() {
//    val integerList = listOf(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    val integerList = IntRange(1, 10).map { it % 5 }.toList()

    println("toStringList")
    toStringList(integerList).forEach { println(it)}

    println("toIntegerSet")
    toIntegerSet(integerList).forEach { println(it)}

    println("toStringSet")
    toStringSet(integerList).forEach { println(it) }

    println("mutate")
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutate(mutableList).forEach { println(it) }

}

private fun toStringList(integerList: List<Int>) : List<String> {
    return integerList.map { it.toString() }
}

private fun toIntegerSet(integerList: List<Int>) : Set<Int> {
    return integerList.toSet()
}

private fun toStringSet(integerList: List<Int>) : Set<String> {
    return integerList.map { it.toString() }.toSet()
}

/**
 * Kotlin에서는 아래와 같이 명시적으로 MutableList로 선언해야 변경 가능한 List다.
 * List로 선언하면 set method가 없으므로 parameter로 제공한 List가 변경될 우려가 없다.
 */
private fun mutate(mutableList: MutableList<Int>) : Set<Int> {
    mutableList[0] = 2
    return mutableList.toSet()
}