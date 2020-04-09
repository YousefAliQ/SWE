package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

 

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin  = { "pretty", "html:target/cucumber"  },
        glue = "test.deposit.steps",
        features = "classpath:cucumber/BankingDeposit.feature",
        //tags = {"@FunctionalTest, ~@DepositTest"} // OR
        tags = {"@FunctionalTest", "~@DepositTest"} // AND
)
public class RunDepositTest {

}
