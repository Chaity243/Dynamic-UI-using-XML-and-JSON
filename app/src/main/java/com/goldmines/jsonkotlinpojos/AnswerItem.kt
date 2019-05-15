package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class AnswerItem(
        @SerializedName("align")
        val align: String, // 0
        @SerializedName("color")
        val color: String, // 0,0,0
        @SerializedName("content")
        val content: String, // <B><I>x</B></I> x 2
        @SerializedName("correct")
        val correct: String, // false
        @SerializedName("essayid")
        val essayid: String, // 0
        @SerializedName("explain")
        val explain: Explain,
        @SerializedName("font")
        val font: String, // Arial
        @SerializedName("hints")
        val hints: String, // False, False, False, False
        @SerializedName("location")
        val location: String, // 160,361,97,27
        @SerializedName("locked")
        val locked: String, // false
        @SerializedName("scrollable")
        val scrollable: String, // false
        @SerializedName("signature")
        val signature: String, // AnswerR
        @SerializedName("size")
        val size: String, // 14
        @SerializedName("wasRendered")
        val wasRendered: String // false
)