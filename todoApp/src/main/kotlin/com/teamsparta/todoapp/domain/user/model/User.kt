package com.teamsparta.todoapp.domain.user.model

import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(
    @Column(name = "nickname")
    var nickname: String,

    @Column(name = "password")
    var password: String,

//    @Embedded
//    var profile: Profile,

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userId: Long? = null
}