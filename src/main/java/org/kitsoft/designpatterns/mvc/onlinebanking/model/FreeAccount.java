package org.kitsoft.designpatterns.mvc.onlinebanking.model;

public class FreeAccount extends Account
{
	public FreeAccount(String customerId, String accountNum, String bankName)
	{
		super(customerId, accountNum, bankName);
		withdrawMethod = new FreeWithdraw();
		calculateInterestMethod = new FreeCalculateInterest();
	}
}