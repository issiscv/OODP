package com.sangwoon.kim.oodp.factorymethod.ex2;

public abstract class ProductFactory {

	public abstract Product createProduct(String type);

	public Product orderProduct(String type) {
		Product product = createProduct(type);
		product.create();
		return product;
	}

}
