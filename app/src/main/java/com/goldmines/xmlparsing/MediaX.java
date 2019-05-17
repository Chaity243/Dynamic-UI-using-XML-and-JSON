package com.goldmines.xmlparsing;

import com.goldmines.jsonkotlinpojos.MediaItem;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MediaX {

    public MediaX(List<MediaItem> mediaItemArray, MediaItem mediaItemObject) {
        this.mediaItemArray = mediaItemArray;
        this.mediaItemObject = mediaItemObject;
    }

    List<MediaItem> mediaItemArray;
    MediaItem mediaItemObject;

    public List<MediaItem> getMediaItemArray() {
        return mediaItemArray;
    }

    public void setMediaItemArray(List<MediaItem> mediaItemArray) {
        this.mediaItemArray = mediaItemArray;
    }

    public MediaItem getMediaItemObject() {
        return mediaItemObject;
    }

    public void setMediaItemObject(MediaItem mediaItemObject) {
        this.mediaItemObject = mediaItemObject;
    }



  public static   JsonDeserializer<MediaX> desirialiser = new JsonDeserializer<MediaX>() {
        @Override
        public MediaX deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject jsonObject  = json.getAsJsonObject();
            List<MediaItem> mediaItemArray =null;
            MediaItem mediaItemObject =null;
            if(jsonObject.get("MediaItem").isJsonArray()){
                Type listType = new TypeToken<List<MediaItem>>(){}.getType();
                mediaItemArray = new Gson().fromJson(jsonObject.getAsJsonArray("MediaItem").toString(),listType);
            }
            else if (jsonObject.get("MediaItem").isJsonObject())
            { Type objectTpe = new TypeToken<MediaItem>(){}.getType();
                mediaItemObject = new Gson().fromJson(jsonObject.getAsJsonObject("MediaItem").toString(),objectTpe);

            }
                return new MediaX(mediaItemArray, mediaItemObject);
        }
    };
    }

