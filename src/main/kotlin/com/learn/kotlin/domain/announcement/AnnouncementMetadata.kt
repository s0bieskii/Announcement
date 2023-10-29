package com.learn.kotlin.domain.announcement

import java.time.LocalDateTime
import java.util.*

data class AnnouncementMetadata(val howManyDays: Long) {
    val id: UUID = UUID.randomUUID()
    val creationDate: LocalDateTime = LocalDateTime.now()
    val expirationDate = LocalDateTime.now().plusDays(howManyDays)
    var applicationCounter: Int = 0
}

