package com.learn.kotlin.services.announcement

import com.learn.kotlin.domain.model.announcement.Announcement
import com.learn.kotlin.persistance.DatabaseFacade
import com.learn.kotlin.services.announcement.dto.CreateAnnouncementDto
import org.springframework.stereotype.Service
import org.springframework.web.server.NotAcceptableStatusException
import java.util.*

@Service
class AnnouncementService {
    val repositoryFacade: DatabaseFacade

    constructor(repositoryFacade: DatabaseFacade) {
        this.repositoryFacade = repositoryFacade
    }

    fun createAnnouncement(createDto: CreateAnnouncementDto): UUID {
        val toSave = AnnouncementMapper.toAnnouncement(createDto)
        repositoryFacade.announcementRepository.save(toSave)
        return toSave.id
    }

    fun get(id: UUID): Announcement {
        return repositoryFacade.announcementRepository.findById(id).orElseThrow { NotAcceptableStatusException("wow") }
    }
}