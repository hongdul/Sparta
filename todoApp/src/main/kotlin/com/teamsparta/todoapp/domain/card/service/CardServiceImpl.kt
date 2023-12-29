package com.teamsparta.todoapp.domain.card.service

import com.teamsparta.todoapp.domain.card.dto.CardResponse
import com.teamsparta.todoapp.domain.card.dto.CreateCardRequest
import com.teamsparta.todoapp.domain.card.dto.UpdateCardRequest
import com.teamsparta.todoapp.domain.card.repository.CardRepository
import com.teamsparta.todoapp.domain.exception.ModelNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CardServiceImpl(
    private val cardRepository: CardRepository
): CardService{

    override fun getAllCardList(): List<CardResponse> {
        // DB에서 모든 Card 목록을 조회하여 CardResponse 목록으로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getCardById(cardId: Long): CardResponse {
//        val card = cardRepository.findByIdOrNull(cardId) ?: throw ModelNotFoundException("Card", cardId)
        // DB에서 ID기반으로 Card 가져와서 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
//        throw ModelNotFoundException(modelName = "Card", id = 1L)
    }

    @Transactional
    override fun createCard(request: CreateCardRequest): CardResponse {
        // request를 Card로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateCard(cardId: Long, request: UpdateCardRequest): CardResponse {
        // DB에서 cardId에 해당하는 Card를 가져와서 request 기반으로 업데이트 후 DB에 저장,
        // 결과를 CardResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteCard(cardId: Long) {
        // DB에서 cardId에 해당하는 Card를 삭제
        TODO("Not yet implemented")
    }
}