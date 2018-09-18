package org.kitsoft.designpatterns.strategy.account.withdraw;

public class WithdrawNormal extends WithdrawAccount {	
	public WithdrawNormal(int balance) {
		super(balance);
	}

	public int withdraw(int balance) {
		int result = super.getBalance() - balance;
		if(result > 0) {
			return result;
		}
		else {
			System.out.println("잔고가 부족합니다.");
			return super.getBalance();
		}
	}
}
