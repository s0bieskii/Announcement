package com.learn.kotlin.persistance.announcement

import com.learn.kotlin.domain.announcement.Announcement
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Service
internal class AnnouncementInMemoryRepository : AnnouncementRepository {
    val database = ConcurrentHashMap<UUID, Announcement>()

    override fun save(announcement: Announcement) {
        database.putIfAbsent(announcement.id, announcement)
    }


}