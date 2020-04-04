import java.io.Console;
import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {
	
	public double computeMaxMortgage(Employee employee) {
	
		printEmployeeAge(employee);
		if ( ! isAdult(employee)) return 0;
		
		if (! employee.isMarried()) return calculateSingleEmployee(employee);
		return  calculateMarriedEmployee(employee);
		
	}
	
	private double calculateSingleEmployee(Employee employee) {
		
		if (isMonthlyIncomeBetween2000And3000(employee)) {
			if (isDeveloperCluster(employee)) return 160000;
			if (isTechnicalCluster(employee)) return 120000;
			if (isHeadCluster(employee) ) return 220000;
		}
		if (isMonthlyIncomeBetween3000And5000(employee)) {
			if (isDeveloperCluster(employee)) return 180000;
			if (isTechnicalCluster(employee)) return 140000;
			if (isHeadCluster(employee) ) return 250000;
		}
		if (isMonthlyIncomeMore5000(employee)) {
			if (isDeveloperCluster(employee)) return  220000;
			if (isTechnicalCluster(employee)) return  160000;
			if (isHeadCluster(employee) ) return 280000;
		}
		return 0;
	}
	
private double calculateMarriedEmployee(Employee employee) {
		
	if (isTotalIncomeBetween2000And3000(employee)) {
		if (isDeveloperCluster(employee)) return 160000;
		if (isTechnicalCluster(employee)) return 120000;
		if (isHeadCluster(employee)) return 220000;
	}
	if (isTotalIncomeBetween3000And5000(employee)) {
		if (isDeveloperCluster(employee)) return 180000;
		if (isTechnicalCluster(employee)) return  140000;
		if (isHeadCluster(employee)) return  250000;
	}
	if (isTotalIncomeMore5000(employee)) {
		if (isDeveloperCluster(employee)) return 220000;
		if (isTechnicalCluster(employee)) return  160000;
		if (isHeadCluster(employee)) return  280000;
	}
		return 0;
	}

	private int calculateEmployeeAge(Employee employee) {
		LocalDate today = LocalDate.now();  
		LocalDate birthday = LocalDate.of(employee.getYearOfBirth(), employee.getMonthOfBirth(), employee.getDayOfBirth());  
		 
		Period period = Period.between(birthday, today);
		int age = period.getYears();
		return age;
	}
	
	private void printEmployeeAge(Employee employee) {
		System.out.println(calculateEmployeeAge(employee));
	}
	
	private boolean isMonthlyIncomeBetween2000And3000(Employee employee) {
		double monthlyIncome = employee.getIsMonthlyIncome();
		return 2000<= monthlyIncome && monthlyIncome<3000;
	}
	
	
	private boolean isMonthlyIncomeBetween3000And5000(Employee employee) {
		double monthlyIncome = employee.getIsMonthlyIncome();
		return 3000<=monthlyIncome && monthlyIncome<5000;
	}
	
	private boolean isMonthlyIncomeMore5000(Employee employee) {
		double monthlyIncome = employee.getIsMonthlyIncome();
		return 5000<=monthlyIncome;
	}
	
	private boolean isTotalIncomeBetween2000And3000(Employee employee) {
		double totalIncome = calculateTotalIncome(employee); 
		
		return  2000<= totalIncome && totalIncome<3000;
	}
	

	private boolean isTotalIncomeBetween3000And5000(Employee employee) {
		double totalIncome = calculateTotalIncome(employee); 
		return 3000<=totalIncome && totalIncome<5000;
	}
	
	private boolean isTotalIncomeMore5000(Employee employee) {
		double totalIncome = calculateTotalIncome(employee); 
		return  5000<=totalIncome;
	}
	
	
	private double calculateTotalIncome(Employee employee) {
		double monthlyIncome = employee.getIsMonthlyIncome();
		double hasPartner = employee.getHasMonthlyIncomePartner();
		return  monthlyIncome + hasPartner * 0.94; 
	}
	
	private boolean isAdult(Employee employee) {
		int age = calculateEmployeeAge(employee);
		return age >18;
	}
	
	
	private boolean isDeveloperCluster(Employee employee) {
		Profession profession = employee.getProfession();
		return profession == Profession.Developer || profession == Profession.Architect || profession == Profession.ScrumMaster;
	}
	
	private boolean isTechnicalCluster(Employee employee) {
		Profession profession = employee.getProfession();
		return profession == Profession.Tester || profession == Profession.SystemAdministrator || profession == Profession.TechnicalWriter;
	}
	
	private boolean isHeadCluster(Employee employee) {
		Profession profession = employee.getProfession();
		return profession == Profession.Professor || profession == Profession.DepartmentHead ;
	}

}

//52
//18
//42
//65

