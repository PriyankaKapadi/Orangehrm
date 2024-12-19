package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.utils.readPropertyFile;
import com.testingshashtra.wait.WaitFor;

public class UpdatePasswordPage {

	public UpdatePasswordPage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "div.user-password-row>div>div.user-password-cell>div>div+div>input")
	private static WebElement password;

	@FindBy(css = "div.oxd-form-row>div>div+div>div>div+div>input:nth-child(1)")
	private static WebElement currentPassword;

	@FindBy(css = "div.user-password-row>div>div+div>div>div+div>input")
	private static WebElement confirmPassword;

	@FindBy(css = "button.orangehrm-left-space")
	private static WebElement saveButton;

	@FindBy(css = "button.oxd-button--ghost")
	private static WebElement cancelButton;

	@FindBy(css = "div.oxd-toast-content--success>p.oxd-text--toast-message")
	private static WebElement successMessage;

	public static void enterCurrentPassword() {
		WaitFor.visibilityOfElement(currentPassword);
		Keywords.enterTextTo(currentPassword, readPropertyFile.getPassword());
	}

	public static void enterNewPassword() {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, readPropertyFile.getNewPassword());
	}

	/*
	 * public static void enterNewPassword(String enterPassword) {
	 * WaitFor.visibilityOfElement(password); if
	 * (enterPassword.equals(readPropertyFile.getPassword())) {
	 * Keywords.enterTextTo(password, enterPassword); } }
	 */

	public static void enterConfirmPassword() {
		WaitFor.visibilityOfElement(confirmPassword);
		Keywords.enterTextTo(confirmPassword, readPropertyFile.getConfirmPassword());
	}

	public static void clickOnSaveButton() {
		Keywords.clickOnWebElement(saveButton);
	}

	public static void getSuccessMessage() {
		Keywords.getMessage(successMessage);
	}
}
