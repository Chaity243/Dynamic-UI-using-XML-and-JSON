package com.goldmines.pojo;

public class MediaItem {
    private String wasRendered;

    private String color;

    private String size;

    private String signature;

    private String hints;

    private String location;

    private String align;

    private String locked;

    private String essayid;

    private String content;

    private String scrollable;

    private String font;


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private String filename;



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

    public String getSize ()
    {
        return size;
    }

    public void setSize (String size)
    {
        this.size = size;
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

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getAlign ()
    {
        return align;
    }

    public void setAlign (String align)
    {
        this.align = align;
    }

    public String getLocked ()
    {
        return locked;
    }

    public void setLocked (String locked)
    {
        this.locked = locked;
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
        return "MediaItem [wasRendered = "+wasRendered+", color = "+color+", size = "+size+", signature = "+signature+", hints = "+hints+", location = "+location+", align = "+align+", locked = "+locked+", essayid = "+essayid+", content = "+content+", scrollable = "+scrollable+", font = "+font+", fileName = "+filename+" ]";
    }
}

