package junkiyun.kotlinstudy.functional

fun main() {
    println(myFunction(100).invoke(1, "abc", 3))
}

/**
 * 이 코드만으로 function을 정의 및 return 할 수 있고,
 * 이 코드만 봐도 function의 형태를 바로 알 수 있다.
 */
private fun myFunction(x: Int) : (Int, String, Int) -> Int {
    return { a, b, c -> x * (a * b.length + c) }
}