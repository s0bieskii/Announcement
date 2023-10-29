package com.learn.kotlin.domain.user

import java.util.*

data class User(val id: UUID, var name: String, var lastName: String, var password: String) {
}