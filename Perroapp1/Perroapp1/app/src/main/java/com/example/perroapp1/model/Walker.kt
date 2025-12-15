package com.example.perroapp1.model
import com.google.gson.annotations.SerializedName

data class Walker(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("profile_photo_url") val profilePhotoUrl: String? = null,
    @SerializedName("price_hour") val priceHour: String? = null,
    @SerializedName("is_available") val isAvailable: Boolean? = null,
    @SerializedName("latitude") val latitude: String? = null,
    @SerializedName("longitude") val longitude: String? = null,
    @SerializedName("rating") val rating: Double? = null,
    @SerializedName("total_walks") val totalWalks: Int? = null,
    @SerializedName("distance") val distance: Double? = null
)

data class NearbyWalkersRequest(
    @SerializedName("latitude") val latitude: String,
    @SerializedName("longitude") val longitude: String,
    @SerializedName("radius") val radius: Double = 5.0
)