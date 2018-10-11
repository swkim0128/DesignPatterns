package org.kitsoft.designpatterns.factorymethod.manybank;

public abstract class Account {
	private String accountName;
	private int balance;
	
	public void setAccountName(String name) {
		this.accountName = name;
	}
	
	public String getAccountName() {
		return this.accountName;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
