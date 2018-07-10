
package com.qa.accountapp.accountapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import accounts.AccountService;

public class HashMapIteratorTest {

	AccountService accServ;
	HashMapIterator iterator;
	
	@Before
	public static void setUp() throws Exception {
		accServ = new AccountService();
		iterator = new HashMapIterator();
	}


	@Test
	public void test() {
		accServ.addAccount("Ekaterina", "Genova", 941115);
		assertEquals(1, iterator.countAccountsByName("Ekaterina"));
	}

}
