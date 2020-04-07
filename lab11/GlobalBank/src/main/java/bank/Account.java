package bank;

public class Account {
	private double balance;
	private AccountType type;
	private String customerName;
	
	
	private CurrencyConverter currencyConverter = new CurrencyConverter();

	public void depositDollar(double amount) {
		if (amount >= 0.0) {
			balance = balance + amount;
		}
	}

	public void withdrawDollar(double amount) {
		if (this.balance < amount) throw new ArithmeticException();
		if (amount >= 0.0) {
			balance = balance - amount;
		}
	}

	public void depositEuros(double amount) {
		if (amount >= 0.0) {
			double dollarAmount = currencyConverter.convertEurosToDollars(amount);
			depositDollar(dollarAmount);
		}
	}

	public void withdrawEuros(double amount) {
		if (this.balance < amount) throw new ArithmeticException();
		if (amount >= 0.0) {
			double dollarAmount = currencyConverter.convertEurosToDollars(amount);
			withdrawDollar(dollarAmount);
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
			this.depositDollar(interest);
			return;
		}
		
		if(this.getBalance() <= 5000) {
			double interest = calculateInterest(2.0);
			this.depositDollar(interest);
			return;
		}
		
		if(this.getBalance() > 5000) {
			double interest = calculateInterest(4.0);
			this.depositDollar(interest);
			return;
		}
	}

	private void addInterestToChecking() {
		if(this.getBalance() <= 1000) {
			double interest = calculateInterest(1.5);
			this.depositDollar(interest);
			return;
		}
		
		if(this.getBalance() > 1000) {
			double interest = calculateInterest(2.5);
			this.depositDollar(interest);
			return;
		}
	}
	
	private double calculateInterest(double percentage) {
		
		double interest = this.getBalance() * (percentage/100);
		return interest;
	}



	public void transferDollarTo(Account accountTransferTo, double amount) {
		this.withdrawDollar(amount);
		accountTransferTo.depositDollar(amount);
	}
	
	public void transferEuroTo(Account accountTransferTo, double amount) {
		this.withdrawEuros(amount);
		accountTransferTo.depositEuros(amount);
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

}
