package com.learn.kotlin.persistance.user

import com.learn.kotlin.domain.model.user.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository {
     fun save(technology: User)
}