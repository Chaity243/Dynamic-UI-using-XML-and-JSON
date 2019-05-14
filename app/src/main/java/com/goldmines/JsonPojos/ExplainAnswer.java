package com.goldmines.JsonPojos;

import com.google.gson.annotations.SerializedName;

public class ExplainAnswer {

    @Override
    public String toString() {
        return "ExplainAnswer{" +
                "mAnswers='" + mAnswers + '\'' +
                ", mMedia=" + mMedia +
                ", mQid='" + mQid + '\'' +
                '}';
    }

    @SerializedName("Answers")
    private String mAnswers;
    @SerializedName("Media")
    private MediaAnswer mMedia;
    @SerializedName("qid")
    private String mQid;

    public String getAnswers() {
        return mAnswers;
    }

    public void setAnswers(String answers) {
        mAnswers = answers;
    }

    public MediaAnswer getMedia() {
        return mMedia;
    }

    public void setMedia(MediaAnswer media) {
        mMedia = media;
    }

    public String getQid() {
        return mQid;
    }

    public void setQid(String qid) {
        mQid = qid;
    }
}
