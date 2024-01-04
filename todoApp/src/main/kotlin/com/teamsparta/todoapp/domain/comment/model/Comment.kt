package com.teamsparta.todoapp.domain.comment.model

import com.teamsparta.todoapp.domain.card.model.Card
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cardid", nullable = false)
    var card: Card
    ) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}