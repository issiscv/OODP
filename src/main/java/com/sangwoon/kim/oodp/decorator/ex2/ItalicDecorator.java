package com.sangwoon.kim.oodp.decorator.ex2;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
