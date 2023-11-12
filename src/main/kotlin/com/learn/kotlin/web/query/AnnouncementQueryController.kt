package com.learn.kotlin.web.query

import com.learn.kotlin.domain.model.announcement.Announcement
import com.learn.kotlin.services.announcement.AnnouncementService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class AnnouncementQueryController (val announcementService: AnnouncementService) {

    @GetMapping("/get")
    fun getAnnouncement(@RequestBody id: String): ResponseEntity<Announcement> {
        return ResponseEntity.ok(announcementService.get(UUID.fromString(id)))
    }
}
