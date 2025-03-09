package com.sangwoon.kim.oodp.specification.ex2;

public class PriceSpec implements Specification {

    private int maxPrice;

    public PriceSpec(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getPrice() <= maxPrice;
    }
}
