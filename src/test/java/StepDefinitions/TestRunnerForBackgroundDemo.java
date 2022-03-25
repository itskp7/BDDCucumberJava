package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature", glue={"StepsForBackground"},
monochrome = true,
plugin= {"pretty","summary", "html:target/HtmlReports/KPreport.html",
		"json:target/JSONReports/KPcucumber.json",
		"junit:target/JUnitReports/KPrepoprt.xml"}
)

public class TestRunnerForBackgroundDemo {

}
