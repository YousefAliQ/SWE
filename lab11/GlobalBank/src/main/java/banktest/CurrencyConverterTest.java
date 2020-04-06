package banktest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import bank.CurrencyConverter;

public class CurrencyConverterTest {

	CurrencyConverter currencyConverter;
	
	@Before
	public void setUp() throws Exception {
		currencyConverter = new CurrencyConverter();
	}

	@After
	public void tearDown() throws Exception {
		currencyConverter=null;
	}

	@Test
	public void convertEurosToDollarsZeroTest() {
		double result = currencyConverter.convertEurosToDollars(0);
		assertThat(0.0, equalTo(result));
	}

	@Test
	public void convertEurosToDollarsPositiveNumberTest() {
		double amount =20;
		double actual = currencyConverter.convertEurosToDollars(amount);
		assertEquals(22.4, actual, 0.0000000001);
	}
	
	@Test
	public void convertEurosToDollarsNegativeNumberTest() {
		double amount = -20;
		double actual = currencyConverter.convertEurosToDollars(amount);
		assertEquals(-22.4, actual, 0.0000000001);
	}
	
}
