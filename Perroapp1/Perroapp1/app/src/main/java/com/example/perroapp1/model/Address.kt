package com.example.perroapp1.model


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("id") val id: Int,
    @SerializedName("user_id") val userId: Int,
    @SerializedName("address_line") val addressLine: String?,
    @SerializedName("city") val city: String?,
    @SerializedName("state") val state: String?,
    @SerializedName("zip_code") val zipCode: String?,
    @SerializedName("latitude") val latitude: String?,
    @SerializedName("longitude") val longitude: String?,
    @SerializedName("is_available") val isAvailable: Boolean,
    @SerializedName("created_at") val createdAt: String?,
    @SerializedName("updated_at") val updatedAt: String?
)

data class AddressRequest(
    @SerializedName("is_available") val isAvailable: Boolean
)