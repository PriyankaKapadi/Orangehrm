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
		HomePage hp = new HomePage();
		boolean checkForElement = hp.checkForWebElementPresence();
		Assert.assertTrue(checkForElement, "Web element is not present on page");
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
		up.enterCurrentPassword();
		up.enterNewPassword();
		up.enterConfirmPassword();
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

}
