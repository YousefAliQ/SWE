package test.deposit.steps;

import static org.junit.Assert.*;

import bank.domain.Account;
import bank.service.AccountService;
import bank.service.IAccountService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.IsCloseTo.closeTo;


public class DepositSteps {
	IAccountService accountService = new AccountService();

	
	@Given("^the user has a bankaccount$")
	public void the_user_has_a_bankaccount() throws Exception {
		accountService.createAccount(1263862, "Frank Brown");
	}

	@When("^the user deposits (\\d+) dollars$")
	public void the_user_deposits_dollars(int amount) throws Exception {
		accountService.deposit(1263862, amount);
	}

	@Then("^the amount of the bankaccount should be increased by (\\d+) dollars$")
	public void the_amount_of_the_bankaccount_should_be_increased_by_dollars(int amount) throws Exception {
		Account account = accountService.getAccount(1263862);		
		assertThat(account.getBalance(), is(closeTo(amount, 0.00001))) ;
	}
}
