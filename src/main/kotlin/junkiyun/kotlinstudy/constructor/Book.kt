package junkiyun.kotlinstudy.constructor

class Book(val id: String,
           val name: String,
           val price: Int) {
    init {
        println("init block")
    }

    constructor(id: String, name: String) : this(id, name, 0) {
        println("secondary constructor")
    }
}