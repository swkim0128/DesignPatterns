package org.kitsoft.designpatterns.mvc.onlinebanking.model;

public class MinusWithdraw implements WithdrawMethod
{
	private final int creditLimit;
	
	MinusWithdraw(final int creditLimit)
	{
		this.creditLimit = creditLimit;
	}
	
	public boolean withdraw(int balance, int amount)
	{
		if((balance + creditLimit) - amount < 0) 
		{
			return false; //잔고부족, 인출 불가
		}
		else
		{
			return true; //인출가능
		}
	}
}