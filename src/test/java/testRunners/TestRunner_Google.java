package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/lruiz/eclipse-workspace/Taller_Cucumber/src/test/resources/features",
		glue={"stepDefinitions"},
		format =  {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestRunner_Google {
 
}
