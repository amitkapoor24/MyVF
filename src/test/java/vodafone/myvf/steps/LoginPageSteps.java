package vodafone.myvf.steps;

import Pages.LoginPage;
import Pages.MyVFPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import util.DriverFactory;
import util.TakePageScreenshot;

public class LoginPageSteps extends DriverFactory{
	
	@And("^user click on login$")
	public void user_click_on_login() throws Throwable {
			
		new MyVFPage(driver).user_click_on_login();
	}
	
	@And("^user provides the Login as \"([^\"]*)\"$")
	public void user_provides_the_Login_as(String LoginID) throws Throwable {
		
		new LoginPage(driver).user_provides_the_Login_as(LoginID);
	}

	@And("^user provides the Password as \"([^\"]*)\"$")
	public void user_provides_the_Password_as(String pwd) throws Throwable {
	    
		new LoginPage(driver).user_provides_the_Password_as(pwd);
	}

	@And("^user login$")
	public void user_login() throws Throwable {
		
		new LoginPage(driver).user_login();
	}	
	
	@Then("^user should be logged into My Vodafone$")
	public void user_should_be_logged_into_My_Vodafone() throws Throwable {
		new LoginPage(driver).user_should_be_logged_into_My_Vodafone();
		
	}
	
	@Before
    public void beforeScenario(){
		driver = new DriverFactory().getDriver();
        
    }

    @After
    public void afterScenario(){
    	try {
			new TakePageScreenshot().getscreenshot(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	new DriverFactory().destroyDriver();
        
    }
}
