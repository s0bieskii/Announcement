package com.learn.kotlin.persistance.announcement

import com.learn.kotlin.domain.announcement.Announcement
import org.springframework.stereotype.Service

@Service
interface AnnouncementRepository {

    fun save(announcement: Announcement): Unit
}