package com.learn.kotlin.domain.model.location

import java.util.*

data class Location(
    val country: String,
    val countryCode: String,
    val city: String,
    val street: String,
    val postalCode: String,
    val latitude: Double,
    val longitude: Double
) {
    val id: UUID = UUID.randomUUID()
}
