package vn.codelover.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://hotelprofits.codelovers.vn/login")
public class LoginPage extends PageObject {
	
	@FindBy(id="UserEmail")
    private WebElementFacade emailInput;

	@FindBy(id="UserPassword")
	private WebElementFacade passwordInput;
	
	@FindBy(xpath="//button")
	private WebElementFacade loginButton;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div")
	private WebElementFacade errorMessage;


    public void enter_email(String email) {
    	emailInput.type(email);
    }
    
    public void enter_password(String password) {
    	passwordInput.type(password);
    }

    public void click_LoginButton() {
    	loginButton.click();
    }
    
    public String get_Error_Message() {
    	String loginErrorMessage = errorMessage.getText();
    	return loginErrorMessage;
    }
    
    public static final String LOGIN_ERROR_MESSAGE = "ユーザー名かパスワードが無効です。";
    
    

}
