package org.kitsoft.designpatterns.strategy.account.interest;

import java.util.Calendar;

public class CalculateInterestSaving extends CalculateInterestAccount {
	public CalculateInterestSaving(int balance) {
		super(balance);
	}
	
	public int calculateInterest() {
		double result;
		if(compareNewYear()) {
			result = this.getBalance() * 0.05;
		}
		else {
			result = 0;
		}
		
		return (int)result;
	}
	
	private boolean compareNewYear() {
		Calendar current = Calendar.getInstance();
		Calendar newYear = Calendar.getInstance();
		
		newYear.set(Calendar.MONTH, Calendar.JANUARY);
		newYear.set(Calendar.DAY_OF_MONTH, 1);

		if(current.compareTo(newYear) == 0) {
			return true;
		}
		else
			return false;
	}
}
