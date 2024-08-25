package RunnerPackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/Feature",
   //path of step definition file
   glue = {"StepDefinitions"},
   plugin = {"pretty", "html:target/cucumber-reports.html"},
   monochrome = true
   )

public class TestRunner {
}
