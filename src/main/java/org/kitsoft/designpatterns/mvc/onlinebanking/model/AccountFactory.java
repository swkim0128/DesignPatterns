package org.kitsoft.designpatterns.mvc.onlinebanking.model;

public class AccountFactory {
	public Account create(String customerId, String accountNum, String bankName, String accountType) {
		Account a = null;
		
		if(accountType.equals("일반 계좌")) {
			a = new FreeAccount(customerId, accountNum, bankName);
		}
		else if(accountType.equals("마이너스 계좌")) {
			a = new MinusAccount(customerId, accountNum, bankName, 0);
		}
		
		return a;
	}
}
