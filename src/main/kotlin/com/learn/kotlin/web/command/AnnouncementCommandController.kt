package com.learn.kotlin.web.command

import com.learn.kotlin.services.announcement.AnnouncementService
import com.learn.kotlin.services.announcement.dto.CreateAnnouncementDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class AnnouncementCommandController (val announcementService: AnnouncementService) {


    @GetMapping("/index")
    fun getIndex(@RequestBody create: CreateAnnouncementDto): ResponseEntity<UUID> {
        return ResponseEntity.ok(announcementService.createAnnouncement(create))
    }
}
