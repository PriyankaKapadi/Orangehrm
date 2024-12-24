package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "i.oxd-userdropdown-icon")
	private static WebElement dropDownMenu;

	@FindBy(css = "a[href='/web/index.php/pim/updatePassword']")
	private static WebElement changePassword;

	@FindBy(css = "h6.oxd-topbar-header-breadcrumb-module")
	private static WebElement checkForWebElement;

	@FindBy(css = "a[href='/web/index.php/auth/logout']")
	private static WebElement logoutButton;
	
	@FindBy(css = "input[name='username']")
	private static WebElement checkForUsername;

	public void clickDropDownMenu() {
		WaitFor.visibilityOfElement(dropDownMenu);
		Keywords.clickOnWebElement(dropDownMenu);
	}

	public void selectOptionFromList() {
		WaitFor.visibilityOfElement(changePassword);
		Keywords.clickOnWebElement(changePassword);
	}

	public boolean checkForWebElementPresence() {
		WaitFor.visibilityOfElement(checkForWebElement);
		return Keywords.elementIsDisplayed(checkForWebElement);
	}

	public void clickLogoutButton() {
		Keywords.clickOnWebElement(logoutButton);
	}
	
	public boolean checkForPresenceOfUsername() {
		WaitFor.visibilityOfElement(checkForUsername);
		return Keywords.elementIsDisplayed(checkForUsername);
	}
}
