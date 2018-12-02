package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import org.kitsoft.designpatterns.mvc.onlinebanking.model.AccountAccessManager;

public class BalanceInquiryController implements TransactionControllerImp {
	private AccountAccessManager aam;
	
	public BalanceInquiryController(AccountAccessManager aam) {
		this.aam = aam;
	}
	
	public void execute(String... accountInfos) {
		aam.inquireBalance();
	}
}
