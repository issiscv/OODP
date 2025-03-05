package com.sangwoon.kim.oodp.decorator.ex1;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
