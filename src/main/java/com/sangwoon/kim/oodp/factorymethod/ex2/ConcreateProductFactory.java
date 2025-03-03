package com.sangwoon.kim.oodp.factorymethod.ex2;

public class ConcreateProductFactory extends ProductFactory {

	@Override
	public Product createProduct(String type) {
		if (type.equalsIgnoreCase("electronics")) {
			return new Electronics();
		} else if (type.equalsIgnoreCase("clothing")) {
			return new Clothing();
		} else if (type.equalsIgnoreCase("book")) {
			return new Book();
		} else {
			throw new IllegalArgumentException("Unknown product type");
		}
	}
}
