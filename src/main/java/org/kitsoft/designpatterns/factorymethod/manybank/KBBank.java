package org.kitsoft.designpatterns.factorymethod.manybank;

public class KBBank extends Bank {

	Account create(String accountType) {
		final String KBNORMAL = "국민보통계좌";
		final String KBMINUS = "국민마이너스계좌";
		final String KBSAVING = "국민증권계좌";

		Account account = null;
		
		switch(accountType) {
			case KBNORMAL:
				account = new KBNormalAccount();
				break;
			case KBMINUS:
				account = new KBMinusAccount();
				break;
			case KBSAVING:
				account = new KBSavingAccount();
				break;
			default :
				
		}
		
		return account;
	}
}
