package com.learn.kotlin.services.announcement.dto

import java.util.*

data class LocationDto(
    val country: String,
    val countryCode: String,
    val city: String,
    val street: String,
    val postalCode: String,
    val latitude: Double,
    val longitude: Double) {
    var id: UUID = UUID.randomUUID()
}