package com.rsk

import com.rsk.Meeting
import com.rsk.Address

fun main(args: Array<String>) {
    val m = Meeting()

//    m.addTitle("Tittle")
////    m.addTitle(null)
//
//    val title: String? = m.meetingTitle()
//
//    println(title)

    val title: String = m.titleCanBeNull()?: "No Title"
    println(title)
}

// we have flexibility in this since we are not dealing with annotation-so we can also assign null
class HomeAddress: Address{
    override fun getFirstAddress(): String {
        return ""
    }

}

class WorkAddress: Address{
    override fun getFirstAddress(): String? {
        return ""
    }

}