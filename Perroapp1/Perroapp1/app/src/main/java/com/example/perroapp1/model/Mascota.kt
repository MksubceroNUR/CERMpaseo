package com.example.perroapp1.model

data class Pet(
    val id: Int,
    val name: String,
    val type: String,
    val breed: String?,
    val age: Int?,
    val notes: String?,
    val profileImage: String?,
    val ownerId: Int,
    val createdAt: String,
    val updatedAt: String
)

data class PetRequest(
    val name: String,
    val type: String,
    val breed: String? = null,
    val age: Int? = null,
    val notes: String? = null,
    val profileImage: String? = null
)