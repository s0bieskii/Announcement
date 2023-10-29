package com.learn.kotlin.services.announcement.dto

import com.learn.kotlin.domain.announcement.ContractType

data class AnnouncementDetailsDto(
    var technologyNames: List<String>,
    val description: AnnouncementDescriptionCreateDto,
    var contractType: Set<ContractType>,
    val location: LocationDto)