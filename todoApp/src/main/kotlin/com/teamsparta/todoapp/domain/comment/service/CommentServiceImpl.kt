package com.teamsparta.todoapp.domain.comment.service

import com.teamsparta.todoapp.domain.card.model.Card
import com.teamsparta.todoapp.domain.card.model.toResponse
import com.teamsparta.todoapp.domain.card.repository.CardRepository
import com.teamsparta.todoapp.domain.comment.dto.CommentResponse
import com.teamsparta.todoapp.domain.comment.dto.CreateCommentRequest
import com.teamsparta.todoapp.domain.comment.dto.UpdateCommentRequest
import com.teamsparta.todoapp.domain.comment.model.Comment
import com.teamsparta.todoapp.domain.comment.model.toResponse
import com.teamsparta.todoapp.domain.comment.repository.CommentRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CommentServiceImpl (
    private val commentRepository: CommentRepository
): CommentService{
    override fun getAllCommentList(cardid: Long): List<CommentResponse> {
//        해당 Card의 Comment들을 DB에서 가져와서 List로 반환
        return commentRepository.findAllById(listOf(cardid)).map{it.toResponse()}
    }

    @Transactional
    override fun createComment(request: CreateCommentRequest): CommentResponse {
//        해당 Card에 CreateCommentRequest를 받아 Comment를 생성
        return commentRepository.save(
            Comment(
                commenter = request.commenter,
                password = request.password,
                content = request.content
            )
        ).toResponse()
    }

    override fun updateComment(id: Long, request: UpdateCommentRequest): CommentResponse {
//        입력받은 id에 해당하는 Comment를 UpdateCommentRequest를 받아 수정된 Comment 반환
        TODO("Not yet implemented")
    }

    override fun deleteComment(id: Long) {
//        DB에서 입력받은 id에 해당하는 Comment 삭제
        TODO("Not yet implemented")
    }
}