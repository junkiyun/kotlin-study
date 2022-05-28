package junkiyun.kotlinstudy.scopefunc

import java.time.LocalDate
import kotlin.properties.Delegates

class Player {
    var id = ""
    var name: String by Delegates.notNull()
    var birthYear by Delegates.observable(0) { _, old, new -> println("id has been changed from $old to $new") }
    lateinit var country: String
    fun age() = LocalDate.now().year
    fun whereRUFrom() = "I'm from $country"
}