package org.kitsoft.designpatterns.strategy.account;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestNormal;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawMinus;

public class MinusAccount extends Account {
	private int creditLimit = 10000000;
	
	public MinusAccount(int balance) {
		super(balance);
		setWithdrawStrategy(new WithdrawMinus(balance));
		setCalculateInterestStrategy(new CalculateInterestNormal(balance));
	}
}
