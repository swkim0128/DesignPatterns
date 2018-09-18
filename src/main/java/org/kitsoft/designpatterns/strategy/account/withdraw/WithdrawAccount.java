package org.kitsoft.designpatterns.strategy.account.withdraw;

public abstract class WithdrawAccount implements WithdrawStrategy {
	private int balance;
	
	public WithdrawAccount(int balance) {
		this.balance = balance;
	}
	
	public abstract int withdraw(int balance);

	public int getBalance() {
		return balance;
	}
}
