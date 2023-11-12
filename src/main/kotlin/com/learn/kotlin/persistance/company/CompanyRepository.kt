package com.learn.kotlin.persistance.company

import com.learn.kotlin.domain.model.company.Company
import org.springframework.stereotype.Service

@Service
interface CompanyRepository {

    fun save(announcement: Company): Unit

}