package junkiyun.kotlinstudy.constructor

import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.mockito.kotlin.mock
import org.mockito.kotlin.willReturn

class BookServiceTest {
    @Test
    fun testBookName() {
        val mock = mock<Book> {
            given(it.toString()) willReturn { "aaa" }
        }
        val bookService = BookService(mock)
        println(bookService.getBookPrice())
    }
}