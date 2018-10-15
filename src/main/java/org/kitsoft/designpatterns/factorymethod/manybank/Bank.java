package org.kitsoft.designpatterns.factorymethod.manybank;

public abstract class Bank {
	abstract Account create(String accountType);
	
	Account order(String accountType) {
		Account account = create(accountType);
		
		
		return account;
	}

}
