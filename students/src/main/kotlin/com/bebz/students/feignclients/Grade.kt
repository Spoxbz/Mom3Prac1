package com.bebz.students.feignclients

import jakarta.persistence.*

@Entity
@Table(name = "grades")
data class Grade(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val course: String,

    @Column(nullable = false)
    val subject: String
)