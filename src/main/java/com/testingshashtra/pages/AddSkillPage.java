package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

public class AddSkillPage {

	public AddSkillPage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "input.oxd-input:last-child")
	private static WebElement nameTextfield;

	@FindBy(css = "button.oxd-button--secondary")
	private static WebElement saveButton;

	@FindBy(css = "span.oxd-input-field-error-message")
	private static WebElement errorMessage;

	@FindBy(css = "div.orangehrm-vertical-padding>span.oxd-text")
	private static WebElement recordFound;

	public boolean isNameTextFieldAvailable() {
		WaitFor.visibilityOfElement(nameTextfield);
		return Keywords.elementIsDisplayed(nameTextfield);
	}

	public void enterNameInAddSkill(String name) {
		WaitFor.visibilityOfElement(nameTextfield);
		Keywords.enterTextTo(nameTextfield, name);
	}

	public void clickOnSaveButton() {
		WaitFor.visibilityOfElement(saveButton);
		Keywords.clickOnWebElement(saveButton);
	}

	public String getErrorMessageNameField() {
		WaitFor.visibilityOfElement(errorMessage);
		return Keywords.getTextFrom(errorMessage);
	}

	public String getTextFromRecordFound() {
		WaitFor.visibilityOfElement(recordFound);
		return Keywords.getTextFrom(recordFound);
	}

}
