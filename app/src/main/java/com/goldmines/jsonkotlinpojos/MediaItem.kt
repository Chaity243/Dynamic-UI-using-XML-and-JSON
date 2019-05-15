package com.goldmines.jsonkotlinpojos


import com.google.gson.annotations.SerializedName

data class MediaItem(
        @SerializedName("align")
        val align: String, // 0
        @SerializedName("color")
        val color: String, // 0,0,0
        @SerializedName("content")
        val content: String, // Gary and Sam went running. Sam ran 2 miles less than Gary. Let <B><I>x </B></I>represent Gary's miles.<BR><P>Which expression represents the number of miles Sam ran?
        @SerializedName("essayid")
        val essayid: String, // 0
        @SerializedName("filename")
        val filename: String, // 4849Media1.jpg
        @SerializedName("font")
        val font: String, // Arial
        @SerializedName("hints")
        val hints: String, // False, False, False, False
        @SerializedName("location")
        val location: String, // 60,40,535,93
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