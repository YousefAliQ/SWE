package test;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
	private WebDriver driver;

	@Before
	public void createWebDriver() {
		// set path to chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "/home/yousef/Desktop/SWE/w3d2/lab/chromedriver");
		// create chrome instance
		driver = new ChromeDriver();
	}

	@After
	public void closeWebDriver() {
		driver.close();
	}

	@Test
	public void oneAndFour() {
		driver.navigate().to("http://www.rekenmachine-calculator.nl/");

		WebElement button = driver.findElement(By.name("one"));
		button.click();
		button = driver.findElement(By.name("add"));
		button.click();
		button = driver.findElement(By.name("four"));
		button.click();
		assertThat(driver.findElement(By.name("txt")).getAttribute("value"), is("1+4"));
		button = driver.findElement(By.name("equal"));
		button.click();
		assertThat(driver.findElement(By.name("txt")).getAttribute("value"), is("5"));
	}
	
	@Test
	  public void multiplyFiveByTwo() {
	    driver.get("https://www.rekenmachine-calculator.nl/");
	    driver.manage().window().setSize(new Dimension(1920, 1040));
	  
	    
	    driver.findElement(By.name("five")).click();
	    driver.findElement(By.name("mul")).click();
	    driver.findElement(By.name("two")).click();
	    driver.findElement(By.name("equal")).click();
	    {
	      String value = driver.findElement(By.xpath("//*[@id=\"table6\"]/tbody/tr[1]/td/div/font/input")).getAttribute("value");
	      assertThat(value, is("10"));
	    }
	  }
	
	@Test
	  public void devideTenByTwo() {
	    driver.get("https://www.rekenmachine-calculator.nl/");
	    driver.manage().window().setSize(new Dimension(1920, 1040));
	    
	    driver.findElement(By.name("one")).click();
	    driver.findElement(By.name("zero")).click();
	    driver.findElement(By.name("div")).click();
	    driver.findElement(By.name("two")).click();
	    driver.findElement(By.name("equal")).click();
	    {
	      String value = driver.findElement(By.xpath("//*[@id=\"table6\"]/tbody/tr[1]/td/div/font/input")).getAttribute("value");
	      assertThat(value, is("5"));
	    }
	  }
	
}
