package com.teamsparta.todoapp.domain.card.model

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.comment.model.Comment
import jakarta.persistence.*


@Entity
@Table(name = "card")
class Card(
//    @Column(name = "cardId")
//    val cardId: Long,

    @Column(name = "title")
    var title: String,

    @Column(name = "body")
    var body: String,

    @Column(name = "date")
    val date: String,

    @Column(name = "username")
    var username: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: CardStatus,

    @OneToMany(mappedBy = "card"
        , fetch = FetchType.LAZY
        , cascade = [CascadeType.REMOVE]
        , orphanRemoval = true)
    var comments: MutableList<Comment> = mutableListOf()

) {
    @Id
    @Column(name = "cardid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var cardid: Long? = null

}

fun Card.toResponse(): CardResponse {
    return CardResponse(
        cardid = cardid!!,
        title = title,
        body = body,
        date = date,
        username = username,
        status = status,
        comments = comments
    )
}