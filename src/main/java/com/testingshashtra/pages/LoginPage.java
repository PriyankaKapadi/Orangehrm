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

	@FindBy(css = "form.oxd-form>div.oxd-form-row>div.oxd-input-group>div+div>input")
	private static WebElement username;

	@FindBy(css = "input[name='password']")
	private static WebElement password;

	@FindBy(css = "button[type='submit']")
	private static WebElement loginButton;

	public static void enterUsername() {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username, readPropertyFile.getUsername());
	}

	public static void enterPassword() {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, readPropertyFile.getPassword());
	}

	public static String clickOnLogin() {
		Keywords.clickOnWebElement(loginButton);
		return Keywords.driver.getCurrentUrl();
	}

}
