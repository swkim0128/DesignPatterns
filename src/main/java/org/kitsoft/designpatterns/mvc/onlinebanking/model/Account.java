package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.Serializable;
import java.util.ArrayList;

import org.kitsoft.designpatterns.mvc.onlinebanking.controller.AccountObserver;

public class Account implements Serializable
{
	private String customerId;
	private String accountNum;
	private String bankName;
	protected int balance;

	protected CalculateInterestMethod calculateInterestMethod;
	protected WithdrawMethod withdrawMethod;
	
	protected ArrayList<TradeLog> tradeLogs; 
	private ArrayList<AccountObserver> observers;
	
	public Account(String customerId, String accountNum, String bankName)
	{
		this.customerId = customerId;
		this.accountNum = accountNum;
		this.bankName = bankName;
		tradeLogs = new ArrayList<TradeLog>();
		observers = new ArrayList<AccountObserver>();
	}
	
	public void registerObserver(AccountObserver o) {
		observers.add(o);
	}
	public void removeObserver(AccountObserver o) {
		observers.remove(o);
	}
	public void notifyObserver() {
		for(AccountObserver o : observers) {
			o.update(this);
		}
	}
	public void setAccount(Account a) {
		balance = a.getBalance();
		notifyObserver();
	}

	/*
	 * getter, setter 함수들
	 */
	public boolean isAccount(String accountNum) {
		if(this.accountNum.equals(accountNum))
			return true;
		else
			return false;
	}
	public boolean isCustomer(String id) {
		if(this.customerId.equals(id)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getBankName() {
		return bankName;
	}
	/*
	 * Account 잔액 계산 부분 및 거래내역 함수 부분
	 */
	public int getBalance()
	{
		return balance;
	}
	
	public void deposit(int amount)
	{
		balance += amount;
		addTradeLog(amount, "입금", balance);
	}
	
	public void withdraw(int amount)
	{
		if(withdrawMethod.withdraw(balance ,amount) == true)
		{
			balance -= amount;
			addTradeLog(-1*amount, "출금", balance);
		}
	}
	
	public int calculateInterest()
	{
		return calculateInterestMethod.calculateInterest(balance);
	}
	
	public void addTradeLog(int tradeAmount, String tradeType, int currentBalance)
	{
		tradeLogs.add(new TradeLog(tradeAmount, tradeType, currentBalance));
	}
	
	public ArrayList<TradeLog> getTradeLogs()
	{
		return tradeLogs;
	}
	
}