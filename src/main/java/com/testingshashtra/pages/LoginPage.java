package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.utils.readPropertyFile;
import com.testingshashtra.wait.WaitFor;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "input[name='username']")
	private static WebElement username;

	@FindBy(css = "input[name='password']")
	private static WebElement password;

	@FindBy(css = "button[type='submit']")
	private static WebElement loginButton;
	
	@FindBy(css = "p.oxd-alert-content-text")
	private static WebElement errorMessageInvalidCredential;

	@FindBy(css = "div.oxd-input-group__label-wrapper+div+span.oxd-input-group__message")
	private static WebElement errorMessageRequired;

	public void enterUsername(String usernm) {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username,usernm);
	}

	public void enterPassword(String pwd) {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, pwd);
	}

	public String clickOnLogin() {
		Keywords.clickOnWebElement(loginButton);
		return Keywords.getUrlPage();
	}

	public String switchToHomePage() {
		Keywords.switchToWindow();
		return Keywords.getUrlPage();
	}
	
	public String getErrorMessage() {
		WaitFor.visibilityOfElement(errorMessageInvalidCredential);
		return Keywords.getMessage(errorMessageInvalidCredential);
	}

	public static String getErrorMessageForBlankText() {
		WaitFor.visibilityOfElement(errorMessageRequired);
		return Keywords.getMessage(errorMessageRequired);
	}
}
