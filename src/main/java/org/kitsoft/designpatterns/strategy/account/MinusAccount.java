package org.kitsoft.designpatterns.strategy.account;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestMinus;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawMinus;

public class MinusAccount extends Account {
	private final int creditLimit = -10000000;
	
	public MinusAccount(int balance) {
		super(balance);
		setWithdrawStrategy(new WithdrawMinus(balance, creditLimit));
		setCalculateInterestStrategy(new CalculateInterestMinus(balance));
	}
}
