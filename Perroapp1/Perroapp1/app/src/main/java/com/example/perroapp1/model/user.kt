package com.example.perroapp1.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("profile_photo_url") val profilePhotoUrl: String? = null,
    @SerializedName("type") val type: String? = null
)

data class LoginRequest(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)

data class RegisterRequest(
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String,
    @SerializedName("price_hour") val priceHour: String? = null
)

data class LoginResponse(
    @SerializedName("access_token") val accessToken: String? = null,
    @SerializedName("token") val token: String? = null,
    @SerializedName("user") val user: User? = null
)

data class MeResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("profile_photo_url") val profilePhotoUrl: String? = null,
    @SerializedName("type") val type: String
)