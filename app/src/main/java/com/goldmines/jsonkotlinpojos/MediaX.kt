package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class MediaX(
        @SerializedName("MediaItem")
        val mediaItem: MediaItemX
)