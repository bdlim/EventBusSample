package com.androidarray.eventbussample;

public class TextEvent {

    private String mText;

    public TextEvent(String text) {
        mText = text;
    }

    public String getText() {
        return mText;
    }
}
