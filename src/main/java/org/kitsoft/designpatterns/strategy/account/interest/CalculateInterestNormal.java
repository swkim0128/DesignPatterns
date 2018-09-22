package org.kitsoft.designpatterns.strategy.account.interest;

public class CalculateInterestNormal implements CalculateInterestStrategy {
	public int calculateInterest(int balance) {
		double result = balance * 0.03;
		return (int)result;
	}
}
