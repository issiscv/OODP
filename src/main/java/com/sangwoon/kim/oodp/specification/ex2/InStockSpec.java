package com.sangwoon.kim.oodp.specification.ex2;

public class InStockSpec implements Specification {

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getStock() > 0;
    }
}
