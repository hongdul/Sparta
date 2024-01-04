package com.teamsparta.todoapp.domain.card.dto

import com.teamsparta.todoapp.domain.card.model.CardStatus
import com.teamsparta.todoapp.domain.comment.model.Comment
import java.util.Date

data class CardResponse(
    val cardid: Long,
    val title: String,
    val body: String,
    val date: String,
    val username: String,
    val status: CardStatus,
    val comments: MutableList<Comment>,
)

