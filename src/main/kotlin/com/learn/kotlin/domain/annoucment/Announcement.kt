package com.learn.kotlin.domain.annoucment

import java.time.LocalDateTime
import java.util.UUID

data class Announcement constructor(val id:UUID, var title:String, val timestamp:LocalDateTime){

    fun s() {
    }

}