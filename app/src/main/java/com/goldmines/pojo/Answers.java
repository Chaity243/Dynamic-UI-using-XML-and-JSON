package com.goldmines.pojo;

 public class Answers
{
    private AnswerItem[] AnswerItem;

    public AnswerItem[] getAnswerItem ()
    {
        return AnswerItem;
    }

    public void setAnswerItem (AnswerItem[] AnswerItem)
    {
        this.AnswerItem = AnswerItem;
    }

    @Override
    public String toString()
    {
        return "Answers [AnswerItem = "+AnswerItem+"]";
    }
}
