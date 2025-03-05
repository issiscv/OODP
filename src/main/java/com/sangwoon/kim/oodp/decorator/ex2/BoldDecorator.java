package com.sangwoon.kim.oodp.decorator.ex2;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<B>" + super.getContent() + "</b>";
    }
}
