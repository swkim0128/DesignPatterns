package org.kitsoft.designpatterns.strategy.account.withdraw;

import org.kitsoft.designpatterns.strategy.account.Account;

public class WithdrawNormal implements WithdrawStrategy {	
	public int withdraw(Account account, int balance) {
		int result = account.getBalance() - balance;
		if(result >= 0) {
			return result;
		}
		else {
			System.out.println("잔고가 부족합니다.");
			return account.getBalance();
		}
	}
}
