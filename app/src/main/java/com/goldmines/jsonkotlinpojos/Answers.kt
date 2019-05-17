package com.goldmines.jsonkotlinpojos


import com.google.gson.JsonDeserializer
import com.google.gson.annotations.SerializedName
import java.util.*

data class Answers(
        @SerializedName("AnswerItem")
        val answerItem: List<AnswerItem>)
