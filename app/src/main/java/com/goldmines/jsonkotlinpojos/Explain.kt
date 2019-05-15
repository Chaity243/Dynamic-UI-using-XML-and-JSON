package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class Explain(
        @SerializedName("Answers")
        val answers: String,
        @SerializedName("Media")
        val media: MediaX,
        @SerializedName("qid")
        val qid: String
)