package com.sangwoon.kim.oodp.factorymethod.ex3;

public class FinancialInfo {

	String creditCardNumber;
	String payPalEmail;
	String bankAccountNumber;

	public FinancialInfo(
			String creditCardNumber,
			String payPalEmail,
			String bankAccountNumber
	) {
		this.creditCardNumber = creditCardNumber;
		this.payPalEmail = payPalEmail;
		this.bankAccountNumber = bankAccountNumber;
	}
}
