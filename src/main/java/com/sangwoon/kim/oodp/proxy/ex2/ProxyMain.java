package com.sangwoon.kim.oodp.proxy.ex2;

public class ProxyMain {

	public static void main(String[] args) {
		BankAccountProxy adminAccount = new BankAccountProxy("Admin", 1000);
		adminAccount.deposit(500);
		adminAccount.deposit(300);

		BankAccountProxy userAccount = new BankAccountProxy("User", 1000);
		userAccount.deposit(500);
		userAccount.withdraw(300);

	}

}
