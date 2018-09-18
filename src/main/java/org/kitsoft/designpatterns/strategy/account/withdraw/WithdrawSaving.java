package org.kitsoft.designpatterns.strategy.account.withdraw;

public class WithdrawSaving extends WithdrawAccount {
	public WithdrawSaving(int balance) {
		super(balance);
	}
	
	public int withdraw(int balance) {
		return 0;
	}
}
