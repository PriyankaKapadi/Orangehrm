package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class ResetPasswordPage {

	public ResetPasswordPage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "input.oxd-input--active")
	private static WebElement username;

	@FindBy(css = "button.orangehrm-forgot-password-button--reset")
	private static WebElement resetPasswordButton;

	@FindBy(css = "span.oxd-input-field-error-message")
	private static WebElement errorMessage;

	public void enterUsername(String usernm) {
		WaitFor.visibilityOfElement(username);
		Keywords.enterTextTo(username, usernm);
	}

	public boolean isAvailableResetPasswordButton() {
		WaitFor.visibilityOfElement(resetPasswordButton);
		return Keywords.elementIsDisplayed(resetPasswordButton);

	}

	public void clickOnResetPasswordButton() {
		WaitFor.visibilityOfElement(resetPasswordButton);
		Keywords.clickOnWebElement(resetPasswordButton);

	}

	public String getErrorMessage() {
		WaitFor.visibilityOfElement(errorMessage);
		return Keywords.getTextFrom(errorMessage);
	}
}
