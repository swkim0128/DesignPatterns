package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestSaving extends CalculateInterestAccount {
	public CalculateInterestSaving(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		return 0;
	}
}
