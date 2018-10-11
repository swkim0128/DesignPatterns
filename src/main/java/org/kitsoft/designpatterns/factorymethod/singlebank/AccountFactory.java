package org.kitsoft.designpatterns.factorymethod.singlebank;

public class AccountFactory {
	public Account create(String accountType) {
		Account account = null;
		
		if(accountType.equals("보통계좌"))
			account = new NormalAccount();
		else if(accountType.equals("마이너스계좌"))
			account = new MinusAccount();
		else if(accountType.equals("증권계좌"))
			account = new SavingAccount();
		
		return account;
	}
}
