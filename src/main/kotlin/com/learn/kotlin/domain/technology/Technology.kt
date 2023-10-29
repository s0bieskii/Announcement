package com.learn.kotlin.domain.technology

import java.util.*

data class Technology(var name: String) {
    val id: UUID = UUID.randomUUID()
}
