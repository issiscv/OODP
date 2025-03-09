package com.sangwoon.kim.oodp.specification.ex1;

public class RangeSpecification implements Specification {

    private int min;
    private int max;

    public RangeSpecification(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return number >= min && number <= max;
    }
}
