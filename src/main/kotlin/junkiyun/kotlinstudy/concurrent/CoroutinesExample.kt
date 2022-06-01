package junkiyun.kotlinstudy.concurrent

import junkiyun.kotlinstudy.concurrent.ConcurrentConstants.delay
import junkiyun.kotlinstudy.concurrent.ConcurrentConstants.iteration
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.math.max
import kotlin.random.Random

fun main() = runBlocking {
    repeat(iteration) {
        launch {
            println("${Thread.currentThread()}: ${callApi()}")
        }
    }
}
private suspend fun callApi(coroutineContext: CoroutineContext = Dispatchers.IO) : Int {
    return withContext(coroutineContext) {
        async {
            delay(delay)
            max(Random.nextInt(), 0)
        }
    }.await()
}

private suspend fun waitAndResume(param: Int) {
    delay(delay)
    println(param)
}