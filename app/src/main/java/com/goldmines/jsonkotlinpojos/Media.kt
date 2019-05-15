package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class Media(
        @SerializedName("MediaItem")
        val mediaItem: List<MediaItem>
)