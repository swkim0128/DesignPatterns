package org.kitsoft.designpatterns.strategy.account;

import java.util.Calendar;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestSaving;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawSaving;

public class SavingAccount extends Account {
	private Calendar expirationDate = Calendar.getInstance();
		
	public SavingAccount(int balance) {
		super(balance);
		expirationDate.set(2018, Calendar.SEPTEMBER, 20);

		setWithdrawStrategy(new WithdrawSaving(balance, expirationDate));
		setCalculateInterestStrategy(new CalculateInterestSaving(balance));
	}
}
