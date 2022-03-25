package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement fullName;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="logout")      // this should be on different java class bcz different page but raghav does it here
	WebElement logoutBtn;
	
	public LoginPage(WebDriver driver) {  //constructor for initializing
		PageFactory.initElements(driver, this);
		this.driver = driver;         //GOOOOOOOOOODDDDDDDD
	}
	
	public void enterUsername(String usn) {
		fullName.sendKeys(usn);
	}
	
	public void enterPassword(String pwd) {
		pass.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public void login(String usn, String pwd) {
		fullName.sendKeys(usn);
		pass.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void validateLogoutBtnPresent() {
		logoutBtn.isDisplayed();
	}
	
	
 
}
