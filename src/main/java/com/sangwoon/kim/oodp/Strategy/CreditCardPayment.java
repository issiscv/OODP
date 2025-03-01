package com.sangwoon.kim.oodp.Strategy;

public class CreditCardPayment implements PaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardPayment(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit card. name: " + name + " cardNumber: " + cardNumber);
	}
}
