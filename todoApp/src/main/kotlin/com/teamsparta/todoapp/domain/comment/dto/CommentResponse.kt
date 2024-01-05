package com.teamsparta.todoapp.domain.comment.dto

import com.teamsparta.todoapp.domain.card.model.Card

data class CommentResponse(
    val id: Long,
    val commenter: String,
    val password: String,
    val content: String,
)