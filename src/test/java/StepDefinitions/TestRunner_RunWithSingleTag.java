package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Selenium_Workspace\\BDDCucumberJava\\src\\test\\resources\\FeatureWithTags", glue={"StepDefinitions"},
tags = "@regression and not @smoke")


public class TestRunner_RunWithSingleTag {

}
