package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	private static RegisterPage registerPage;
	private static WelcomePage welcomePage;
	@BeforeClass
	public static void openTheBrowser() {
	System.setProperty("webdriver.chrome.driver",
	"/home/yousef/Desktop/SWE/w3d2/lab/chromedriver");
	// create chrome instance
	WebDriver driver = new ChromeDriver();
	
	registerPage = new RegisterPage();
	
	}
	@AfterClass
	public static void closeTheBrowser() {
	
	}
	@Test
	public void signUp() {
		
	//WelcomePage welcomePage = registerPage.submit();
	//welcomePage.verifyHeader("Thank you!");
	}
	
}
