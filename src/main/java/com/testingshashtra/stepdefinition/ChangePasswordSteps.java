package com.testingshashtra.stepdefinition;

import org.testng.Assert;
import com.testingshashtra.pages.HomePage;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.pages.UpdatePasswordPage;
import com.testingshashtra.utils.readPropertyFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps {
	@When("User login successfully")
	public static void enterValidCredentials() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}

	@And("User clicks on profile dropdown list")
	public static void ClickProfileDropDown() {
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
	}

	@And("Select change password options")
	public static void selectChangePasswordOption() {
		HomePage hp = new HomePage();
		hp.selectOptionFromList();
	}

	@And("Enter valid Current Password,Password and Confirm Password")
	public static void enterValidPasswords() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
	}

	@And("Click on Save Button")
	public static void clickOnSaveButton() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.clickOnSaveButton();
	}

	@Then("It should update password successfully")
	public static void updatePasswordSuccessfully() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actual_msg = up.getSuccessMessage();
		String expected_msg = readPropertyFile.getSuccessMessageForSave();
		Assert.assertEquals(actual_msg, expected_msg, "Password not updated successfully");
	}

	@When("User login successfully & clicks on profile dropdown list")
	public static void userLoginClicksProfileDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as blank")
	public static void enterCurrentPasswordAsBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("");
	}

	@And("Enter Password,Confirm Password & click on Save button")
	public static void enterNewAndConfirmPassword() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should show error message as 'Current Password is Incorrect'")
	public static void getErrorMessage() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgBlankPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login successfully & clicks on profile dropdown")
	public static void userLoginClicksDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as numbers only")
	public static void enterCurrentPasswordAsNumber() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("454565");
	}

	@And("Enter Password,Confirm Password & click on Save")
	public static void enterNewAndConfirmPasswords() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display error message as 'Current Password is Incorrect'")
	public static void getErrorMessageForCurrentPassword() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login successfully & clicks profile dropdown")
	public static void userLoginAndClickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as characters only")
	public static void enterPasswordAsChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("abcdefg");
	}

	@And("Enter Password,Confirm Password & click on Save Button")
	public static void enterPasswords() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display error message 'Current Password is Incorrect'")
	public static void getErrorMsgForCurrentPassword() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login & clicks profile dropdown")
	public static void userLoginClickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as special characters only")
	public static void enterPasswordAsSpecialChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("@#$$^%$##");
	}

	@And("Enter Password,Confirm Password & click Save Button")
	public static void enterPasswordsClickSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display error message 'Current Password is Incorrect'.")
	public static void getErrorMsgForCurrentPasswordForSpecialChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login and clicks profile dropdown")
	public static void userLoginAndclickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as space only")
	public static void enterPasswordAsSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("  ");
	}

	@And("Enter Password,Confirm Password & click Save button.")
	public static void enterPasswordsAndClickSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display error message'Current Password is Incorrect'.")
	public static void getErrorMsgForCurrentPasswordForSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgBlankPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login and click profile dropdown.")
	public static void userLoginclickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as alphanumeric")
	public static void enterPasswordAsAlphanumeric() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("Priyanka@123");
	}

	@And("Enter Password,Confirm Password,click Save.")
	public static void enterPasswordsAndclickSaveButton() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("Application should update password successfully.")
	public static void getMessageForPasswordUpdatedSuccessfully() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actual_msg = up.getErrorMsgForInavalidCurrentPassword();
		String expected_msg = readPropertyFile.getSuccessMessageForSave();
		Assert.assertEquals(actual_msg, expected_msg, "Password must be alphanumeric");
	}

	@When("User login successfully & click Dropdown.")
	public static void loginClickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as numbers & special characters.")
	public static void enterPasswordAsNumbersAndSpecialChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("1212##$@");
	}

	@And("User enter Password,Confirm Password,click Save")
	public static void enterPasswordsAndSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg 'Current Password is Incorrect'.")
	public static void getErrorMsgForCurrentPasswordForNoAndSpecialChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}
	
	@When("User login & click Dropdown.")
	public static void loginAndclickDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password as numbers & characters.")
	public static void enterPasswordAsNumbersAndChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("priyanka123");
	}

	@And("User enter Password,Confirm Password,click on save.")
	public static void enterPasswordSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should show error msg as 'Current Password is Incorrect'.")
	public static void getErrorMsgForCurrentPasswordForNoAndChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}
}
