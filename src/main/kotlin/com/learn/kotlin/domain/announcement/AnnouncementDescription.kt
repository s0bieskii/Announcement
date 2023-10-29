package com.learn.kotlin.domain.announcement

import java.util.*

data class AnnouncementDescription(
    val short: String,
    val full: String
) {

    val id: UUID = UUID.randomUUID()
}