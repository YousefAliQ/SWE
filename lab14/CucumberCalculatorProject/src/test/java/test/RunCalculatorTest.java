package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin  = { "pretty", "html:target/cucumber"  },
        glue = "test.steps",
        features = "classpath:cucumber"
)

public class RunCalculatorTest {

}
