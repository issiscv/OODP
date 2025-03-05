package com.sangwoon.kim.oodp.decorator.ex2;

public class UnderlineDecorator extends TextDecorator {

    public UnderlineDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<u>" + super.getContent() + "</u>";
    }
}
