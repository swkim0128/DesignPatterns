package org.kitsoft.designpatterns.strategy.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account normal = new NormalAccount(50000);
		Account minus = new MinusAccount(50000);
		Account saving = new SavingAccount(50000);
		
		System.out.println("-- normal -- balance : 50000");
		System.out.println("normal interest : " + normal.calculateInterest());
		normal.withdraw(10000);
		System.out.println("withdraw 10000 : " + normal.getBalance());
		normal.withdraw(50000);
		System.out.println("withdraw 50000 : " + normal.getBalance());
		
		System.out.println("-- minus -- balance : 50000");
		System.out.println("minus interest : " + minus.calculateInterest());
		minus.withdraw(10000);
		System.out.println("withdraw 10000 : " + minus.getBalance());
		minus.withdraw(50000);
		System.out.println("withdraw 50000 : " + minus.getBalance());
		System.out.println("minus interest : " + minus.calculateInterest());
		
		System.out.println("-- saving -- balance : 50000"); 
		System.out.println("saving interest : " + saving.calculateInterest());
		saving.withdraw(10000);
		System.out.println("withdraw 10000 : " + saving.getBalance());
		
	}
}
