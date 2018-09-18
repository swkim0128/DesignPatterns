package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestNormal extends CalculateInterestAccount {
	public CalculateInterestNormal(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		return 0;
	}
}
