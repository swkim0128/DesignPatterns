package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountAccessManager implements Serializable {
	private DataAccessManager dam = null;
	private Account account = null;
	
	private static AccountAccessManager Instance = null;
	static {
		try {
			Instance = new AccountAccessManager();
		}
		catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
	}

	private AccountAccessManager() {

	}
	
	public static AccountAccessManager getInstance() {		
		return Instance;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Account findAccount(String accountNum) {
		dam = DataAccessManager.getInstance();
		Account temp = dam.findAccount(accountNum);
		
		return temp;
	}
	
	public boolean createAccount(Account account) {
		dam = DataAccessManager.getInstance();
		return dam.createAccount(account);
	}
	
	public void deposit(String... accountInfos) {
		int balance = Integer.parseInt(accountInfos[0]);
		account.deposit(balance);
		
		dam = DataAccessManager.getInstance();
		dam.saveAccount(account);
	}
	
	public void withdraw(String... accountInfos) {
		int balance = Integer.parseInt(accountInfos[0]);
		account.withdraw(balance);
		
		dam = DataAccessManager.getInstance();
		dam.saveAccount(account);
	}
	
	public void inquireBalance() {
		account.getBalance();
	}
	
	public void inquireTransactionInfo() {
		account.getTradeLogs();
	}
		
	public void transferAccount(String... accountInfos) {
		String accountNum = accountInfos[0];
		int balance = Integer.parseInt(accountInfos[1]);
		
		account.withdraw(balance);
		
		Account transferAccount = dam.findAccount(accountNum);
	}
}
