package org.kitsoft.designpatterns.strategy.account.withdraw;

import java.util.Calendar;

import org.kitsoft.designpatterns.strategy.account.Account;
import org.kitsoft.designpatterns.strategy.account.SavingAccount;

public class WithdrawSaving implements WithdrawStrategy {
	public int withdraw(Account account, int balance) {
		SavingAccount saving = (SavingAccount)account;
		Calendar current = Calendar.getInstance();
		
		if(current.compareTo(saving.getExpirationDate()) == 1) {
			return account.getBalance() - balance;
		}
		else {
			System.out.println("게약만료일 x");
			return account.getBalance();
		}
	}
}
