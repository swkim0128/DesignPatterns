package org.kitsoft.designpatterns.strategy.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new MinusAccount(-10000);
		
		System.out.println(account.calculateInterest());
	}
}
