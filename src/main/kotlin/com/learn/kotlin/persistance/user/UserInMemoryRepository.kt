package com.learn.kotlin.persistance.user

import com.learn.kotlin.domain.user.User
import org.springframework.stereotype.Repository
import java.util.*
import java.util.concurrent.ConcurrentHashMap
@Repository
class UserInMemoryRepository : UserRepository {
    val database = ConcurrentHashMap<UUID, User>()

    override fun save(user: User) {
        database.putIfAbsent(user.id, user)
    }
}