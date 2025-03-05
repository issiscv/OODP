package com.sangwoon.kim.oodp.decorator.ex2;

public class TextDecorator implements Text {

    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getContent() {
        return decoratedText.getContent();
    }

}
