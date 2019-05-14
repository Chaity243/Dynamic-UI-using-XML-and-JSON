package com.goldmines.pojo;

public class Explain {
    private String Answers;

    private Media Media;

    private String qid;


    public String getAnswers ()
    {
        return Answers;
    }

    public void setAnswers (String Answers)
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
        return "Explain [Answers = "+Answers+", Media = "+Media+", qid = "+qid+"]";
    }
}

