package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyVFPage {

	WebDriver driver;
	
	@FindBy(linkText="Login")
	private WebElement MyVFLogin;
	
	public MyVFPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	public void user_click_on_login() throws Throwable {
		
		MyVFLogin.click();
		
	}	
}
