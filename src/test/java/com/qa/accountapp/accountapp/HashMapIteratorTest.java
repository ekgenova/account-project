
package com.qa.accountapp.accountapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import accounts.Account;
import accounts.AccountService;

public class HashMapIteratorTest {

	private AccountService accServ;
	private HashMapIterator iterator;
	
	@Before
	public void setUp() throws Exception {
		accServ = new AccountService();
		iterator = new HashMapIterator();
	}


	@Test
	public void test() {
		accServ.addAccount(new Account("Ekaterina", "Genova", 941115));
		assertEquals(1, iterator.countAccountsByName("Ekaterina"));
	}

}
