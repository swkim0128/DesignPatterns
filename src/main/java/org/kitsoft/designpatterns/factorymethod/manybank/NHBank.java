package org.kitsoft.designpatterns.factorymethod.manybank;

public class NHBank extends Bank {
	
	Account create(String accountType) {
		final String NHNORMAL = "농협보통계좌";
		final String NHMINUS = "농협마이너스계좌";

		Account account = null;
		
		switch(accountType) {
			case NHNORMAL:
				account = new NHNormalAccount();
				break;
			case NHMINUS:
				account = new NHMinusAccount();
				break;
			default :
		}
		
		return account; 	
	}
}
