package com.sangwoon.kim.oodp.specification.ex1;

public interface Specification {

    boolean isSatisfiedBy(int number);

    default Specification and(Specification other) {
        return number -> this.isSatisfiedBy(number) && other.isSatisfiedBy(number);
    }

}
