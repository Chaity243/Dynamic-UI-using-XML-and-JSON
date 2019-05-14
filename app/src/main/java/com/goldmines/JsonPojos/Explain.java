
package com.goldmines.JsonPojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Explain {

    @SerializedName("Answers")
    private String mAnswers;
    @SerializedName("Media")
    private Media mMedia;
    @SerializedName("qid")
    private String mQid;

    public String getAnswers() {
        return mAnswers;
    }

    public void setAnswers(String answers) {
        mAnswers = answers;
    }

    public Media getMedia() {
        return mMedia;
    }

    public void setMedia(Media media) {
        mMedia = media;
    }

    public String getQid() {
        return mQid;
    }

    public void setQid(String qid) {
        mQid = qid;
    }

}
