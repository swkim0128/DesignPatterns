package org.kitsoft.designpatterns.strategy.account;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestStrategy;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawStrategy;

public abstract class Account {
	private int balance;
	private WithdrawStrategy withdraw;
	private CalculateInterestStrategy calculateInterest;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int balance) {
		if(balance > 0)
			this.balance += balance;
		else
			System.out.println("No minus");
	}

	public void withdraw(int balance) {
		this.balance = withdraw.withdraw(this, balance);
	}
	
	public int calculateInterest() {
		return calculateInterest.calculateInterest(balance);
	}
	
	public void setWithdrawStrategy(WithdrawStrategy ws) {
		withdraw = ws;
	}
	public void setCalculateInterestStrategy(CalculateInterestStrategy cis) {
		calculateInterest = cis;
	}
}
