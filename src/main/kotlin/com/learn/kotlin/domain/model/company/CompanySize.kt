package com.learn.kotlin.domain.model.company

enum class CompanySize(val value: Pair<Int, Int>) {
    MICRO(Pair(1, 10)), SMALL(Pair(10, 50)), MIDDLE(Pair(50, 250)), LARGE(Pair(250, 9999))
}