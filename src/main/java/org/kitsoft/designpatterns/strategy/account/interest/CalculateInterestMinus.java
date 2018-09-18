package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestMinus extends CalculateInterestAccount {
	public CalculateInterestMinus(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		return 0;
	}
}
