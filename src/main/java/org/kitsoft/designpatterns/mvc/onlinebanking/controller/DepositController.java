package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountAccessManager;

public class DepositController implements TransactionControllerImp {
	private AccountAccessManager aam;
	
	public DepositController(AccountAccessManager aam) {
		this.aam = aam;
	}
	
	public void execute(String... accountInfos) {
		aam.deposit(accountInfos);
	}
}
