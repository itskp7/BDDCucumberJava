package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver;         ///can provide a null value
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		
//		//System.out.println(System.getProperty("user.dir"));
//		
//		String projectPath=System.getProperty("user.dir");
//	
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src"
//				+ "/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step - user is on google search page");
//		
//		//driver.get("https://www.google.com/");
//		driver.navigate().to("https://www.google.com/");
//		//driver.navigate().back();
//		//driver.navigate().forward();
//	}
//
//	@When("user enters a text in searchbox")
//	public void user_enters_a_text_in_searchbox() {
//		System.out.println("Inside Step - user enters a text in searchbox");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");;
//	  
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step - hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step - user is navigated to search results");
//		
//		driver.getPageSource().contains("Online Courses");  // less effective I think
//		driver.quit();
//	}

}
