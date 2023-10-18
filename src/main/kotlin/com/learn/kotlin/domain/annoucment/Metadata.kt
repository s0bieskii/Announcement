package com.learn.kotlin.domain.annoucment

import java.time.LocalDateTime
import java.util.UUID;

data class Metadata(val id: UUID, var creationDate:LocalDateTime, var expirationDate:LocalDateTime)
