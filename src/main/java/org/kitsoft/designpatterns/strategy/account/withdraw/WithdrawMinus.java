package org.kitsoft.designpatterns.strategy.account.withdraw;

import org.kitsoft.designpatterns.strategy.account.Account;
import org.kitsoft.designpatterns.strategy.account.MinusAccount;

public class WithdrawMinus implements WithdrawStrategy {	
	public int withdraw(Account account, int balance) {
		MinusAccount minus = (MinusAccount)account;
		int result = account.getBalance() - balance;
		
		if(minus.getCreditLimit() <= result) {
			return result;			
		}
		else {
			System.out.println("잔고가 부족합니다.");
			return account.getBalance();
		}
	}
}
