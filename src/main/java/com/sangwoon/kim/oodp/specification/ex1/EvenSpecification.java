package com.sangwoon.kim.oodp.specification.ex1;

public class EvenSpecification implements Specification {

    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 2 == 0;
    }
}
