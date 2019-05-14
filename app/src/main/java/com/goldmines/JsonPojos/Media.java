
package com.goldmines.JsonPojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Media {

    @SerializedName("MediaItem")
    private List<MediaItem> mMediaItem;

    public List<MediaItem> getMediaItem() {
        return mMediaItem;
    }

    public void setMediaItem(List<MediaItem> mediaItem) {
        mMediaItem = mediaItem;
    }

}
