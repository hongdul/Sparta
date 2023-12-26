package com.teamsparta.courseregistration.domain.user.repository

import com.teamsparta.courseregistration.domain.course.model.Course
import org.apache.catalina.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}