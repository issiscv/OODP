package com.sangwoon.kim.oodp.specification.ex2;

public class NotSpec implements Specification {

    private Specification spec;

    public NotSpec(Specification spec1) {
        this.spec = spec1;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return !spec.isSatisfiedBy(product);
    }
}
