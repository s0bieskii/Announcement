package com.learn.kotlin.persistance.technology

import com.learn.kotlin.domain.technology.Technology
import org.springframework.stereotype.Repository

@Repository
interface TechnologyRepository {

    fun save(technology: Technology)

}