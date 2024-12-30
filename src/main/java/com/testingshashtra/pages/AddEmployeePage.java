package com.testingshashtra.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

public class AddEmployeePage {

	public AddEmployeePage() {
		PageFactory.initElements(Keywords.driver, this);
	}

	@FindBy(css = "a[href='/web/index.php/pim/viewPimModule']")
	private static WebElement pimMenu;
	
	@FindBy(css = "div.oxd-topbar-body>nav>ul>li+li+li>a.oxd-topbar-body-nav-tab-item")
	private static WebElement addEmployeeButton;
	
	@FindBy(css = "input.orangehrm-firstname")
	private static WebElement firstName;
	
	@FindBy(css = "input.orangehrm-lastname")
	private static WebElement lastName;
	
	@FindBy(css = "form.oxd-form>div.oxd-form-actions>p+button+button")
	private static WebElement saveButton;
	
	@FindBy(css = "oxd-form-loader")
	private static WebElement formLoader;
	
	@FindBy(css = "div.orangehrm-edit-employee-content>div>h6")
	private static WebElement personalDetails;
		
	public void clickOnPimMenu() {
		WaitFor.visibilityOfElement(pimMenu);
		Keywords.clickOnWebElement(pimMenu);
	}
	
	public void clickAddEmployeeButton() {
		WaitFor.visibilityOfElement(addEmployeeButton);
		Keywords.clickOnWebElement(addEmployeeButton);
	}
	
	public void enterFirstName(String fname) {
		WaitFor.visibilityOfElement(firstName);
		Keywords.enterTextTo(firstName, fname);
	}
	
	public void enterLastName(String lname) {
		WaitFor.visibilityOfElement(lastName);
		Keywords.enterTextTo(lastName, lname);
	}
	
	public void clickOnSaveButton() {
		boolean flag=WaitFor.invisibilityOfElement(formLoader);
		if(flag==true) {
			WaitFor.elementToBeClickable(saveButton);
			Keywords.moveToAnyElement(saveButton);
		}
	}
	
	public boolean availablePersonalDetails() {
		WaitFor.visibilityOfElement(personalDetails);
		return Keywords.elementIsDisplayed(personalDetails);
	}
}
