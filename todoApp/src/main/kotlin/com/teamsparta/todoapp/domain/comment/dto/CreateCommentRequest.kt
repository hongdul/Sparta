package com.teamsparta.todoapp.domain.comment.dto

import com.teamsparta.todoapp.domain.card.model.Card
import com.teamsparta.todoapp.domain.card.model.CardStatus

data class CreateCommentRequest(
        val id : Long,
        val commenter: String,
        val password: String,
        val content: String,
    )