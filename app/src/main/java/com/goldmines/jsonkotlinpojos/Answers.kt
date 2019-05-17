package com.goldmines.jsonkotlinpojos


import com.google.gson.JsonDeserializer
import com.google.gson.annotations.SerializedName
import java.util.*

data class Answers(
        @SerializedName("AnswerItem")
        val answerItem: List<AnswerItem>)
{

        internal var deserializer: JsonDeserializer<AnswerItem> = JsonDeserializer { json, typeOfT, context ->
                val jsonObject = json.asJsonPrimitive

                if()



        }

}