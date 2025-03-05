package com.sangwoon.kim.oodp.decorator.ex2;

public class PlainText implements Text {

    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
