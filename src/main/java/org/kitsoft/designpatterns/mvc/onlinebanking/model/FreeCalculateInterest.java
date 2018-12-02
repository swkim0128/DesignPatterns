package org.kitsoft.designpatterns.mvc.onlinebanking.model;

public class FreeCalculateInterest implements CalculateInterestMethod
{
	public int calculateInterest(int balance)
	{
		return (int)(0.03 * balance);
	}
}
