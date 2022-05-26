package junkiyun.kotlinstudy.extfunc

fun main() {
    println(myFunc(2, 5))
}

fun myFunc(x: Int, y: Int) : Int {
    return x.power(y)
}

/**
 * extension function은 범위 제한이 가능하다.
 */
private fun Int.power(exp: Int) : Int {
    if (exp == 0) {
        return 1
    }
    if (exp == 1) {
        return this
    }
    val half = power(exp / 2)
    if (exp % 2 == 0) {
        return half * half
    }
    return half * half * this
}