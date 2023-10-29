package com.learn.kotlin.services.announcement.dto

data class CreateAnnouncementDto(val title: String, val details: AnnouncementDetailsDto, val expirationInDays: Long) {
}