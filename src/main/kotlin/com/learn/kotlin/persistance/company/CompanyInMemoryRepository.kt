package com.learn.kotlin.persistance.company

import com.learn.kotlin.domain.company.Company
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.ConcurrentHashMap

@Service
class CompanyInMemoryRepository : CompanyRepository {
    val database = ConcurrentHashMap<UUID, Company>()

    override fun save(company: Company) {
        database.putIfAbsent(company.id, company)
    }
}