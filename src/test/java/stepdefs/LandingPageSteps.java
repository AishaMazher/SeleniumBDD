package stepdefs;

import cucumber.api.java.en.Given;
import general.MainCall;
import tests.RunCukesTest;

public class LandingPageSteps extends RunCukesTest{
	@Given("^User arrives to the landing page")
	public void user_arrives_to_the_landing_page() {
		MainCall.landingPage.arrivetoLanding();
	}

}
