package org.kitsoft.designpatterns.strategy.account.interest;

public abstract class CalculateInterestAccount implements CalculateInterestStrategy {
	private int balance;
	
	public CalculateInterestAccount(int balance) {
		this.balance = balance;
	}
	
	public abstract int calculateInterest();
	
	public int getBalance() {
		return balance;
	}
}
