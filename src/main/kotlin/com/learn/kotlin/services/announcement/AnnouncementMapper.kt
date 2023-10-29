package com.learn.kotlin.services.announcement

import com.learn.kotlin.domain.announcement.Announcement
import com.learn.kotlin.domain.announcement.AnnouncementDescription
import com.learn.kotlin.domain.announcement.AnnouncementDetails
import com.learn.kotlin.domain.announcement.AnnouncementMetadata
import com.learn.kotlin.services.announcement.dto.CreateAnnouncementDto
import com.learn.kotlin.services.announcement.mapper.LocationMapper

class AnnouncementMapper private constructor() {
    companion object {
        fun toAnnouncement(announcement: CreateAnnouncementDto): Announcement {
            val description =
                AnnouncementDescription(announcement.details.description.short, announcement.details.description.full)
            val location = LocationMapper.toLocation(announcement.details.location)
            val details = AnnouncementDetails(emptyList(), description, announcement.details.contractType, location)
            return Announcement(announcement.title, details, AnnouncementMetadata(announcement.expirationInDays))
        }
    }
}