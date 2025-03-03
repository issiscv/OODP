package com.sangwoon.kim.oodp.factorymethod.ex2;

public class FactoryMethodMain {

	public static void main(String[] args) {
		ProductFactory factory = new ConcreateProductFactory();

		Product electronics = factory.orderProduct("electronics");
		Product clothing = factory.orderProduct("clothing");
		Product book = factory.orderProduct("book");

	}

}
