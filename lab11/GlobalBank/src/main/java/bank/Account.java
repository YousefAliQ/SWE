package bank;

public class Account {
	private double balance;
	private AccountType type;
	
	
	private CurrencyConverter currencyConverter = new CurrencyConverter();

	public void deposit(double amount) {
		if (amount >= 0.0) {
			balance = balance + amount;
		}
	}

	public void withdraw(double amount) {
		if (amount >= 0.0) {
			balance = balance - amount;
		}
	}

	public void depositEuros(double amount) {
		if (amount >= 0.0) {
			double dollarAmount = currencyConverter.convertEurosToDollars(amount);
			deposit(dollarAmount);
		}
	}

	public void withdrawEuros(double amount) {
		if (amount >= 0.0) {
			double dollarAmount = currencyConverter.convertEurosToDollars(amount);
			withdraw(dollarAmount);
		}
	}
	public void addInterest() {
		
		if(this.getType() == AccountType.Saving) {
			addInterestToSaving();
			return;
		}
		
		if(this.getType() == AccountType.Checking) {
			addInterestToChecking();
			return;
		}
	}
	
	private void addInterestToSaving() {
		if(this.getBalance() <= 1000) {
			double interest = calculateInterest(1.0);
			this.deposit(interest);
			return;
		}
		
		if(this.getBalance() <= 5000) {
			double interest = calculateInterest(2.0);
			this.deposit(interest);
			return;
		}
		
		if(this.getBalance() > 5000) {
			double interest = calculateInterest(4.0);
			this.deposit(interest);
			return;
		}
	}

	private void addInterestToChecking() {
		if(this.getBalance() <= 1000) {
			double interest = calculateInterest(1.5);
			this.deposit(interest);
			return;
		}
		
		if(this.getBalance() > 1000) {
			double interest = calculateInterest(2.5);
			this.deposit(interest);
			return;
		}
	}
	
	private double calculateInterest(double percentage) {
		
		double interest = this.getBalance() * (percentage/100);
		return interest;
	}


	public double getBalance() {
		return balance;
	}
	
	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}


}
