package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver;
	
	@Before("@smoke")          ///THIS IS USING HOOKS  // from cucumber library //this before will only run for @smoke
	// and for the second scenario from feature file it will fail bcz we there is no browser setup but we are quitting the browser
	public void browserSetup() {
		
		System.out.println("=====I am inside browserSetup=====");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src"
				+ "/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before(order=0)        // can use multiple before or after hooks and giver order // if no order specified then alphabetic 
	public void setup2() {
		System.out.println("==== I am inside setup2====");
	}
	
	@After(order=1)   // This IS USING HOOKS
	public void tearDown() {
		
		System.out.println("====I am in tearDown method====");
		driver.quit();
	}
	
	@After(order=2)
	public void tearDown2() {
		System.out.println("==== I am inside tearDown2=====");
	}
	
	@BeforeStep    // from cucumber library
	public void beforeSteps() {
		System.out.println("------I am inside beforeSteps-----");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("====I am inside afterSteps===");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
	}
	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		
	}




}
