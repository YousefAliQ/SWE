package test.steps;

import calculation.Calculator;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps {

    private Calculator calculator;
  
    @Given("^I have a calculator with value (\\d+)$")
    public void an_calculator_with_value(Integer value) {
    	calculator = new Calculator(value);
    }

    @When("^I add (\\d+)$")
    public void i_add(Integer value) {
    	calculator.add(value);
    }
    
    @When("I subtract {int}")
    public void i_subtract(Integer value) {
    	calculator.subtract(value);
    }
    
    @When("I multiply {int}")
    public void i_multiply(Integer value) {
    	calculator.multiply(value);
    }
    
    @Then("The value of the calculator is now {int}")
    public void the_value_of_the_calculator_is_now(Integer result) {
    	assertThat(calculator.getValue(), is(result));
    }	
}

