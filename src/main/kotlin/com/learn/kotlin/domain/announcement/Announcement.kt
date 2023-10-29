package com.learn.kotlin.domain.announcement

import java.util.*

data class Announcement (val title: String, val details: AnnouncementDetails, var metadata: AnnouncementMetadata){
    val id: UUID = UUID.randomUUID()

}