package com.sangwoon.kim.oodp.Strategy;

public class PaypalPayment implements PaymentStrategy {

	private String email;

	public PaypalPayment(String email) {
		this.email = email;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using PayPal. email: " + email);
	}
}
