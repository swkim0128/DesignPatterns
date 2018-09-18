package org.kitsoft.designpatterns.strategy.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new NormalAccount(10000);
		account.withdraw(1000);
		System.out.println(account.getBalance());
	}
}
