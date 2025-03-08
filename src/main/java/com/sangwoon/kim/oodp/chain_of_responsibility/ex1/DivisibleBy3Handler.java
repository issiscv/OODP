package com.sangwoon.kim.oodp.chain_of_responsibility.ex1;

public class DivisibleBy3Handler extends Handler {

    @Override
    protected void process(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " is divible by 3");
        }
    }
}
