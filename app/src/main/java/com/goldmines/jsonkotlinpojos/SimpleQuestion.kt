package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class SimpleQuestion(
        @SerializedName("Answers")
        val answers: Answers,
        @SerializedName("MediaX")
        val media: Media,
        @SerializedName("qid")
        val qid: String, // 4849
        @SerializedName("_xmlns:d3p1")
        val xmlnsD3p1: String // http://www.w3.org/2001/XMLSchema-instance
)