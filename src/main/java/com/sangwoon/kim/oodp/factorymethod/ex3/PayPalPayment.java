package com.sangwoon.kim.oodp.factorymethod.ex3;

public class PayPalPayment implements Payment {

	private String payPalEmail;

	public PayPalPayment(String payPalEmail) {
		this.payPalEmail = payPalEmail;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("PayPal: $" + amount);
	}
}
