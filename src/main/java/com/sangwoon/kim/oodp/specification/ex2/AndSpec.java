package com.sangwoon.kim.oodp.specification.ex2;

public class AndSpec implements Specification {

    private Specification spec1;
    private Specification spec2;

    public AndSpec(Specification spec1, Specification spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return spec1.isSatisfiedBy(product) && spec2.isSatisfiedBy(product);
    }
}
