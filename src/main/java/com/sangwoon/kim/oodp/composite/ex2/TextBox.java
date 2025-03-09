package com.sangwoon.kim.oodp.composite.ex2;

public class TextBox implements UIComponent {

    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("TextBox: " + text);
    }

    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
