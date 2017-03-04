package vodafone.myvf.steps;

import Pages.HomePage;
import cucumber.api.java.en.Given;
import util.DriverFactory;

public class HomePageSteps extends DriverFactory {

	@Given("^the user is on Vodafone page$")
	public void the_user_is_on_Vodafone_page() throws Throwable {
		new HomePage(driver).the_user_is_on_Vodafone_page();
	}

}
