import static org.junit.Assert.assertEquals;

public class Application {

	public static void main(String[] args) {
		Employee developer = new Employee(2001, 5, 2, 3000, MartialStatus.Single, 0, Profession.Developer);
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaxMortgage(developer);
	    assertEquals(220000, result, 0.001);
	}

}	
