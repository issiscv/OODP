package com.sangwoon.kim.oodp.specification.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

    public static List<Product> filter(
            List<Product> products, Specification spec
    ) {
        return products.stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }

    public static void printProducts(List<Product> products) {
        products.forEach(
                p -> System.out.println(
                        p.getName() + " - " + p.getCategory() + " - $"
                                + p.getPrice() + " - Stock: " + p.getStock()
                )
        );
    }

}
