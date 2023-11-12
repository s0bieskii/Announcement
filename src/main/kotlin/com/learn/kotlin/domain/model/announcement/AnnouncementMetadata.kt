package com.learn.kotlin.domain.model.announcement

import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime
import java.util.*

@Table("ANNOUNCEMENT_METADATA")
data class AnnouncementMetadata(val howManyDays: Long) {
    val id: UUID = UUID.randomUUID()
    val creationDate: LocalDateTime = LocalDateTime.now()
    val expirationDate = LocalDateTime.now().plusDays(howManyDays)
    var applicationCounter: Int = 0
}

