package com.teamsparta.todoapp.domain.user.service

import com.teamsparta.todoapp.domain.user.dto.SignUpRequest
import com.teamsparta.todoapp.domain.user.dto.UpdateUserProfileRequest
import com.teamsparta.todoapp.domain.user.dto.UserResponse
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{
    override fun signUp(request: SignUpRequest): UserResponse {
        TODO("Not yet implemented")
    }

    override fun updateUserProfile(userId: Long, request: UpdateUserProfileRequest): UserResponse {
        TODO("Not yet implemented")
    }
}