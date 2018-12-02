package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountAccessManager;

public class WithdrawController implements TransactionControllerImp {
	private AccountAccessManager aam;
	
	public WithdrawController(AccountAccessManager aam) {
		this.aam = aam;
	}
	
	public void execute(String... accountInfos) {
		aam.withdraw(accountInfos);
	}
}
