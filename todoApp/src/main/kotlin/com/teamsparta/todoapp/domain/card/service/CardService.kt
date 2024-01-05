package com.teamsparta.todoapp.domain.card.service

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.CreateCardRequest
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.comment.dto.CommentResponse
import com.teamsparta.todoapp.domain.comment.dto.CreateCommentRequest

interface CardService {

    fun getAllCardList(): List<CardResponse>

    fun getCardById(cardid: Long): CardResponse

    fun createCard(request: CreateCardRequest): CardResponse

    fun updateCard(cardid: Long, request: UpdateCardRequest): CardResponse

    fun deleteCard(cardid: Long)

    fun addComment(cardid: Long, createCommentRequest: CreateCommentRequest): CommentResponse
}