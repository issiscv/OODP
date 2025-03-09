package com.sangwoon.kim.oodp.specification.ex2;

import java.util.Arrays;
import java.util.List;

public class SpecificationMain {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200, 5),
                new Product("Smartphone", "Electronics", 800, 0),
                new Product("Headphones", "Electronics", 200, 10),
                new Product("Book", "Literature", 20, 50)
        );

        CategorySpec electronicsSpec = new CategorySpec("Electronics");
        InStockSpec inStockSpec = new InStockSpec();
        PriceSpec expensiveSpec = new PriceSpec(500);

        AndSpec electronicInStock = new AndSpec(electronicsSpec, inStockSpec);
        OrSpec electronicsOrInStock = new OrSpec(electronicsSpec, inStockSpec);
        NotSpec notExpensive = new NotSpec(expensiveSpec);

        System.out.println("Electronics in stock:");
        ProductFilter.printProducts(
                ProductFilter.filter(products, electronicInStock)
        );

        System.out.println("\nElectronics or In Stock:");
        ProductFilter.printProducts(
                ProductFilter.filter(products, electronicsOrInStock)
        );

        System.out.println("\nNotExpensive:");
        ProductFilter.printProducts(
                ProductFilter.filter(products, notExpensive)
        );

    }

}
