package org.kitsoft.designpatterns.mvc.onlinebanking.model;

public class MinusAccount extends Account
{
	int creditLimit;
	
	public MinusAccount(String customerId, String accountNum, String bankName, int creditLimit)
	{
		super(customerId, accountNum, bankName);
		this.creditLimit = creditLimit;
		withdrawMethod = new MinusWithdraw(creditLimit);
		calculateInterestMethod = new MinusCalculateInterest();
	}
	
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
}
