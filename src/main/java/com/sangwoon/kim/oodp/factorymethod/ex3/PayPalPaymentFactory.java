package com.sangwoon.kim.oodp.factorymethod.ex3;

public class PayPalPaymentFactory extends PaymentFactory {

	@Override
	Payment createPayment(FinancialInfo info) {
		return new PayPalPayment(info.payPalEmail);
	}
}
