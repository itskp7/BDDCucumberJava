package page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;  //"driver" OF THIS CLASS
	
	@FindBy(id="name")
	WebElement fullName;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	public LoginPage_PF(WebDriver driver) {  //constructor for initializing  // "driver" OF CONSTRUCTOR
		this.driver = driver;         //GOOOOOOOOOODDDDDDDD  (made driver of this class equals driver of this constructor
		PageFactory.initElements(driver, this);
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

}
