package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class MediaItemX(
        @SerializedName("align")
        val align: String, // 0
        @SerializedName("color")
        val color: String, // 0,0,0
        @SerializedName("content")
        val content: String, // If Sam ran 2 times the miles Gary ran, <B><I>x</B></I> x 2 would represent his miles.<BR><P>Sam ran 2 miles less than Gary.<BR><P>Find the equation that shows less.
        @SerializedName("essayid")
        val essayid: String, // 0
        @SerializedName("font")
        val font: String, // Arial
        @SerializedName("hints")
        val hints: String, // False, False, False, False
        @SerializedName("location")
        val location: String, // 105,134,615,115
        @SerializedName("locked")
        val locked: String, // false
        @SerializedName("scrollable")
        val scrollable: String, // false
        @SerializedName("signature")
        val signature: String, // Rtf
        @SerializedName("size")
        val size: String, // 14
        @SerializedName("wasRendered")
        val wasRendered: String // false
)