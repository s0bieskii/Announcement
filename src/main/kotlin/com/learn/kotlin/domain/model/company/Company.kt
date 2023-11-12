package com.learn.kotlin.domain.model.company

import com.learn.kotlin.domain.model.location.Location
import java.util.*

data class Company(val id: UUID, var name: String, var location: List<Location>)