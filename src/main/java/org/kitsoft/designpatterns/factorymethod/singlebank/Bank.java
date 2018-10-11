package org.kitsoft.designpatterns.factorymethod.singlebank;

public class Bank {
	AccountFactory af;
	
	public Bank(AccountFactory af) {
		this.af = af;
	}
	
	public Account createAccount(String accountType) {
		Account account = af.create(accountType);
		
		System.out.println("Account create " + account.getAccountName());
		return account;
	}
}
