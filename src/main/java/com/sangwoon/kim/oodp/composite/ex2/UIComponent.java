package com.sangwoon.kim.oodp.composite.ex2;

public interface UIComponent {

    void render();
    void add(UIComponent component);
    void remove(UIComponent component);

}
