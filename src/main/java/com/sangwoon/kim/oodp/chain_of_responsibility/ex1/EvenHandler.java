package com.sangwoon.kim.oodp.chain_of_responsibility.ex1;

public class EvenHandler extends Handler {

    @Override
    protected void process(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }
    }
}
