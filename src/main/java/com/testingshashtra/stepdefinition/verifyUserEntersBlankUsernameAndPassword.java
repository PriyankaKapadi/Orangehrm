package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifyUserEntersBlankUsernameAndPassword {

	@When("User enters blank username and password")
	public static void enterBlankUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterBlankUsername();
		lp.enterBlankPassword();
	}

	@And("Click on Login for invalid credentials")
	public static void clickLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should show error message 'Invalid credentials'")
	public static void showErrorMessage() {
		LoginPage lp= new LoginPage();
		String actual_error_msg=lp.getErrorMessage();
		String exp_error_msg="Required";
		Assert.assertEquals(actual_error_msg, exp_error_msg,"Application shows error message as 'Required' instead it should show error message as 'Please enter valid credentials'");
	}
}
