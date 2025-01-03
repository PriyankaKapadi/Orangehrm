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

	@When("User login successfully,click Dropdown.")
	public static void loginSuccessClickDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters Current Password less than 7 characters.")
	public static void enterPasswordlessThanSevenChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("sasa1");
	}

	@And("User enter Password,Confirm Password,click on Save.")
	public static void enterPasswordAndSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should show message as 'Current Password is Incorrect'.")
	public static void getErrorMsgForCurrentPasswordForLessSevenChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login successfully and click the profile Dropdown.")
	public static void loginAndClickDropdown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters valid Current Password along with spaces.")
	public static void enterPasswordAlongWithSpaces() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("a dmin123");
	}

	@And("User enter Password,Confirm Password & clicks on Save.")
	public static void enterPasswordsAndClicksOnSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka12");
		up.enterConfirmPassword("priyanka12");
		up.clickOnSaveButton();
	}

	@Then("It should display msg as 'Current Password is Incorrect'.")
	public static void getErrorMsgForValidCurrentPasswordAlongWithSpaces() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForInavalidCurrentPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForCurrentPassword(),
				"Application should show error message as 'Current Password is Incorrect'");
	}

	@When("User login successfully and clicks the profile DropDown")
	public static void loginForNewPassAndClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters current Password & New Password as alphanumeric.")
	public static void enterCurrentPasswordAndNewPasswordAsAlphanumeric() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("admin@123");
	}

	@And("User enters Confirm Password & clicks on Save.")
	public static void enterConfirmPasswordsAndClicksOnSave() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("admin@123");
		up.clickOnSaveButton();
	}

	@Then("It should update password successfully.")
	public static void updateNewPasswordSuccessfully() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actual_msg = up.getSuccessMessage();
		String expected_msg = readPropertyFile.getSuccessMessageForSave();
		Assert.assertEquals(actual_msg, expected_msg, "Password not updated successfully");
	}

	@When("User login successfully, clicks the profile DropDown")
	public static void loginForNewPassLessThanSevenAndClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters current Password & New Password as alphanumeric less than 7 characters")
	public static void enterCurrentPasswordAndNewPasswordAsLessThanSeven() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("ab@32");
	}

	@And("User enters Confirm Password & click on Save")
	public static void enterConfirmPasswordsAndClickOnSaveButton() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("ab@32");
		up.clickOnSaveButton();
	}

	@Then("It should display msg as 'Password must be alphanumeric with atleast seven characters'.")
	public static void getErrorMsgForNewPasswordForLessSevenChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login successfully, clicks the profile DropDown for New Password")
	public static void loginForNewPassNumbersAndClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters current Password & New Password as numbers more than 7 characters")
	public static void enterCurrentPasswordAndNewPasswordAsNumbers() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("12345678");
	}

	@And("User enters Confirm Password & click on Save button for New Password")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForNewPasswordAsNumbers() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("12345678");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg as 'Password must be alphanumeric with atleast seven characters'.")
	public static void getErrorMsgForNewPasswordForNumbers() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login successfully, clicks the profile DropDown for New Password as Special Characters")
	public static void loginForNewPassSpCharAndClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters current Password & New Password as Special Characters more than 7 characters")
	public static void enterCurrentPasswordAndNewPasswordAsSpChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("@#$$@!!#");
	}

	@And("User enters Confirm Password & click on Save button for New Password Special Characters")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForNewPasswordAsSpChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("@#$$@!!#");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg as 'Password must be alphanumeric with atleast seven characters' for Special Characters.")
	public static void getErrorMsgForNewPasswordForSpChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login successfully, clicks the profile DropDown for New Password as Characters")
	public static void loginForNewPassCharAndClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("User enters current Password & New Password as Characters more than 7 characters")
	public static void enterCurrentPasswordAndNewPasswordAsChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("adminchar");
	}

	@And("User enters Confirm Password & click on Save button for New Password Characters")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForNewPasswordAsChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("adminchar");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg as 'Password must be alphanumeric with atleast seven characters' for Characters")
	public static void getErrorMsgForNewPasswordForChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login & click DropDown for New Password for Combination of SC")
	public static void loginForNewPassCombinationSpCharAndCharClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password & New Password as combination of Sp characters & characters")
	public static void enterNewPasswordAsCombinationOfSpCharAndChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("char@#@@");
	}

	@And("Enter Confirm Password & click on Save button for New Password Characters & Sp characters")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForComOfSpCharAndChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("char@#@@");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg as 'Your password must contain minimum 1 number' for combination.")
	public static void getErrorMsgForNewPasswordForComOfSpCharAndChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageNewPassword(),
				"Application should show error message as 'Your password must contain minimum 1 number'");
	}

	@When("User login & click DropDown for New Password for space")
	public static void loginForNewPasswordAsSpaceClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password & New Password as space")
	public static void enterNewPasswordAsSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("  ");
	}

	@And("Enter Confirm Password & click on Save button for New Password space")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("  ");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg as 'Password must be alphanumeric with atleast seven characters' for space.")
	public static void getErrorMsgForNewPasswordForSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login & click DropDown for New Password for blank")
	public static void loginForNewPasswordAsBlankClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password & New Password as blank")
	public static void enterNewPasswordAsBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("");
	}

	@And("Enter Confirm Password & click on Save button for New Password blank")
	public static void enterConfirmPasswordsAndClickOnSaveButtonForBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg for blank password as 'Password must be alphanumeric with atleast seven characters'.")
	public static void getErrorMsgForNewPasswordForBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMessageForNewPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show error message as 'Password must be alphanumeric with atleast seven characters'");
	}

	@When("User login & click DropDown for Confirm Password as blank")
	public static void loginForConfirmPasswordAsBlankClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as blank and click on Save")
	public static void enterConfirmPasswordAsBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@123");
		up.enterConfirmPassword("");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg confirm password as 'Passwords do not match'for blank.")
	public static void getErrorMsgForConfirmPasswordForBlank() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForConfirmPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageConfirmPassword(),
				"Application should show error message as 'Passwords do not match'");
	}

	@When("User login & click DropDown for Confirm Password as space")
	public static void loginForConfirmPasswordAsSpaceClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as space and click on Save")
	public static void enterConfirmPasswordAsSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@123");
		up.enterConfirmPassword("  ");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg confirm password as 'Passwords do not match'for space.")
	public static void getErrorMsgForConfirmPasswordForSpace() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForConfirmPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageConfirmPassword(),
				"Application should show error message as 'Passwords do not match'");
	}
	
	@When("User login & click DropDown for Confirm Password as numbers")
	public static void loginForConfirmPasswordAsNumbersClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as numbers and click on Save")
	public static void enterConfirmPasswordAsNumbers() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@123");
		up.enterConfirmPassword("23213124");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg confirm password as 'Passwords do not match'for numbers.")
	public static void getErrorMsgForConfirmPasswordForNumbers() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForConfirmPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageConfirmPassword(),
				"Application should show error message as 'Passwords do not match'");
	}
	
	@When("User login & click DropDown for Confirm Password as characters")
	public static void loginForConfirmPasswordAsCharClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as characters and click on Save")
	public static void enterConfirmPasswordAsChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@123");
		up.enterConfirmPassword("priyanka");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg confirm password as 'Passwords do not match'for characters.")
	public static void getErrorMsgForConfirmPasswordForChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForConfirmPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageConfirmPassword(),
				"Application should show error message as 'Passwords do not match'");
	}
	
	@When("User login & click DropDown for Confirm Password as Sp characters")
	public static void loginForConfirmPasswordAsSpCharClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as Sp characters and click on Save")
	public static void enterConfirmPasswordAsSpChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@123");
		up.enterConfirmPassword("@#@#");
		up.clickOnSaveButton();
	}

	@Then("It should display error msg confirm password as 'Passwords do not match'for Sp characters.")
	public static void getErrorMsgForConfirmPasswordForSpChar() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actualMsg = up.getErrorMsgForConfirmPassword();
		Assert.assertEquals(actualMsg, readPropertyFile.getErrorMessageConfirmPassword(),
				"Application should show error message as 'Passwords do not match'");
	}
	
	@When("User login & click DropDown for Confirm Password as alphanumeric")
	public static void loginForConfirmPasswordAsAlphanumericClicksDropDown() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password as alphanumeric and click on Save")
	public static void enterConfirmPasswordAsAlphanumeric() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@120");
		up.enterConfirmPassword("priyanka@120");
		up.clickOnSaveButton();
	}
	
	@Then("It should update password successfully for alphanumeric confirm password")
	public static void getSuccessMsgForConfirmPasswordForAlphanumeric() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		String actual_msg = up.getSuccessMessage();
		String expected_msg = readPropertyFile.getSuccessMessageForSave();
		Assert.assertEquals(actual_msg, expected_msg, "Password not updated successfully");
	}
	
	@When("User login & click DropDown for cancel button")
	public static void loginAndClicksDropDownForCancel() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}

	@And("Enter current Password,New Password,confirm Password")
	public static void enterAllPasswords() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.enterNewPassword("priyanka@120");
		up.enterConfirmPassword("priyanka@120");
	}
	
	@And("click on cancel button")
	public static void clickOnCancelButton() {
		UpdatePasswordPage up= new UpdatePasswordPage();
		up.clickOnCancelButton();
	}
	
	@Then("It should redirected to dashboard")
	public static void redirectDashboard() {
		HomePage hp=new HomePage();
		boolean elementAvailable=hp.checkForWebElementPresence();
		Assert.assertTrue(elementAvailable, "Cancel button is not working properly");
	}
	
	@When("User login & click DropDown for cancel of update password")
	public static void loginAndClicksDropDownForcancel() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}
	
	@And("Enter current Password and click on cancel button")
	public static void enterCurrentPasswordAndClickCancel() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterCurrentPassword("admin123");
		up.clickOnCancelButton();
	}
	
	@Then("It should go to dashboard")
	public static void redirectedDashboard() {
		HomePage hp=new HomePage();
		boolean elementAvailable=hp.checkForWebElementPresence();
		Assert.assertTrue(elementAvailable, "Cancel button is not working properly");
	}
	
	@When("User login and click DropDown for cancel option.")
	public static void userLoginForcancelOption() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}
	
	@And("Enter Password and click on cancel button")
	public static void enterPasswordAndClickCancel() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterNewPassword("priyanka@120");
		up.clickOnCancelButton();
	}
	
	@Then("It should redirect to dashboard.")
	public static void redirectedToHome() {
		HomePage hp=new HomePage();
		boolean elementAvailable=hp.checkForWebElementPresence();
		Assert.assertTrue(elementAvailable, "Cancel button is not working properly");
	}
	
	@When("login & click DropDown for cancel button")
	public static void userLoginClicksDropDownForcancelButton() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
		hp.selectOptionFromList();
	}
	
	@And("Enter confirm Password and click on cancel button")
	public static void enterConfirmPasswordAndClickCancel() {
		UpdatePasswordPage up = new UpdatePasswordPage();
		up.enterConfirmPassword("priyanka@120");
		up.clickOnCancelButton();
	}
	
	@Then("It should redirected to dashboard page")
	public static void redirectToDashboardPage() {
		HomePage hp=new HomePage();
		boolean elementAvailable=hp.checkForWebElementPresence();
		Assert.assertTrue(elementAvailable, "Cancel button is not working properly");
	}
}
