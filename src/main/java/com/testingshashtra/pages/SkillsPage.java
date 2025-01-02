package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

public class SkillsPage {

	public SkillsPage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "button.oxd-button--secondary")
	private static WebElement addSkillsButton;

	public boolean isAvailableAddButton() {
		WaitFor.visibilityOfElement(addSkillsButton);
		return Keywords.elementIsDisplayed(addSkillsButton);
	}

	public void clickOnAddSkillButton() {
		WaitFor.visibilityOfElement(addSkillsButton);
		Keywords.clickOnWebElement(addSkillsButton);
	}
}
