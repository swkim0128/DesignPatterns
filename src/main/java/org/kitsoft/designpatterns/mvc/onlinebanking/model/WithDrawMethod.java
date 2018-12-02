package org.kitsoft.designpatterns.mvc.onlinebanking.model;

import java.io.Serializable;

interface WithdrawMethod extends Serializable
{
	public boolean withdraw(int balance, int amount);
}