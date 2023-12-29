package com.teamsparta.todoapp.domain.card.dto

import com.teamsparta.todoapp.domain.card.model.CardStatus

data class UpdateCardRequest(
    val title: String,
    val body: String,
    val username: String,
    val status: CardStatus,
)
