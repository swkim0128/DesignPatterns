package org.kitsoft.designpatterns.factorymethod.singlebank;

public class BankTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountFactory af = new AccountFactory();
		
		Bank bank = new Bank(af);
		bank.createAccount("보통계좌");
		bank.createAccount("마이너스계좌");
		bank.createAccount("증권계좌");
	}

}
