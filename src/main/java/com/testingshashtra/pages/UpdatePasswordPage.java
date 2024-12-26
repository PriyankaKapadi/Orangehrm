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

	@FindBy(css = "span.oxd-input-field-error-message")
	private static WebElement errorMessageBlankCurrentPass;

	@FindBy(css = "div.oxd-toast-container--bottom>div.oxd-toast--error>div>div+div.oxd-toast-content--error>p+p.oxd-toast-content-text")
	private static WebElement errorMsgNumberCP;

	@FindBy(css = "div.user-password-row>div>div.user-password-cell>div>div+div+span")
	private static WebElement errorMessageForNewPassword;

	@FindBy(css = "div.user-password-row>div>div+div>div>div+div+span.oxd-input-field-error-message")
	private static WebElement errorMsgConfirmPassword;

	public void enterCurrentPassword(String currPwd) {
		WaitFor.visibilityOfElement(currentPassword);
		Keywords.enterTextTo(currentPassword, currPwd);
	}

	public void enterNewPassword(String newPwd) {
		WaitFor.visibilityOfElement(password);
		Keywords.enterTextTo(password, newPwd);
	}

	public void enterConfirmPassword(String confirmPwd) {
		WaitFor.visibilityOfElement(confirmPassword);
		Keywords.enterTextTo(confirmPassword, confirmPwd);
	}

	public void clickOnSaveButton() {
		Keywords.clickOnWebElement(saveButton);
	}

	public String getSuccessMessage() {
		WaitFor.visibilityOfElement(successMessage);
		return Keywords.getMessage(successMessage);
	}

	public String getErrorMsgBlankPassword() {
		WaitFor.visibilityOfElement(errorMessageBlankCurrentPass);
		return Keywords.getMessage(errorMessageBlankCurrentPass);
	}

	public String getErrorMsgForInavalidCurrentPassword() {
		WaitFor.visibilityOfElement(errorMsgNumberCP);
		return Keywords.getMessage(errorMsgNumberCP);
	}

	public String getErrorMessageForNewPassword() {
		WaitFor.visibilityOfElement(errorMessageForNewPassword);
		return Keywords.getMessage(errorMessageForNewPassword);
	}

	public String getErrorMsgForConfirmPassword() {
		WaitFor.visibilityOfElement(errorMsgConfirmPassword);
		return Keywords.getMessage(errorMsgConfirmPassword);
	}

	public void clickOnCancelButton() {
		WaitFor.visibilityOfElement(cancelButton);
		Keywords.clickOnWebElement(cancelButton);
	}

}
