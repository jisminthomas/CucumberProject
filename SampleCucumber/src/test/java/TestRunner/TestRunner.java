package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/Feature/"},
		glue = {"StepDefinitions", "MyHooks"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/TestExtent.html"}
		
		)

public class TestRunner {

}
