package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Feature/"},
		glue = {"StepDefinitions", "MyHooks"},
		plugin = { "pretty", "html:target/firstreport.html"}
		
		)

public class TestRunner {

}
