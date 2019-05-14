package com.goldmines.pojo;

public class Questions {
    private SimpleQuestion SimpleQuestion;

    public SimpleQuestion getSimpleQuestion ()
    {
        return SimpleQuestion;
    }

    public void setSimpleQuestion (SimpleQuestion SimpleQuestion)
    {
        this.SimpleQuestion = SimpleQuestion;
    }

    @Override
    public String toString()
    {
        return "Questions [SimpleQuestion = "+SimpleQuestion+"]";
    }


}


