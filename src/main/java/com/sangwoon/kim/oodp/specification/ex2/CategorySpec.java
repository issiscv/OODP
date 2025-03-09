package com.sangwoon.kim.oodp.specification.ex2;

public class CategorySpec implements Specification {

    private String category;

    public CategorySpec(String category) {
        this.category = category;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getCategory().equals(category);
    }
}
