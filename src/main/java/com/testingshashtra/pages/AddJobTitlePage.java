package com.testingshashtra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.wait.WaitFor;

public class AddJobTitlePage {
	
	public AddJobTitlePage() {
		PageFactory.initElements(Keywords.driver, this);
	}

		@FindBy(css = "a[href^='/web/index.php/admin/viewAdminModule']")
		private static WebElement admin;
		
		@FindBy(css = "ul.oxd-dropdown-menu>li:first-child>a")
		private static WebElement jobTitle ;
		
		@FindBy(css = "button.oxd-button")
		private static WebElement add;
		
		@FindBy(css = "div.oxd-input-group__label-wrapper+div>input.oxd-input")
		private static WebElement titleBlank ;
		
		@FindBy(css = "div.oxd-form-actions>button+button")
		private static WebElement saveButton;
		
		@FindBy(css = "span.oxd-input-field-error-message")
		private static WebElement errorMsg;
		
		@FindBy(css = "nav.oxd-topbar-body-nav>ul>li+li>span.oxd-topbar-body-nav-tab-item")
		private static WebElement clickJob ;
		
		@FindBy(css = "div.oxd-form-row+div>div>div+div>textarea.oxd-textarea")
		private static WebElement jobDescription;
		
		@FindBy(css = "div.orangehrm-horizontal-padding>span")
		private static WebElement recordFound;
		
		@FindBy(css = "span.oxd-input-group__message")
		private static WebElement errorMsgMaxLength ;
		
		@FindBy(css = "div.oxd-file-button")
		private static WebElement browse;
		
		@FindBy(css = "input.oxd-file-input")
		private static WebElement filePathBrowseButton;
		
		public void clickOnAdmin() {
			WaitFor.visibilityOfElement(admin);
			Keywords.clickOnWebElement(admin);
		}
		
		public void clickOnJob() {
			WaitFor.visibilityOfElement(clickJob);
			Keywords.clickOnWebElement(clickJob);
		}
		
		public void clickOnJobTitle() {
			WaitFor.visibilityOfElement(jobTitle);
			Keywords.clickOnWebElement(jobTitle);
		}
		
		public void clickOnAdd() {
			WaitFor.visibilityOfElement(add);
			Keywords.clickOnWebElement(add);
		}
		
		public void enterTitle(String title) {
			WaitFor.visibilityOfElement(titleBlank);
			Keywords.clickOnWebElement(titleBlank);
			Keywords.enterTextTo(titleBlank, title);
		}
		
		public void enterJobDescription(String Description) {
			WaitFor.visibilityOfElement(jobDescription);
			Keywords.clickOnWebElement(jobDescription);
			Keywords.enterTextTo(jobDescription, Description);
		}
		
		public void clickSaveJobTitle() {
			WaitFor.visibilityOfElement(saveButton);
			Keywords.clickOnWebElement(saveButton);
		}
		
		public String checkErrorMsg() {
			WaitFor.visibilityOfElement(errorMsg);
			return Keywords.getMessage(errorMsg);
		}
		
		public boolean checkRecordFound() {
			WaitFor.visibilityOfElement(recordFound);
			return Keywords.elementIsDisplayed(recordFound);
		}
		
		public String checkMaxLength() {
			WaitFor.visibilityOfElement(errorMsgMaxLength);
			return Keywords.getMessage(errorMsgMaxLength);
		}
		
		public void clickBrowseImage() {
			WaitFor.visibilityOfElement(browse);
			Keywords.clickOnWebElement(browse);
			Keywords.enterTextTo(filePathBrowseButton, "D:\\YogitaTesting\\Javalink.txt");
		}
		
		public void clickBrowseImg() {
			WaitFor.visibilityOfElement(browse);
			Keywords.clickOnWebElement(browse);
			Keywords.enterTextTo(filePathBrowseButton, "C:\\Users\\DELL\\Desktop\\WhatsApp Image 2025-01-03 at 09.41.45_e9e54b26.jpg");
		}
}
