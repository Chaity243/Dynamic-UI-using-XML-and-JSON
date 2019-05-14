
package com.goldmines.JsonPojos;


import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SimpleQuestion {

    @SerializedName("Answers")
    private Answers mAnswers;

    @Override
    public String toString() {
        return "SimpleQuestion{" +
                "mAnswers=" + mAnswers +
                ", mMedia=" + mMedia +
                ", mQid='" + mQid + '\'' +
                ", m_xmlnsD3p1='" + m_xmlnsD3p1 + '\'' +
                '}';
    }

    @SerializedName("Media")
    private Media mMedia;
    @SerializedName("qid")
    private String mQid;
    @SerializedName("_xmlns:d3p1")
    private String m_xmlnsD3p1;

    public Answers getAnswers() {
        return mAnswers;
    }

    public void setAnswers(Answers answers) {
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

    public String get_xmlnsD3p1() {
        return m_xmlnsD3p1;
    }

    public void set_xmlnsD3p1(String _xmlnsD3p1) {
        m_xmlnsD3p1 = _xmlnsD3p1;
    }

}
