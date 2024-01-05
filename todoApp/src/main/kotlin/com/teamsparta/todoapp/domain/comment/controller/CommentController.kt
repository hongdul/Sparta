package com.teamsparta.todoapp.domain.comment.controller

import com.teamsparta.todoapp.domain.card.controller.CardController
import com.teamsparta.todoapp.domain.card.service.CardService
import jakarta.persistence.Entity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/comments")
@RestController
class CommentController(
    private val cardService: CardService
) {

}