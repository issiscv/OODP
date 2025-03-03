package com.sangwoon.kim.oodp.factorymethod.ex3;

public class BankTransferPayment implements Payment {

	private String bankAccountNumber;

	public BankTransferPayment(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Bank transfer: $" + amount);
	}
}
