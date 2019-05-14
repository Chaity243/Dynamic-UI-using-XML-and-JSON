package com.goldmines.pojo;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Media {
    private MediaItem[] MediaItemArray ;

    private MediaItem MediaItemObject;

    public MediaItem getMediaItemObject() {
        return MediaItemObject;
    }

    public void setMediaItemObject(MediaItem mediaItemObject) {
        MediaItemObject = mediaItemObject;
    }




    public MediaItem[] getMediaItemArray()
    {
        return MediaItemArray;
    }

    public void setMediaItemArray (MediaItem[] MediaItemArray)
    {
        this.MediaItemArray = MediaItemArray;
    }



    @Override
    public String toString() {
        return "Media{" +
                "MediaItemArray=" + Arrays.toString(MediaItemArray) +
                ", MediaItemObject=" + MediaItemObject +
                '}';
    }


    public static class MediaDeserialiser implements JsonDeserializer<Questions>
    {


        @Override
        public Questions deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

            Questions questions = new Gson().fromJson(json, Questions.class);
            JsonObject jsonObject  = json.getAsJsonObject();

            JsonArray MediaItemArray = jsonObject.getAsJsonObject("SimpleQuestion").getAsJsonObject("Media").getAsJsonArray("MediaItem");


            MediaItem[] values = new Gson().fromJson(MediaItemArray, new TypeToken<MediaItem[]>() {
            }.getType());
            questions.getSimpleQuestion().getMedia().setMediaItemArray(values);





            return questions ;
        }
    }
}

