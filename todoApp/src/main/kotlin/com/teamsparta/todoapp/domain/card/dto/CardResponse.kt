package com.teamsparta.todoapp.domain.card.dto

import com.teamsparta.todoapp.domain.card.model.CardStatus
import java.util.Date

data class CardResponse(
    val cardId: Long,
    val title: String,
    val body: String,
    val date: String,
    val username: String,
    val status: CardStatus,
)

