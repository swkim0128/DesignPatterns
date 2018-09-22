package org.kitsoft.designpatterns.strategy.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class SavingAccountTest {
	private Account account;
	
	@BeforeEach
	void setUp() throws Exception {
		account = new SavingAccount(50000);
	}
	
	@Test
	void withdrawTest() {
		account.withdraw(10000);
		assertEquals(40000, account.getBalance());
		
		SavingAccount saving = (SavingAccount)account;
		saving.setExpirationDate(2020, 2, 27);
		saving.withdraw(10000);
		assertEquals(40000, saving.getBalance());
	}
	
	@Test
	void calculateInterestTest() {
		assertEquals(0, account.calculateInterest());
	}
}
