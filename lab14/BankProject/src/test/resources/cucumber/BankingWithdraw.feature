@FunctionalTest
Feature: Banking Withdraw
  As a user with a bankaccount
  I want to withdraw money
  So that I have less money in my account

@WithdrawTest
Scenario:  Withdraw 100 dollar
Given the user has a bankaccount
And the account balance has 100 dollar
When the user withdraws 100 dollars
Then the amount of the bankaccount should be decreased to 0 dollars