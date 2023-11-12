package com.learn.kotlin.persistance.announcement

import com.learn.kotlin.domain.model.announcement.Announcement
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AnnouncementReadRepository : CrudRepository<Announcement, UUID> {
    override fun findById(id: UUID): Optional<Announcement>
    fun  save(announcement: Announcement): Unit
}