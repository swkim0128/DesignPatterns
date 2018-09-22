package org.kitsoft.designpatterns.strategy.account.withdraw;

import org.kitsoft.designpatterns.strategy.account.Account;

public interface WithdrawStrategy {
	public int withdraw(Account account, int balance);
}
