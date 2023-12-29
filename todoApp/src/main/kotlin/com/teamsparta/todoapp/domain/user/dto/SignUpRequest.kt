package com.teamsparta.todoapp.domain.user.dto

data class SignUpRequest (
    val userId: Long,
    val password: String,
    val nickname: String,

)
