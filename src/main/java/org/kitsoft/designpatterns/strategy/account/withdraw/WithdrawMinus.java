package org.kitsoft.designpatterns.strategy.account.withdraw;

public class WithdrawMinus extends WithdrawAccount {
	private int creditLimit;
	
	public WithdrawMinus(int balance, int creditLimit) {
		super(balance);
		this.creditLimit = creditLimit;
	}
	
	public int withdraw(int balance) {
		int result = this.getBalance() - balance;
		
		if(creditLimit < result) {
			return result;			
		}
		else {
			System.out.println("잔고가 부족합니다.");
			return this.getBalance();
		}
	}
}
