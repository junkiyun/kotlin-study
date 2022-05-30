package junkiyun.kotlinstudy.constructor

import org.springframework.stereotype.Component

@Component
class Book(val id: String = "",
           val name: String = "",
           val price: Int = 0) {
    init {
        println("init block")
    }

    constructor(id: String, name: String) : this(id, name, 0) {
        println("secondary constructor")
    }

    override fun toString(): String {
        return "${name.length} price"
    }
}