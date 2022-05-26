package junkiyun.kotlinstudy.nullsafety

/**
 * Kotlin은 not null, nullable이 있다.
 * not null varaible에 null 값이 들어가는 상황은 compile time에 차단된다.
 */

fun main() {
    println(length(null))
}

/**
 * Elvis operator로 간단하게 null 처리가 가능하다.
 */
private fun length(s: String?) : Int {
    return s?.length ?: 0
}

/**
 * sumNullSafe(null)은 compile error
 */
private fun lengthNullSafe(s: String) : Int {
    return s.length
}