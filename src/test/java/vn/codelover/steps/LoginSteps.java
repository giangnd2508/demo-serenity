package vn.codelover.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import vn.codelover.pages.LoginPage;
import vn.codelover.steps.serenity.LoginEndUserSteps;;

public class LoginSteps {

	@Steps
	LoginEndUserSteps loginEndUserSteps;

	@Steps
	LoginPage loginPage;

	@Given("^the user is on the hotel login page$")
	public void the_user_is_on_the_hotel_login_page() throws Throwable {
		loginEndUserSteps.is_the_home_page();
	}

	@Given("^the user enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_enters_email_and_password(String email, String password) throws Throwable {
		loginEndUserSteps.entersEmail(email);
		loginEndUserSteps.entersPassword(password);
	}

	@When("^the user clicks login button$")
	public void the_user_clicks_login_button() throws Throwable {
		loginEndUserSteps.clickLoginButton();
	}

	@Then("^the user sees the error \"([^\"]*)\"$")
	public void the_user_sees_the_error(String arg1) throws Throwable {
		loginEndUserSteps.should_see_error_message();
	}

}
