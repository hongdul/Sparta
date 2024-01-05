package com.teamsparta.todoapp.domain.comment.model

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.model.Card
import com.teamsparta.todoapp.domain.card.model.toResponse
import com.teamsparta.todoapp.domain.comment.dto.CommentResponse
import jakarta.persistence.*


@Entity
@Table(name = "comment")
class Comment(
    @Column(name = "content")
    var content: String,

    @Column(name = "commenter")
    val commenter: String,

    @Column(name = "password")
    val password: String,

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cardid", nullable = false)
//    var card: Card
    ) {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}

fun Comment.toResponse(): CommentResponse {
    return CommentResponse(
        id = id!!,
        commenter = commenter,
        password = password,
        content = content,
    )
}