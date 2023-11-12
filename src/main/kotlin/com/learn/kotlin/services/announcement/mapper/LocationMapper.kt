package com.learn.kotlin.services.announcement.mapper

import com.learn.kotlin.domain.model.location.Location
import com.learn.kotlin.services.announcement.dto.LocationDto

class LocationMapper private constructor(){

    companion object {
        fun toLocation(locationDto: LocationDto): Location {
            var location = null;
            if(locationDto.id != null) {
                // dao.get
            } else {
                // create Location
            }
            return Location(locationDto.country, locationDto.countryCode, locationDto.city, locationDto.street,
                locationDto.postalCode, locationDto.latitude, locationDto.longitude)
        }
    }
}