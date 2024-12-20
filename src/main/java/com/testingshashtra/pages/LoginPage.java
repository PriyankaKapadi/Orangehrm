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

	@FindBy(css="div.oxd-input-group__label-wrapper+div+span.oxd-input-group__message")
	private static WebElement errorMessageRequired; 
	
	public static void enterValidUsername() {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username, readPropertyFile.getUsername());
	}

	public static void enterValidPassword() {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, readPropertyFile.getPassword());
	}

	public static String clickOnLogin() {
		Keywords.clickOnWebElement(loginButton);
		return Keywords.getUrlPage();
	}

	public static String switchToHomePage() {
		Keywords.switchToWindow();
		return Keywords.getUrlPage();
	}

	public static void enterInvalidUsername() {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username, readPropertyFile.getInvalidUsername());
	}

	public static void enterInvalidPassword() {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, readPropertyFile.getInvalidPassword());
	}

	public static String getErrorMessage() {
		WaitFor.visibilityOfElement(errorMessageInvalidCredential);
		return Keywords.getMessage(errorMessageInvalidCredential);
	}

	public static void enterBlankUsername() {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username, "");
	}

	public static void enterBlankPassword() {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, "");
	}
	
	public static String getErrorMessageForBlankText() {
		WaitFor.visibilityOfElement(errorMessageRequired);
		return Keywords.getMessage(errorMessageRequired);
	}
}
