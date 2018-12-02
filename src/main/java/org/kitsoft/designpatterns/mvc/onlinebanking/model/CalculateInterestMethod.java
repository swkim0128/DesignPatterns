package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.Serializable;

interface CalculateInterestMethod extends Serializable
{
	public int calculateInterest(int balance);
}
