package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
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
	
	@FindBy(css = "input.orangehrm-middlename")
	private static WebElement middleName;
	
	@FindBy(css = "form.oxd-form>div.oxd-form-actions>p+button+button")
	private static WebElement saveButton;
	
	@FindBy(css = "oxd-form-loader")
	private static WebElement formLoader;
	
	@FindBy(css = "div.orangehrm-edit-employee-content>div>h6")
	private static WebElement personalDetails;
	
	@FindBy(css = "div.oxd-grid-2>div>div>div+div>input")
	private static WebElement employeeId;
	
	@FindBy(css = "span.oxd-input-field-error-message")
	private static WebElement errorMessage;
	
	@FindBy(css = "i.bi-plus")
	private static WebElement plusButton;
	
	@FindBy(css = "input.oxd-file-input")
	private static WebElement fileImage;
	
	@FindBy(css = "span.oxd-input-field-error-message")
	private static WebElement errorMessageForImage;
	
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
	
	public void enterMiddleName(String mname) {
		WaitFor.visibilityOfElement(middleName);
		Keywords.enterTextTo(middleName, mname);
	}
	
	public void enterEmpId(String empId) {
		WaitFor.visibilityOfElement(employeeId);
		Keywords.enterTextTo(employeeId, empId);
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
	
	public String getErrorMessage() {
		WaitFor.visibilityOfElement(errorMessage);
		return Keywords.getMessage(errorMessage);
	}
	
	public void clickOnImageIcon(String path) {
		boolean flag=WaitFor.invisibilityOfElement(formLoader);
		if(flag==true) {
			WaitFor.elementToBeClickable(plusButton);
			Keywords.moveToAnyElement(plusButton);
			Keywords.enterTextTo(fileImage,path);
		}
	}
	
	public String getErrorMessageForPsdImage() {
		WaitFor.visibilityOfElement(errorMessageForImage);
		return Keywords.getMessage(errorMessageForImage);
	}
}
