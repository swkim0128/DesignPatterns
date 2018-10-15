package org.kitsoft.designpatterns.factorymethod.manybank;

public class SinhanBank extends Bank {

	Account create(String accountType) {
		final String SHNORMAL = "신한보통계좌";
		final String SHMINUS = "신한마이너스계좌";
		final String SHSAVING = "신한증권계좌";

		Account account = null;
		
		switch(accountType) {
			case SHNORMAL:
				account = new SHNormalAccount();
				break;
			case SHMINUS:
				account = new SHMinusAccount();
				break;
			case SHSAVING:
				account = new SHSavingAccount();
			default :
				
		}
		return account;
	}
}
