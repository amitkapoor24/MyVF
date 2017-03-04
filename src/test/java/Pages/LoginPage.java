package Pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage   {
	WebDriver driver;

	@FindBy(id = "myvfLoginOnlineId")
	private WebElement LoginTextBox;
	
	@FindBy(id = "myvfLoginPassword")
	private WebElement PasswordTextBox;
	

	@FindBy(id="sign-in-button")
	private WebElement LoginButton;

	public LoginPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}




public void user_provides_the_Login_as(String LoginID) throws Throwable {
	LoginTextBox.sendKeys(LoginID);
}


public void user_provides_the_Password_as(String pwd) throws Throwable {
	PasswordTextBox.sendKeys(pwd);

}


public void user_login() throws Throwable {
    
	LoginButton.click();
}


public void user_should_be_logged_into_My_Vodafone() throws Throwable {
    Assert.assertTrue(driver.getTitle().contains("Summary - My Vodafone"));
    //Assert.assertTrue(driver.getTitle().contains("Sign in to My Vodafone"));
}
}
