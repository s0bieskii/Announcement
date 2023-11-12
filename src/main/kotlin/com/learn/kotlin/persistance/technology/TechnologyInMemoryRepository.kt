package com.learn.kotlin.persistance.technology

import com.learn.kotlin.domain.model.technology.Technology
import org.springframework.stereotype.Repository
import java.util.*
import java.util.concurrent.ConcurrentHashMap
@Repository
class TechnologyInMemoryRepository : TechnologyRepository {
    val database = ConcurrentHashMap<UUID, Technology>()

    override fun save(technology: Technology) {
        database.putIfAbsent(technology.id, technology)
    }
}