package com.teamsparta.todoapp.domain.card.repository

import com.teamsparta.todoapp.domain.card.model.Card
import org.springframework.data.jpa.repository.JpaRepository

interface CardRepository: JpaRepository<Card, Long>{

}
