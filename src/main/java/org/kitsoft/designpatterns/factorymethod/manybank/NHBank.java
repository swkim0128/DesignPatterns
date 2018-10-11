package org.kitsoft.designpatterns.factorymethod.manybank;

public class NHBank extends Bank {
	Account create(String accountType) {
		Account account = null;
		
		if(accountType.equals("농협은행")) {
			
		}
		else if(accountType.equals("신한은행")) {
			
		}
		else if(accountType.equals("국민은행")) {
			
		}
		
		return account; 	
	}
}
