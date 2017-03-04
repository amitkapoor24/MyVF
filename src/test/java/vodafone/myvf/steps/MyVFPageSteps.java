package vodafone.myvf.steps;

import Pages.HomePage;
import cucumber.api.java.en.When;
import util.DriverFactory;

public class MyVFPageSteps extends DriverFactory{
	@When("^user chooses to sign up$")
	public void user_chooses_to_sign_up() throws Throwable {
		
		new HomePage(driver).user_chooses_to_sign_up();
	}

}
