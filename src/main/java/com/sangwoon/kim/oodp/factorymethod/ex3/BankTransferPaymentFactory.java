package com.sangwoon.kim.oodp.factorymethod.ex3;

public class BankTransferPaymentFactory extends PaymentFactory {

	@Override
	Payment createPayment(FinancialInfo info) {
		return new BankTransferPayment(info.bankAccountNumber);
	}
}
