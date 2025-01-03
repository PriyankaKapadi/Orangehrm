package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.AddSkillPage;
import com.testingshashtra.pages.HomePage;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.pages.SkillsPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QualificationsSteps {

	@When("User login successfully for qualification dropdown")
	public static void userLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}

	@And("select Admin option on Home page")
	public static void userSelectAdminOption() {
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("user click on qualification dropdown menu on Home page")
	public static void userClickOnQualificationDropdownforskills() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option")
	public static void userClickOnSkills() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@Then("It should redirect to Skill page")
	public static void userRedirectToSkillsPage() {
		SkillsPage sp = new SkillsPage();
		boolean addSkillButtonStatus = sp.isAvailableAddButton();
		Assert.assertTrue(addSkillButtonStatus, "Add Button is not available");
	}

	@When("User login successfully and select Admin Option")
	public static void userClickOnAdmin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for add skill page")
	public static void userClickOnQualificationDropdown() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for add skill page")
	public static void userClickOnSkillDropdownsForAddSkill() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for add skill page")
	public static void userClickOnaddButton() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@Then("It should redirect to add skill page")
	public static void userRedirectToAddSkillsPage() {
		AddSkillPage asp = new AddSkillPage();
		boolean nameTextFieldStatus = asp.isNameTextFieldAvailable();
		Assert.assertTrue(nameTextFieldStatus, "User not redirect to Add Skill Page");
	}

	@When("User login successfully and select Admin Option for blank name")
	public static void userClickOnAdminOption() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as blank")
	public static void userClickOnQualificationDropdownForNameFieldBlank() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as blank")
	public static void userClickOnSkillDropdownsForNameFieldBlank() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as blank")
	public static void userClickOnaddButtonForNameFieldBlank() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as blank")
	public static void userKeepNameFieldBlank() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("");
	}

	@And("click on Save button")
	public static void clickOnSaveButton() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill'")
	public static void verifyErrorMessage() {
		AddSkillPage asp = new AddSkillPage();
		String actualErrorMsg = asp.getErrorMessageNameField();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin Option for name as space")
	public static void userClickOnAdminAsSpaceOnly() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as space only")
	public static void userClickOnSkillDropdownsForNameFieldAsSpaceOnly() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as space only")
	public static void userClickOnSkillForNameFieldAsSpaceOnly() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as space only")
	public static void userClickOnaddButtonForNameFieldAsSpaceOnly() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as space only")
	public static void userKeepNameFieldAsSpaceOnly() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill(" ");
	}

	@And("click on Save button for space only")
	public static void clickOnSaveButtonForSpace() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for space only")
	public static void verifyErrorMessageForSpaceOnly() {
		AddSkillPage asp = new AddSkillPage();
		String actualErrorMsg = asp.getErrorMessageNameField();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin Option for sp char")
	public static void userClickOnAdminForNameFieldAsSpOnly() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as sp char only")
	public static void userClickOnQualificationDropdownForNameFieldAsSpOnly() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as sp char only")
	public static void userClickOnSkillDropdownsForNameFieldAsSpOnly() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as sp char only")
	public static void userClickOnaddButtonForNameFieldAsSpOnly() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as sp char only")
	public static void userKeepNameFieldAsSpOnly() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("%$#@");
	}

	@And("click on Save button for sp char only")
	public static void clickOnSaveButtonForNameFieldAsSpOnly() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for sp char only")
	public static void verifyErrorMessageForNameFieldAsSpOnly() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getTextFromRecordFound();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin Option for number only")
	public static void userClickOnAdminForNameFieldAsNumber() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as numbers only")
	public static void userClickOnQualificationDropdownForNameFieldAsNumber() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as numbers only")
	public static void userClickOnSkillDropdownsForNameFieldAsNumber() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as numbers only")
	public static void userClickOnaddButtonForNameFieldAsNumber() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as numbers only")
	public static void userKeepNameFieldAsNumber() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("123456789");
	}

	@And("click on Save button for numbers only")
	public static void clickOnSaveButtonForNameFieldAsNumber() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for num")
	public static void verifyErrorMessageForNameFieldAsNumber() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getTextFromRecordFound();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin Option for character and number")
	public static void userClickOnAdminForNameFieldAsCombOfCharNum() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as combination of character and number")
	public static void userClickOnQualificationDropdownsForNameFieldAsCombOfCharNum() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as combination of character and number")
	public static void userClickOnSkillDropdownsForNameFieldAsCombOfCharNum() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as combination of character and number")
	public static void userClickOnaddButtonForNameFieldAsCombOfCharNum() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as combination of character and number")
	public static void userKeepNameFieldAsCombOfCharNum() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("123abc");
	}

	@And("click on Save button for combination of character and number")
	public static void clickOnSaveButtonForNameFieldAsCombOfCharNum() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for combination of character and number")
	public static void verifyErrorMessageForNameFieldAsAsCombOfCharNum() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getTextFromRecordFound();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin option for sp and char")
	public static void userClickOnAdminForNameFieldAsCombOfSpChar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as combination of sp and char")
	public static void userClickOnQualificationDropdownsForNameFieldAsCombOfSpChar() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as combination of sp and char")
	public static void userClickOnSkillDropdownsForNameFieldAsCombOfSpChar() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as combination of sp and char")
	public static void userClickOnaddButtonForNameFieldAsCombOfSpChar() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as combination of sp and char")
	public static void userKeepNameFieldAsCombOfSpChar() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("$%#abc");
	}

	@And("click on Save button for combination of sp and char")
	public static void clickOnSaveButtonForNameFieldAsCombOfSpChar() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for combination of sp and char")
	public static void verifyErrorMessageForNameFieldAsAsCombOfSpChar() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getTextFromRecordFound();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select admin for sp and num")
	public static void userClickOnAdminForNameFieldAsCombOfSpNum() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name field as combination of sp and num")
	public static void userClickOnQualificationDropdownsForNameFieldAsCombOfSpNum() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name field as combination of sp and num")
	public static void userClickOnSkillDropdownsForNameFieldAsCombOfSpNum() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name field as combination of sp and num")
	public static void userClickOnaddButtonForNameFieldAsCombOfSpNum() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name field as combination of sp and num")
	public static void userKeepNameFieldAsCombOfSpNum() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill("$%#123");
	}

	@And("click on Save button for combination of sp and num")
	public static void clickOnSaveButtonForNameFieldAsCombOfSpNum() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Please Enter The valid skill' for combination of sp and num")
	public static void verifyErrorMessageForNameFieldAsAsCombOfSpNum() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getTextFromRecordFound();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameField();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Please Enter The valid skill'");
	}

	@When("User login successfully and select Admin for max char")
	public static void userClickOnAdminForNameFieldAsMaxChar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
		HomePage hp = new HomePage();
		hp.clickOnAdmin();
	}

	@And("click on qualification dropdown menu for Name with max limit")
	public static void userClickOnQualificationDropdownsForNameFieldAsMaxChar() {
		HomePage hp = new HomePage();
		hp.clickQualificationsDropDownMenu();
	}

	@And("select Skills option for Name with max limit")
	public static void userClickOnSkillDropdownsForNameFieldAsMaxChar() {
		HomePage hp = new HomePage();
		hp.clickOnSkills();
	}

	@And("click on add button for Name with max limit")
	public static void userClickOnaddButtonForNameFieldAsMaxChar() {
		SkillsPage sp = new SkillsPage();
		sp.clickOnAddSkillButton();
	}

	@And("Keep Name with max limit")
	public static void userKeepNameFieldAsMaxChar() {
		AddSkillPage asp = new AddSkillPage();
		asp.enterNameInAddSkill(
				"hfdjfksdfsdfhskdfhksjdhfksdhfkshdfkshdfksdhfksdfhskdjfhskjdfhsdjkfhksjdfhksjdfhksdfhskdfdskfhksdfhkshfksdfhksfhksjhfhfhfhff");
	}

	@And("click on Save button for max limit")
	public static void clickOnSaveButtonForNameFieldAsMaxChar() {
		AddSkillPage asp = new AddSkillPage();
		asp.clickOnSaveButton();
	}

	@Then("It should show error message as 'Should not exceed 120 characters' for max limit")
	public static void verifyErrorMessageForNameFieldAsAsMaxChar() {
		AddSkillPage asp = new AddSkillPage();
		String actualMsg = asp.getErrorMessageNameField();
		String expectedErrorMsg = readPropertyFile.getErrorMessageNameFieldMaxChar();
		Assert.assertEquals(actualMsg, expectedErrorMsg,
				"Application should show error message as 'Should not exceed 120 characters'");
	}
}
