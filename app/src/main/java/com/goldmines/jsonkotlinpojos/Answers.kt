package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class Answers(
        @SerializedName("AnswerItem")
        val answerItem: List<AnswerItem>
)