package com.learn.kotlin.domain.dto.announcement

import java.util.*

class AnnoucmentDto(val id: UUID, val title: String, val details: UUID?, var metadata: UUID?) {
}