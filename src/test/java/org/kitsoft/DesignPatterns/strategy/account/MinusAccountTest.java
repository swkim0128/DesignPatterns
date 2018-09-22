package org.kitsoft.designpatterns.strategy.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class MinusAccountTest {
	private Account account;

	@BeforeEach
	void setUp() throws Exception {
		account = new MinusAccount(50000);
	}

	@Test
	void depositTest() {
		account.deposit(50000);
		assertEquals(100000, account.getBalance());
		
		account.deposit(100000);
		assertEquals(200000, account.getBalance());
		
		account.deposit(-100000);
		assertEquals(200000, account.getBalance());
	}
	
	@Test
	void withdrawTest() {
		account.withdraw(10000);
		assertEquals(40000, account.getBalance());
		
		account.withdraw(50000);
		assertEquals(-10000, account.getBalance());
		
		account.withdraw(90000);
		assertEquals(-100000, account.getBalance());
		assertEquals(-10000, account.getBalance());
		
		account.withdraw(1000000000);
		assertEquals(-100000, account.getBalance());
	}
	
	@Test
	void calculateInterestTest() {
		assertEquals(0, account.calculateInterest());
		
		account.withdraw(60000);
		assertEquals(-700, account.calculateInterest());
	}
}
