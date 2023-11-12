package com.learn.kotlin.persistance

import com.learn.kotlin.persistance.announcement.AnnouncementReadRepository
import com.learn.kotlin.persistance.company.CompanyRepository
import com.learn.kotlin.persistance.location.LocationRepository
import com.learn.kotlin.persistance.technology.TechnologyRepository
import com.learn.kotlin.persistance.user.UserRepository
import org.springframework.stereotype.Component

@Component
class DatabaseFacade (val announcementRepository: AnnouncementReadRepository,
                      val companyRepository: CompanyRepository,
                      val locationRepository: LocationRepository,
                      val technologyRepository: TechnologyRepository,
                      val userRepository: UserRepository)