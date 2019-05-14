
package com.goldmines.JsonPojos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Question {

    @Override
    public String toString() {
        return "Question{" +
                "mSimpleQuestion=" + mSimpleQuestion +
                '}';
    }

    @SerializedName("SimpleQuestion")
    private SimpleQuestion mSimpleQuestion;

    public SimpleQuestion getSimpleQuestion() {
        return mSimpleQuestion;
    }

    public void setSimpleQuestion(SimpleQuestion simpleQuestion) {
        mSimpleQuestion = simpleQuestion;
    }

}
