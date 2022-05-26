package junkiyun.kotlinstudy.extfunc

fun main() {
    println(3.power(1))
}

private fun Int.power(exp: Int) : Int {
    if (exp == 0) {
        return 1
    }
    return 0
}