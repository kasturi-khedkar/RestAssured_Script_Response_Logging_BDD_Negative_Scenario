package StepDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",glue= {"StepDefinitions"})
public class TestRunner extends ResponseLogging{

}
