package com.sangwoon.kim.oodp.factorymethod.ex2;

public class Electronics implements Product {
	@Override
	public void create() {
		System.out.println("Electronics product created.");
	}
}
