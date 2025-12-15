package com.example.perroapp1.model

import com.google.gson.annotations.SerializedName

data class Walk(
    @SerializedName("id") val id: Int,
    @SerializedName("walker_id") val walkerId: Int,
    @SerializedName("pet_id") val petId: Int,
    @SerializedName("scheduled_at") val scheduledAt: String,
    @SerializedName("duration_minutes") val durationMinutes: Int,
    @SerializedName("user_address_id") val userAddressId: Int,
    @SerializedName("notes") val notes: String?,
    @SerializedName("status") val status: String,
    @SerializedName("started_at") val startedAt: String? = null,
    @SerializedName("ended_at") val endedAt: String? = null,
    @SerializedName("pet") val pet: Pet? = null,
    @SerializedName("walker") val walker: Walker? = null,
    @SerializedName("created_at") val createdAt: String? = null,
    @SerializedName("updated_at") val updatedAt: String? = null
) {
    val isPending: Boolean get() = status.equals("pending", ignoreCase = true)
    val isAccepted: Boolean get() = status.equals("accepted", ignoreCase = true)
    val isRejected: Boolean get() = status.equals("rejected", ignoreCase = true)
    val isInProgress: Boolean get() = status.equals("in_progress", ignoreCase = true)
    val isFinished: Boolean get() = status.equals("finished", ignoreCase = true)
}

data class CreateWalkRequest(
    @SerializedName("walker_id") val walkerId: Int,
    @SerializedName("pet_id") val petId: Int,
    @SerializedName("scheduled_at") val scheduledAt: String,
    @SerializedName("duration_minutes") val durationMinutes: Int,
    @SerializedName("user_address_id") val userAddressId: Int,
    @SerializedName("notes") val notes: String? = null
)

data class ReviewRequest(
    @SerializedName("rating") val rating: Int,
    @SerializedName("comment") val comment: String? = null
)

data class AvailabilityRequest(
    @SerializedName("is_available") val isAvailable: Boolean
)

data class LocationRequest(
    @SerializedName("latitude") val latitude: String,
    @SerializedName("longitude") val longitude: String
)