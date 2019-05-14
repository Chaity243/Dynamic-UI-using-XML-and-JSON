package com.goldmines.JsonPojos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaAnswer {
    @Override
    public String toString() {
        return "MediaAnswer{" +
                "mMediaItem=" + mMediaItem +
                '}';
    }

    @SerializedName("MediaItem")
    private MediaItem mMediaItem;

    public MediaItem getMediaItem() {
        return mMediaItem;
    }

    public void setMediaItem(MediaItem mediaItem) {
        mMediaItem = mediaItem;
    }

}
