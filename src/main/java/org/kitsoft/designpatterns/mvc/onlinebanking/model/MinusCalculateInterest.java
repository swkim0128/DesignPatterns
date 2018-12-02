package org.kitsoft.designpatterns.mvc.onlinebanking.model;

class MinusCalculateInterest implements CalculateInterestMethod
{
	public int calculateInterest(int balance)
	{
		if(balance < 0) return (int)(-0.07 * balance);
		else return (int) (0.07 * balance);
	}
}