package com.sangwoon.kim.oodp.composite.ex2;

public class Button implements UIComponent {

    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Button: " + label);
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
