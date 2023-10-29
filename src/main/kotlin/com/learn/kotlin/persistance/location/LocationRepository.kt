package com.learn.kotlin.persistance.location

import com.learn.kotlin.domain.location.Location
import org.springframework.stereotype.Repository

@Repository
interface LocationRepository {

    fun save(location: Location)
}