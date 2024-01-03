package com.teamsparta.todoapp.domain.card.service

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.CreateCardRequest
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.card.model.Card
import com.teamsparta.todoapp.domain.card.model.CardStatus
import com.teamsparta.todoapp.domain.card.model.toResponse
import com.teamsparta.todoapp.domain.card.repository.CardRepository
import com.teamsparta.todoapp.domain.exception.ModelNotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CardServiceImpl(
    private val cardRepository: CardRepository
): CardService{

    override fun getAllCardList(): List<CardResponse> {
        // DB에서 모든 Card 목록을 조회하여 CardResponse 목록으로 변환 후 반환
        return cardRepository.findAll().map {it.toResponse()}
    }

    override fun getCardById(cardid: Long): CardResponse {
        val card = cardRepository.findByIdOrNull(cardid) ?: throw ModelNotFoundException("Card", cardid)
        // DB에서 ID기반으로 Card 가져와서 CardResponse로 변환 후 반환
        return card.toResponse()
    }

    @Transactional
    override fun createCard(request: CreateCardRequest): CardResponse {
        // request를 Card로 변환 후 DB에 저장
        return cardRepository.save(
            Card(
                title = request.title,
                body = request.body,
                date = request.date,
                username = request.username,
                status = CardStatus.COMPLETED,
//                cardId = request.cardId
            )
        ).toResponse()
    }

    @Transactional
    override fun updateCard(cardid: Long, request: UpdateCardRequest): CardResponse {
        // DB에서 cardId에 해당하는 Card를 가져와서 request 기반으로 업데이트 후 DB에 저장,
        // 결과를 CardResponse로 변환 후 반환
        val card = cardRepository.findByIdOrNull(cardid) ?: throw ModelNotFoundException("Card", cardid)
        val (title, body, username) = request
        card.title = title
        card.body = body
        card.username = username

        return cardRepository.save(card).toResponse()
    }

    @Transactional
    override fun deleteCard(cardid: Long) {
        // DB에서 cardId에 해당하는 Card를 삭제
        val card = cardRepository.findByIdOrNull(cardid) ?: throw ModelNotFoundException("Card", cardid)
        cardRepository.delete(card)
    }
}