package com.learn.kotlin.domain.company

import com.learn.kotlin.domain.location.Location
import java.util.*

data class Company(val id: UUID, var name: String, var location: List<Location>)