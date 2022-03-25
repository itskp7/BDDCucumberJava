package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Selenium_Workspace/BDDCucumberJava/src/test/resources/Features", glue={"StepDefinitions"},
monochrome = true,
plugin= {"pretty", "html:target/HtmlReports/KPreport.html",
		"json:target/JSONReports/KPcucumber.json",
		"junit:target/JUnitReports/KPrepoprt.xml"}
//tags = "@KPFeature"  // we are not using tag at the moment if wanna use jsut add a comma

		
		)

public class TestRunner {

}
