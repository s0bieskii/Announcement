package com.learn.kotlin.domain.model.announcement

import org.springframework.data.annotation.Id
import java.util.*

data class Announcement (val title: String, val details: AnnouncementDetails?, var metadata: AnnouncementMetadata?){
    @Id
    val id: UUID = UUID.randomUUID()

}