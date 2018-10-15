package org.kitsoft.designpatterns.factorymethod.manybank;

public class AccountTestDrive {
	public static void main(String[] args) {
		Account account;
		Bank bank;
		
		bank = new KBBank();
		account = bank.create("국민보통계좌");
		System.out.println("account " + account.getAccountName());
		account = bank.create("국민마이너스계좌");
		System.out.println("account " + account.getAccountName());
		account = bank.create("국민증권계좌");
		System.out.println("account " + account.getAccountName());
		
		bank = new NHBank();
		account = bank.create("농협보통계좌");
		System.out.println("account " + account.getAccountName());
		account = bank.create("농협마이너스계좌");
		System.out.println("account " + account.getAccountName());
	
		bank = new SinhanBank();
		account = bank.create("신한보통계좌");
		System.out.println("account " + account.getAccountName());
		account = bank.create("신한마이너스계좌");
		System.out.println("account " + account.getAccountName());
		account = bank.create("신한증권계좌");
		System.out.println("account " + account.getAccountName());
	
	}
}
