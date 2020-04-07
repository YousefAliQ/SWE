package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.service.AccountService;


@RunWith(value=MockitoJUnitRunner.class)
public class TestAccountService {
	
	@Mock
	IAccountDAO accountDAO;

	AccountService accountService = null;
	private static Integer TEST_ACCOUNT_NUMBER = 12345678;
	
	@Before
	public void init() {
		//inject mock object
		accountService = new AccountService(accountDAO);
	}
	
	@Test
	public void testIfAccountCreatedCanBeRetrieved() throws Exception {
		accountService.createAccount(TEST_ACCOUNT_NUMBER);
		verify(accountDAO, times(1)).saveAccount(any(Account.class));
	}
	
	@Test
	public void testIfMoneyCanBeDeposited() throws Exception {
		Account account = new Account(TEST_ACCOUNT_NUMBER);
		when(accountDAO.loadAccount(TEST_ACCOUNT_NUMBER)).thenReturn(account);
		
		accountService.createAccount(TEST_ACCOUNT_NUMBER);
		accountService.deposit(TEST_ACCOUNT_NUMBER, 250.00);
		assertEquals(250.00, account.getBalance(), 0.001);
		verify(accountDAO, times(1)).updateAccount(any(Account.class));
	}
	
	@Test
	public void testIfMoneyCanBeWithdrawed() throws Exception{
		Account account = new Account(TEST_ACCOUNT_NUMBER);
		when(accountDAO.loadAccount(TEST_ACCOUNT_NUMBER)).thenReturn(account);
		
		accountService.createAccount(TEST_ACCOUNT_NUMBER);
		accountService.deposit(TEST_ACCOUNT_NUMBER, 250.00);
		accountService.withdraw(TEST_ACCOUNT_NUMBER, 250.00);
		assertEquals(0.00, account.getBalance(), 0.001);
		verify(accountDAO, times(2)).updateAccount(any(Account.class));
	}
	
}
