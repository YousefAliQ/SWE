package banktest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import bank.Account;
import bank.AccountType;


public class AccountTest {

	Account account; 
	Account accountTransferTo; 
	
	
	@Before
	public void setUp() throws Exception {
		account = new Account();
		accountTransferTo = new Account();
	}

	@After
	public void tearDown() throws Exception {
		account = null;
		accountTransferTo = null;
	}

	@Test
	public void depositTest() {
		account.depositDollar(20);
		assertEquals(20.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void withdrawTest() {
		account.depositDollar(20);
		account.withdrawDollar(20);
		assertEquals(0.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void depositEurosTest() {
		account.depositEuros(20);
		assertEquals(22.4, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving1PerTest() {
		account.depositDollar(900);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(909.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving2PerTest() {
		account.depositDollar(2000);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(2040.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestToSaving4PerTest() {
		account.depositDollar(6000);
		account.setType(AccountType.Saving);
		account.addInterest();
		assertEquals(6240.0, account.getBalance(), 00000000000002);
	}
	
	
	@Test
	public void addInterestCheckings1And5PerTest() {
		account.depositDollar(1000);
		account.setType(AccountType.Checking);
		account.addInterest();
		assertEquals(1015.0, account.getBalance(), 00000000000002);
	}
	
	@Test
	public void addInterestCheckings2And5PerTest() {
		account.depositDollar(2000);
		account.setType(AccountType.Checking);
		account.addInterest();
		assertEquals(2050.0, account.getBalance(), 00000000000002);
	}
	
	@Test(expected = ArithmeticException.class)
	public void cannotWithdrowMoreThanBalanceDollar() {
		account.withdrawDollar(2000);
	}
	
	@Test(expected = ArithmeticException.class)
	public void cannotWithdrowMoreThanBalanceEuroTest() {
		account.withdrawEuros(2000);
	}
	
	@Test()
	public void transferDollarToTest() {
		account.depositDollar(200);
		account.transferDollarTo(accountTransferTo, 200);
		
		assertEquals(200.0, accountTransferTo.getBalance(), 00000000000002);
		assertEquals(0.0, account.getBalance(), 00000000000002);
	}
	
	@Test()
	public void transferEuroToTest() {
		account.depositEuros(200);
		account.transferEuroTo(accountTransferTo, 200);
		
		assertEquals(224.0, accountTransferTo.getBalance(), 00000000000002);
		assertEquals(0.0, account.getBalance(), 00000000000002);
	}
	
	@Test()
	public void getCustomerNameTest() {
		account.setCustomerName("SomeOne");
		assertTrue(account.getCustomerName().equals("SomeOne"));
	}
	
	@Test()
	public void getHistoryOfDepositTest() {
		account.depositDollar(2000);
		
	}
	
	@Test()
	public void getHistoryOfWithdrawTest() {
		account.depositDollar(2000);
		account.withdrawDollar(2000);
	}
}
