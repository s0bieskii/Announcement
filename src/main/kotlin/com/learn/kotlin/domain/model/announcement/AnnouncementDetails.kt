package com.learn.kotlin.domain.model.announcement

import com.learn.kotlin.domain.model.company.Company
import com.learn.kotlin.domain.model.location.Location
import com.learn.kotlin.domain.model.technology.Technology
import java.util.*

data class AnnouncementDetails(
    var company: Company?,
    var technology: List<Technology>,
    val description: AnnouncementDescription,
    var contractType: Set<ContractType>,
    val location: Location
)

    val id: UUID = UUID.randomUUID()
