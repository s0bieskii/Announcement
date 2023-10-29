package com.learn.kotlin.domain.announcement

import com.learn.kotlin.domain.location.Location
import com.learn.kotlin.domain.technology.Technology
import java.util.*

data class AnnouncementDetails(
    var technology: List<Technology>,
    val description: AnnouncementDescription,
    var contractType: Set<ContractType>,
    val location: Location)

    val id: UUID = UUID.randomUUID()
