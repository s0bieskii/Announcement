package com.learn.kotlin.services.announcement

import com.learn.kotlin.domain.model.announcement.Announcement
import com.learn.kotlin.domain.model.announcement.AnnouncementMetadata
import com.learn.kotlin.services.announcement.dto.CreateAnnouncementDto

class AnnouncementMapper private constructor() {
    companion object {
        fun toAnnouncement(announcement: CreateAnnouncementDto): Announcement {
            val description =
//                AnnouncementDescription(announcement.details.description.short, announcement.details.description.full)
//            val location = LocationMapper.toLocation(announcement.details.location)
//            val details = AnnouncementDetails(null, emptyList(), description, announcement.details.contractType, location)
            return Announcement(announcement.title, null, AnnouncementMetadata(announcement.expirationInDays))
        }
    }
}