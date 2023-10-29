package com.learn.kotlin.persistance.user

import com.learn.kotlin.domain.user.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository {
     fun save(technology: User)
}