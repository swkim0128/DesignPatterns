package org.kitsoft.designpatterns.strategy.account;

import org.kitsoft.designpatterns.strategy.account.interest.CalculateInterestNormal;
import org.kitsoft.designpatterns.strategy.account.withdraw.WithdrawNormal;

public class NormalAccount extends Account {
	public NormalAccount(int balance) {
		super(balance);
		setWithdrawStrategy(new WithdrawNormal());
		setCalculateInterestStrategy(new CalculateInterestNormal());
	}
}
