package junkiyun.kotlinstudy.scopefunc

/**
 * Lambda Argument: it
 * Lambda Receiver: this
 * @see "https://kotlinlang.org/docs/scope-functions.html"
 */

fun main() {
    // apply: receiver -> object
    val player = Player().apply {
        name = "Neymar Jr."
        birthYear = 1992
        country = "Brazil"
    }
    println(player.name)

    player.id = "xxxxx"

    // also: argument -> object
    val player2 = player.also {
        println(it.id)
    }

    println(player == player2)

    // let: argument -> Lambda Result
    val name = player.let {
        println(it.id)
        it.name
    }
    println(name)

    // with: receiver-> lambda result
    val name2 = with(player) {
        println(age())
        println(whereRUFrom())
        player.name
    }
    println(name2)

    // run: receiver -> lambda result
    val name3 = player.run {
        println(age())
        println(whereRUFrom())
        player.name
    }
    println(name3)
}