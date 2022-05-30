package junkiyun.kotlinstudy.constructor

class BookService(val book: Book) {
    fun getBookPrice() = book.toString()
}