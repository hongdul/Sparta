package com.teamsparta.todoapp.domain.card.controller

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.CreateCardRequest
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.card.service.CardService
import com.teamsparta.todoapp.domain.exception.ModelNotFoundException
import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/cards")
@RestController
class CardController(
    private val cardService: CardService
) {

    @PostMapping
    fun createCard(@RequestBody createCardRequest: CreateCardRequest): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(cardService.createCard(createCardRequest))
    }

    @GetMapping()
    fun getCardList(): ResponseEntity<List<CardResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.getAllCardList())
    }

    @GetMapping("/{cardid}")
    fun getCard(@PathVariable cardid: Long): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.getCardById(cardid))
    }

    @PutMapping("/{cardid}")
    fun updateCard(
        @PathVariable cardid: Long,
        @RequestBody updateCardRequest: UpdateCardRequest
    ): ResponseEntity<CardResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(cardService.updateCard(cardid, updateCardRequest))
    }

    @DeleteMapping("/{cardid}")
    fun deleteCard(@PathVariable cardid: Long): ResponseEntity<Unit> {
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }



}