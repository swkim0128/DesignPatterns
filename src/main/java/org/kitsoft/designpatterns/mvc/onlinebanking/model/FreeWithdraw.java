package org.kitsoft.designpatterns.mvc.onlinebanking.model;

class FreeWithdraw implements WithdrawMethod
{
	public boolean withdraw(int balance, int amount)
	{
		if(balance - amount < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}