package org.kitsoft.designpatterns.strategy.account.withdraw;

import java.util.Calendar;

public class WithdrawSaving extends WithdrawAccount {
	private Calendar expirationDate;
	
	public WithdrawSaving(int balance, Calendar expirationDate) {
		super(balance);
		this.expirationDate = expirationDate;
	}
	
	public int withdraw(int balance) {
		Calendar current = Calendar.getInstance();
		
		if(current.compareTo(expirationDate) == 1) {
			return this.getBalance() - balance;
		}
		else {
			System.out.println("게약만료일 x");
			return this.getBalance();
		}
	}
}
