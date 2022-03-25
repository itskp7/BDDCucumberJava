package page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement logoutBtn;
	
	public HomePage_PF(WebDriver driver) {  //constructor for initializing  // "driver" OF CONSTRUCTOR
		this.driver = driver;         //GOOOOOOOOOODDDDDDDD  (made driver of this class equals driver of this constructor
		PageFactory.initElements(driver, this);
	}
	
	public void validateLogoutBtnPresent() {
		logoutBtn.isDisplayed();
	}

}
