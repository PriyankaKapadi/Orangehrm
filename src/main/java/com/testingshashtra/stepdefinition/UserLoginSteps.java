package com.testingshashtra.stepdefinition;

import org.testng.Assert;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginSteps {
	static String homepageUrl = "";
	static String currentUrl = "";

	@When("User enters valid username and password")
	public void enterUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
	}

	@And("Click on Login button")
	public void clickOnLogin() {
		LoginPage lp = new LoginPage();
		homepageUrl = lp.clickOnLogin();
	}

	@Then("User should successfully Login to orangehrm")
	public void successfulLogin() {
		LoginPage lp = new LoginPage();
		currentUrl = lp.switchToHomePage();
	}

	@When("User enters blank username and password")
	public void enterBlankUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("");
		lp.enterPassword("");
	}

	@And("Click on Login for invalid credentials")
	public void clickLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message 'Invalid credentials'")
	public void showErrorMessage() {
		LoginPage lp = new LoginPage();
		String actual_error_msg = lp.getErrorMessage();
		String exp_error_msg = "Required";
		Assert.assertEquals(actual_error_msg, exp_error_msg,
				"Application shows error message as 'Required' instead it should show error message as 'Please enter valid credentials'");
	}

	static String errormessage = "Invalid credentials";

	@When("User enters valid username and invalid password")
	public void enterInvalidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("abcd");
	}

	@And("Click on Login Button for invalid credentials")
	public void clickOnLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show an error message as 'Invalid credentials'")
	public void checkForErrorMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}

	@When("User enters invalid username and valid password")
	public void enterInvalidUserNameAndValidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("abcd");
		lp.enterPassword("admin123");
	}

	@And("Click on Login button for invalid credentials")
	public void clickLoginButtonforInvalidCredentials() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message as 'Invalid credentials'")
	public void checkErrorMessageForInvalidCredentials() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}

}
