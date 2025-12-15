package com.example.perroapp1.model

data class Review(
    val id: Int,
    val walkId: Int,
    val rating: Int, // 1-5
    val comment: String?,
    val createdAt: String
)

data class ReviewRequest(
    val rating: Int,
    val comment: String? = null
)