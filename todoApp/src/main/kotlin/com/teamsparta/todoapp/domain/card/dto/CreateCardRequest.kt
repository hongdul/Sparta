package com.teamsparta.todoapp.domain.card.dto

import com.teamsparta.todoapp.domain.card.model.CardStatus

data class CreateCardRequest(
    val title: String,
    val body: String,
    val date: String,
    val username: String,
    val status: CardStatus,

)
