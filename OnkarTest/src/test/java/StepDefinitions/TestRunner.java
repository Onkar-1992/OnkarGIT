package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {
		"StepDefinitions" }, tags = "@setup or @registration", plugin = { "pretty", "html:target/cucumber-reports" }
// tags = "@setup and @registration"

)

public class TestRunner {
}
