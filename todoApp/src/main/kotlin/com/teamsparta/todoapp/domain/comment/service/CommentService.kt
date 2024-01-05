package com.teamsparta.todoapp.domain.comment.service

import com.teamsparta.todoapp.domain.comment.dto.CommentResponse
import com.teamsparta.todoapp.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todoapp.domain.comment.dto.UpdateCommentRequest

interface CommentService {

    fun getAllCommentList(cardid: Long): List<CommentResponse>

    fun createComment(request: CreateCommentRequest): CommentResponse

    fun updateComment(id: Long, request: UpdateCommentRequest): CommentResponse

    fun deleteComment(id: Long)

}