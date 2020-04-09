package test.withdraw.steps;


import static org.junit.Assert.*;

import bank.domain.Account;
import bank.service.AccountService;
import bank.service.IAccountService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.IsCloseTo.closeTo;


public class WithdrawSteps {

IAccountService accountService = new AccountService();

	
	@Given("^the user has a bankaccount$")
	public void the_user_has_a_bankaccount() throws Exception {
		accountService.createAccount(1263862, "Frank Brown");
	}
	
	@Given("the account balance has {int} dollar")
	public void the_account_balance_has_dollar(Integer amount) {
		accountService.deposit(1263862, amount);
	}

	@When("^the user withdraws (\\d+) dollars$")
	public void the_user_withdraws_dollars(int amount) throws Exception {
		accountService.withdraw(1263862, amount);
	}

	@Then("^the amount of the bankaccount should be decreased to (\\d+) dollars$")
	public void the_amount_of_the_bankaccount_should_be_decreased_to_dollars(int amount) throws Exception {
		Account account = accountService.getAccount(1263862);
		assertThat(account.getBalance(), is(closeTo(amount, 0.00001))) ;
	}
	
}

