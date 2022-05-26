package junkiyun.kotlinstudy.concurrent

import junkiyun.kotlinstudy.concurrent.ConcurrentConstants.delay
import junkiyun.kotlinstudy.concurrent.ConcurrentConstants.iteration
import java.util.concurrent.Executors
import kotlin.concurrent.thread

fun main() {
    runInThreadPool()
}

/**
 * possible out of memory
 */
private fun noThreadPool() {
    repeat(iteration) {
        thread {
            waitAndResume(it)
        }
    }
}

/**
 * 눈으로 봐도 느리다
 */
private fun runInThreadPool() {
    repeat(iteration) {
        pool.submit {
            waitAndResume(it)
        }
    }
}

private val pool = Executors.newFixedThreadPool(1000)

private fun waitAndResume(param: Int) {
    Thread.sleep(delay)
    println(param)
}