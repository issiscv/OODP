package com.sangwoon.kim.oodp.Strategy;

public class StrategyMain {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setPaymentStrategy(new CreditCardPayment("김상운", "01058774485"));
		shoppingCart.checkout(100);

		shoppingCart.setPaymentStrategy(new PaypalPayment("shopping@gmail.com"));
		shoppingCart.checkout(100);
	}

}
