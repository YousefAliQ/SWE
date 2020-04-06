package banktest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import bank.Account;
import bank.AccountType;

public class AccountTest {

	Account account; 
	@Before
	public void setUp() throws Exception {
		account = new Account();
	}

	@After
	public void tearDown() throws Exception {
		account = null;
	}

	@Test
	public void depositTest() {
		account.deposit(20);
		assertThat(20.0, equalTo(account.getBalance()));
	}
	
	@Test
	public void withdrawTest() {
		account.deposit(20);
		account.withdraw(20);
		assertThat(0.0, equalTo(account.getBalance()));
	}
	
	@Test
	public void depositEurosTest() {
		account.depositEuros(20);
		assertEquals(22.4, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving1PerTest() {
		account.deposit(900);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(909.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving2PerTest() {
		account.deposit(2000);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(2040.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving4PerTest() {
		account.deposit(6000);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(6240.0, account.getBalance(), 00000000000002);
	}
	
	
	@Test
	public void addInterestCheckings1And5PerTest() {
		account.deposit(1000);
		account.setType(AccountType.Checking);
		account.addInterest();
		assertEquals(1015.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestCheckings2And5PerTest() {
		account.deposit(2000);
		account.setType(AccountType.Checking);
		account.addInterest();
		assertEquals(2050.0, account.getBalance(), 00000000000002);
	}
}
