package com.sangwoon.kim.oodp.proxy.ex2;

public class BankAccountProxy implements BankAccount {

	private BankAccount target;
	private String userRole;

	public BankAccountProxy(String userRole, double initialBalance) {
		this.userRole = userRole;
		this.target = new RealBankAccount(initialBalance);
	}

	private boolean hasAccess() {
		return "Admin".equalsIgnoreCase(userRole);
	}


	@Override
	public void withdraw(double amount) {
		if (hasAccess()) {
			target.withdraw(amount);
		} else {
			System.out.println("Access Denied. Only Admin can withdraw");
		}
	}

	@Override
	public void deposit(double amount) {
		target.deposit(amount);
	}
}
