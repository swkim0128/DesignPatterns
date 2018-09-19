package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestNormal extends CalculateInterestAccount {
	public CalculateInterestNormal(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		double result = this.getBalance() * 0.03;
		return (int)result;
	}
}
