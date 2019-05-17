package com.goldmines.jsonkotlinpojos


import com.google.gson.JsonDeserializer
import com.google.gson.annotations.SerializedName
import org.json.JSONArray

data class Media(
        @SerializedName("MediaItem")
        val mediaItem: List<MediaItem>

)
