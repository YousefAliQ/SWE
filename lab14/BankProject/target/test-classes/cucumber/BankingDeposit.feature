@FunctionalTest
Feature: Banking Deposit
  As a user with a bankaccount
  I want to deposit money
  So that I have more money in my account

@DepositTest
Scenario:  Deposit 100 dollar
Given the user has a bankaccount
When the user deposits 100 dollars
Then the amount of the bankaccount should be increased by 100 dollars