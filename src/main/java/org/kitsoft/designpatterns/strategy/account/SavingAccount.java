package org.kitsoft.designpatterns.strategy.account;

import java.util.Date;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestNormal;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawSaving;

public class SavingAccount extends Account {
	private Date date;
	
	public SavingAccount(int balance) {
		super(balance);
		setWithdrawStrategy(new WithdrawSaving(balance));
		setCalculateInterestStrategy(new CalculateInterestNormal(balance));
	}
}
