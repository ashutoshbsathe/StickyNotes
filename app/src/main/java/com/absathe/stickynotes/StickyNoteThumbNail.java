package com.absathe.stickynotes;

/**
 * Created by ABSathe on 08-12-2017.
 */

public class StickyNoteThumbNail {
    private String title, date;

    public StickyNoteThumbNail() {}
    public StickyNoteThumbNail(String title, String date) {
        this.title = title;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
