package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyUserEntersInvalidUserName {

	@When("User enters invalid username and valid password")
	public static void enterInvalidUserNameAndValidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterInvalidUsername();
		lp.enterValidPassword();
	}

	@And("Click on Login button for invalid credentials")
	public static void clickLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message as 'Invalid credentials'")
	public static void checkErrorMessageForInvalidCredentials() {
		LoginPage lp=new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}
}
