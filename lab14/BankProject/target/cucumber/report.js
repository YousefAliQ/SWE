$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber/BankingWithdraw.feature");
formatter.feature({
  "name": "Banking Withdraw",
  "description": "  As a user with a bankaccount\n  I want to withdraw money\n  So that I have less money in my account",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Withdraw 100 dollar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@WithdrawTest"
    }
  ]
});
formatter.step({
  "name": "the user has a bankaccount",
  "keyword": "Given "
});
formatter.match({
  "location": "WithdrawSteps.the_user_has_a_bankaccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the account balance has 100 dollar",
  "keyword": "And "
});
formatter.match({
  "location": "WithdrawSteps.the_account_balance_has_dollar(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user withdraws 100 dollars",
  "keyword": "When "
});
formatter.match({
  "location": "WithdrawSteps.the_user_withdraws_dollars(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the amount of the bankaccount should be decreased to 0 dollars",
  "keyword": "Then "
});
formatter.match({
  "location": "WithdrawSteps.the_amount_of_the_bankaccount_should_be_decreased_to_dollars(int)"
});
formatter.result({
  "status": "passed"
});
});