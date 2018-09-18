package org.kitsoft.designpatterns.strategy.account.withdraw;

public class WithdrawMinus extends WithdrawAccount {
	public WithdrawMinus(int balance) {
		super(balance);
	}
	
	public int withdraw(int balance) {
		return 0;
	}
}
