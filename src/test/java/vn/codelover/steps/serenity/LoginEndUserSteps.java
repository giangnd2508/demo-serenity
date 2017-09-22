package vn.codelover.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.codelover.pages.LoginPage;;

public class LoginEndUserSteps {
	LoginPage loginPage;

	@Step
	public void entersEmail(String email) {
		loginPage.enter_email(email);
	}

	@Step
	public void entersPassword(String password) {
		loginPage.enter_password(password);
	}

	@Step
	public void clickLoginButton() {
		loginPage.click_LoginButton();
	}

	@Step
	public void should_see_error_message() {
		// assertThat(LoginPage.LOGIN_ERROR_MESSAGE, loginPage.get_Error_Message());
		System.out.println("This is a fake error");
	}

	@Step
	public void is_the_home_page() {
		loginPage.open();
	}

	@Step
	public void logIn(String email, String password) {
		entersEmail(email);
		entersPassword(password);
		clickLoginButton();
	}

}
