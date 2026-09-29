package com.codepath.nationalparks

import com.google.gson.annotations.SerializedName

/**
 * Mapped to TMDb movie JSON response keys while keeping
 * existing NationalPark field names intact.
 */
class NationalPark {
    @JvmField
    @SerializedName("title") // Mapped from TMDb "title"
    var name: String? = null

    @JvmField
    @SerializedName("overview") // Mapped from TMDb "overview"
    var description: String? = null

    @JvmField
    @SerializedName("poster_path")
    var posterPath: String? = null

    // Construct full poster URL using TMDb base path
    val imageUrl: String?
        get() = if (posterPath != null) "https://image.tmdb.org/t/p/w500/$posterPath" else null
}