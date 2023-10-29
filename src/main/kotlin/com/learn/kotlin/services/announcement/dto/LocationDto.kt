package com.learn.kotlin.services.announcement.dto

import java.util.*

data class LocationDto(
    var id: UUID?,
    val country: String,
    val city: String,
    val street: String,
    val postalCode: String,
    val latitude: Double,
    val longitude: Double)