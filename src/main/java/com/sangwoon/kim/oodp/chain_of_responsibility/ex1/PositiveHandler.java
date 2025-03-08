package com.sangwoon.kim.oodp.chain_of_responsibility.ex1;

public class PositiveHandler extends Handler {

    @Override
    protected void process(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }
    }
}
