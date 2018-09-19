package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestMinus extends CalculateInterestAccount {
	public CalculateInterestMinus(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		double result = 0;
		if(this.getBalance() < 0) {
			result = this.getBalance() * 0.07;
		}
		else {
			result = 0;
		}
		
		return (int)result;
	}
}
