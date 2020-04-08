package page;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorTestPageObject {
	private static CalculatorPage page;

	  @BeforeClass
	  public static void openTheBrowser() {
	    System.setProperty("webdriver.chrome.driver",   
	                       "/home/yousef/Desktop/SWE/w3d2/lab/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    page = new CalculatorPage(driver);
	    page.open();
	  }

	  @AfterClass
	  public static void closeTheBrowser() {
	    page.close();
	  }

	  @Test
	  public void oneAndFour() {
	    page.clickOne();
	    page.clickAdd();
	    page.clickFour();
	    page.checkThatResultIs("1+4");
	    page.clickEqual();
	    page.checkThatResultIs("5");
	    page.clickClear();
	  }
	  
	  @Test
	  public void mulFiveAndTwo() {
	    page.clickFive();
	    page.clickMultiply();
	    page.clickTwo();
	    page.checkThatResultIs("5*2");
	    page.clickEqual();
	    page.checkThatResultIs("10");
	    page.clickClear();
	  }
	  
	  @Test
	  public void divTenByTwo() {
	    page.clickOne();
	    page.clickZero();
	    page.clickDivide();
	    page.clickTwo();
	    page.checkThatResultIs("10/2");
	    page.clickEqual();
	    page.checkThatResultIs("5");
	    page.clickClear();
	  }


	}