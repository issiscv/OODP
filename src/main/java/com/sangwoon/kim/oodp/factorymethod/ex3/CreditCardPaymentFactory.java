package com.sangwoon.kim.oodp.factorymethod.ex3;

public class CreditCardPaymentFactory extends PaymentFactory {

	@Override
	Payment createPayment(FinancialInfo info) {
		return new CreditCardPayment(info.creditCardNumber);
	}
}
