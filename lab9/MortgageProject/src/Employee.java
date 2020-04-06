public class Employee {

	int yearOfBirth;
	 int monthOfBirth;
	 int dayOfBirth;
	 double isMonthlyIncome;
	 MaritalStatus maritalStatus;
	 double hasMonthlyIncomePartner;
	 Profession profession;
	 
	 // TODO : break employee class down ... 
	public Employee(int yearOfBirth, int monthOfBirth, int dayOfBirth, double isMonthlyIncome, MaritalStatus maritalStatus, double hasMonthlyIncomePartner, Profession profession) {
		
		this.yearOfBirth = yearOfBirth;	
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.isMonthlyIncome = isMonthlyIncome;
		this.maritalStatus = maritalStatus;
		this.hasMonthlyIncomePartner = hasMonthlyIncomePartner;
		this.profession = profession;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public double getIsMonthlyIncome() {
		return isMonthlyIncome;
	}

	public void setIsMonthlyIncome(double isMonthlyIncome) {
		this.isMonthlyIncome = isMonthlyIncome;
	}


	public MaritalStatus getMartialStatus() {
		return maritalStatus;
	}

	public void setMartialStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public double getHasMonthlyIncomePartner() {
		return hasMonthlyIncomePartner;
	}

	public void setHasMonthlyIncomePartner(double hasMonthlyIncomePartner) {
		this.hasMonthlyIncomePartner = hasMonthlyIncomePartner;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	
	

}
