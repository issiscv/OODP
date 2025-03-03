package com.sangwoon.kim.oodp.factorymethod.ex2;

public class Clothing implements Product {
	@Override
	public void create() {
		System.out.println("Clothing product created.");
	}
}
