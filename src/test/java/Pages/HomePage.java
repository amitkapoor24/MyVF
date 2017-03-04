package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import util.PropertyReader;

public class HomePage {

	WebDriver driver;
	
	@FindBy(linkText = "My Vodafone")
	private WebElement MyVFLink;
	
	
	public HomePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}
	
	public void the_user_is_on_Vodafone_page() throws Throwable {
		String url = new PropertyReader().readProperty("url");   
		driver.get(url);
	}
	
	public void user_chooses_to_sign_up() throws Throwable {
		
		MyVFLink.click();
		
	}
}
