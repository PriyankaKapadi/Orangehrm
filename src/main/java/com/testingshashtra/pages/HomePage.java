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
	
	public static void clickDropDownMenu() {
		Keywords.clickOnWebElement(dropDownMenu);
	}

	public static void selectOptionFromList() {
		WaitFor.visibilityOfElement(changePassword);
		Keywords.clickOnWebElement(changePassword);
	}

	public static boolean checkForWebElementPresence() {
		WaitFor.visibilityOfElement(checkForWebElement);
		return Keywords.elementIsDisplayed(checkForWebElement);
	}
}
