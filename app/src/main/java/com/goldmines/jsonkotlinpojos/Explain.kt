package com.goldmines.jsonkotlinpojos


import com.goldmines.xmlparsing.MediaX
import com.google.gson.annotations.SerializedName

data class Explain(
        @SerializedName("Answers")
        val answers: String,
        @SerializedName("MediaX")
        val media: MediaX,
        @SerializedName("qid")
        val qid: String
)