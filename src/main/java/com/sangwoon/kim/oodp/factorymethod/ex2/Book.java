package com.sangwoon.kim.oodp.factorymethod.ex2;

public class Book implements Product {

	@Override
	public void create() {
		System.out.println("Book product created.");
	}
}
