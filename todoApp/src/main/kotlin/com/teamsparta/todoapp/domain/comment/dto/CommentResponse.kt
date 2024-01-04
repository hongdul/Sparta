package com.teamsparta.todoapp.domain.comment.dto

data class CommentResponse(
    val commenter: String,
    val password: String,
    val content: String,
)