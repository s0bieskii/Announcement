package com.learn.kotlin.persistance.location

import com.learn.kotlin.domain.location.Location
import org.springframework.stereotype.Repository
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Repository
class LocationInMemoryRepository : LocationRepository {
    val database = ConcurrentHashMap<UUID, Location>()

    override fun save(location: Location) {
        database.putIfAbsent(location.id, location)
    }
}