package org.kitsoft.designpatterns.strategy.account;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class NormalAccountTest {
	private Account account;
	
	@BeforeEach
	void setUp() {
		account = new NormalAccount(10000);
	}

	@Test
	void depositTest() {
		account.deposit(10000);
		assertEquals(20000, account.getBalance());
		
		account.deposit(30000);
		assertEquals(50000, account.getBalance());
	}

	@Test
	void withdrawTest() {
		account.withdraw(10000);
		assertEquals(0, account.getBalance());
				
		account.withdraw(10000);
		assertEquals(0, account.getBalance());
	}
	
	@Test
	void calculateInterestTest() {
		assertEquals(300,account.calculateInterest());
		
		account.deposit(10000);
		assertEquals(600, account.calculateInterest());
	}

}
