
package com.goldmines.JsonPojos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Answers {

    @SerializedName("AnswerItem")
    private List<AnswerItem> mAnswerItem;

    public List<AnswerItem> getAnswerItem() {
        return mAnswerItem;
    }

    public void setAnswerItem(List<AnswerItem> answerItem) {
        mAnswerItem = answerItem;
    }

}
