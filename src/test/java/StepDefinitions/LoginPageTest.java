package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginPageTest {
	
//	WebDriver driver;
//	LoginPage login; 
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("======I am inside LoginPageTest=======");  //just so that we know where we are while running
//		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/"
//				+ "test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters (.*) and (.*)$")  // Regular expression -Capture all - means there can be anything here (any value)
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		
//		login = new LoginPage(driver);  // object or instance of LoginPage class, this will call the constructor of that class
//		// and then made global
//		
//		login.enterUsername(username); // will get these data from the feature file LoginDemo.feature
//		login.enterPassword(password);
//		
//		// its like we are not hardcoding any data in the LoginPage.java instead we are want to use it from LoginPageTest.java but
//		// even since we have multiple sets of data in LoginDemo.feature we wanna use that
//		
////		driver.findElement(By.id("name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);
//	}
//	
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		
//		login.clickLogin();
//		
//		//driver.findElement(By.id("login")).click();
//	}
//
//	@Then("user is navigated to homepage")
//	public void user_is_navigated_to_homepage() throws InterruptedException {
//		
//		login.validateLogoutBtnPresent();
//		
//		//driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(3000);
//		////driver.getPageSource().contains("Logout");
//		driver.quit();
//	}

}
