package com.goldmines.pojo;

public class AnswerItem {
    private Explain explain;

    private String wasRendered;

    private String color;

    private String correct;

    private String signature;

    private String hints;

    private String align;

    private String essayid;

    private String content;

    private String size;

    private String location;

    private String locked;

    private String scrollable;

    private String font;

    public Explain getExplain ()
    {
        return explain;
    }

    public void setExplain (Explain explain)
    {
        this.explain = explain;
    }

    public String getWasRendered ()
    {
        return wasRendered;
    }

    public void setWasRendered (String wasRendered)
    {
        this.wasRendered = wasRendered;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getCorrect ()
    {
        return correct;
    }

    public void setCorrect (String correct)
    {
        this.correct = correct;
    }

    public String getSignature ()
    {
        return signature;
    }

    public void setSignature (String signature)
    {
        this.signature = signature;
    }

    public String getHints ()
    {
        return hints;
    }

    public void setHints (String hints)
    {
        this.hints = hints;
    }

    public String getAlign ()
    {
        return align;
    }

    public void setAlign (String align)
    {
        this.align = align;
    }

    public String getEssayid ()
    {
        return essayid;
    }

    public void setEssayid (String essayid)
    {
        this.essayid = essayid;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getLocked ()
    {
        return locked;
    }

    public void setLocked (String locked)
    {
        this.locked = locked;
    }

    public String getScrollable ()
    {
        return scrollable;
    }

    public void setScrollable (String scrollable)
    {
        this.scrollable = scrollable;
    }

    public String getFont ()
    {
        return font;
    }

    public void setFont (String font)
    {
        this.font = font;
    }

    @Override
    public String toString()
    {
        return "AnswerItem [explain = "+explain+", wasRendered = "+wasRendered+", color = "+color+", correct = "+correct+", signature = "+signature+", hints = "+hints+", align = "+align+", essayid = "+essayid+", content = "+content+", size = "+size+", location = "+location+", locked = "+locked+", scrollable = "+scrollable+", font = "+font+"]";
    }
}

