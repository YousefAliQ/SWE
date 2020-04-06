import static org.junit.Assert.*;

import org.junit.Test;

public class MortgageTest {

	@Test
	public void test1() {
		Employee architect = new Employee(1967, 5, 2, 3000, MaritalStatus.Single, 0, Profession.Architect);
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaxMortgage(architect);
	    assertEquals(180000, result, 0.001);
	}
		
	@Test
	public void test2() {
		Employee architect = new Employee(2001, 5, 2, 3000, MaritalStatus.Single, 0, Profession.Architect);
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaxMortgage(architect);
	    assertEquals(0, result, 0.001);
	}
	
	@Test
	public void test3() {
		Employee developer = new Employee(1977, 12, 2, 4000, MaritalStatus.Married, 2000, Profession.Developer);
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaxMortgage(developer);
	    assertEquals(220000, result, 0.001);
	}
	
	@Test
	public void test4() {
		Employee professor = new Employee(1954, 5, 12, 5500, MaritalStatus.Single, 0, Profession.Professor);
		MortgageCalculator mc = new MortgageCalculator();
		double result = mc.computeMaxMortgage(professor);
	    assertEquals(280000, result, 0.001);
	}

}
