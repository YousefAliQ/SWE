package page;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	protected WebDriver driver;

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);

	}

	@FindBy(name = "zero")
	private WebElement zeroButton;
	@FindBy(name = "one")
	private WebElement oneButton;
	@FindBy(name = "two")
	private WebElement twoButton;
	@FindBy(name = "three")
	private WebElement threeButton;
	@FindBy(name = "four")
	private WebElement fourButton;
	@FindBy(name = "five")
	private WebElement fiveButton;
	@FindBy(name = "cancel")
	private WebElement clearButton;
	@FindBy(name = "add")
	private WebElement addButton;
	@FindBy(name = "sub")
	private WebElement subtractButton;
	@FindBy(name = "div")
	private WebElement devideButton;
	@FindBy(name = "mul")
	private WebElement multiplyButton;
	@FindBy(name = "equal")
	private WebElement equalButton;
	@FindBy(name = "txt")
	private WebElement resultField;

	public void open() {
		driver.get("http://www.rekenmachine-calculator.nl/");
	}

	public void close() {
		driver.close();
	}

	public String clickZero() {
		zeroButton.click();
		return resultField.getAttribute("value");
	}
	
	public String clickOne() {
		oneButton.click();
		return resultField.getAttribute("value");
	}

	public String clickTwo() {
		twoButton.click();
		return resultField.getAttribute("value");
	}

	public String clickThree() {
		threeButton.click();
		return resultField.getAttribute("value");
	}

	public String clickFour() {
		fourButton.click();
		return resultField.getAttribute("value");
	}
	public String clickFive() {
		fiveButton.click();
		return resultField.getAttribute("value");
	}
	
	public void clickClear() {
		clearButton.click();
	}

	public String clickEqual() {
		equalButton.click();
		return resultField.getAttribute("value");
	}

	public String clickAdd() {
		addButton.click();
		return resultField.getAttribute("value");
	}
	public String clickSubtract() {
		subtractButton.click();
		return resultField.getAttribute("value");
	}
	public String clickDivide() {
		devideButton.click();
		return resultField.getAttribute("value");
	}
	public String clickMultiply() {
		multiplyButton.click();
		return resultField.getAttribute("value");
	}
	public String getResult() {
		return resultField.getAttribute("value");
	}

	public void checkThatResultIs(String string) {
		assertThat(getResult(),  is(string));
		
	}

}
