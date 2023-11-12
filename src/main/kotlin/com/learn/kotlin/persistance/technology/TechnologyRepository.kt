package com.learn.kotlin.persistance.technology

import com.learn.kotlin.domain.model.technology.Technology
import org.springframework.stereotype.Repository

@Repository
interface TechnologyRepository {

    fun save(technology: Technology)

}