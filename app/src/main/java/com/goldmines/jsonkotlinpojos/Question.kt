package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class Question(
        @SerializedName("SimpleQuestion")
        val simpleQuestion: SimpleQuestion
)