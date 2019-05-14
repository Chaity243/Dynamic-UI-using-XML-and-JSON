package com.goldmines.pojo;

public class SimpleQuestion {
    private Answers Answers;

    private Media Media;

    private String qid;

    public Answers getAnswers ()
    {
        return Answers;
    }

    public void setAnswers (Answers Answers)
    {
        this.Answers = Answers;
    }

    public Media getMedia ()
    {
        return Media;
    }

    public void setMedia (Media Media)
    {
        this.Media = Media;
    }

    public String getQid ()
    {
        return qid;
    }

    public void setQid (String qid)
    {
        this.qid = qid;
    }

    @Override
    public String toString()
    {
        return "SimpleQuestion [Answers = "+Answers+", Media = "+Media+", qid = "+qid+"]";
    }
}

