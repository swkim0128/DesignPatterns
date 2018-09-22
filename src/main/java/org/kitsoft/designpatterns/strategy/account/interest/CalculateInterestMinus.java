package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestMinus implements CalculateInterestStrategy {	
	public int calculateInterest(int balance) {
		double result = 0;
		if(balance < 0) {
			result = balance * 0.07;
		}
		else {
			result = 0;
		}
		
		return (int)result;
	}
}
