package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= "C:\\BDDWorkspace\\cucumberFrameworkScenarioContext\\src\\test\\resources\\functionalTests",
			glue= {"stepDefinitions"}
)
public class TestRunner {

}
