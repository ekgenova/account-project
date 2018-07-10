package com.qa.accountapp.accountapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import accounts.Account;
import accounts.AccountService;

public class AccountServiceTest {
	
	AccountService accS  = new AccountService();

	@Test
	public void accountAdded() {
		accS.addAccount(new Account("Ekaterina", "Genova", 941115));
		accS.addAccount(new Account("Benjamin", "Chandler", 541381));
		assertEquals(false, accS.getHash().isEmpty());
		assertEquals(2, accS.getHash().size());
	}
	
	@Test
	public void getByKey() {
		Account account1 = new Account("Test", "Test2", 491914);
		accS.addAccount(account1);
		assertEquals(account1, accS.getByKey(1));
	}
	
	@Test
	public void countByName() {
		accS.addAccount(new Account("Ekaterina", "Genova", 9414141));
		assertEquals(1, accS.getNumAccountsByFirstName("Ekaterina"));
		assertEquals(0, accS.getNumAccountsByFirstName("Benjamin"));
	}

}
