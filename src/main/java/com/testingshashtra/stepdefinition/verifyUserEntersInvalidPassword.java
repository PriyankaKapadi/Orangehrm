package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifyUserEntersInvalidPassword {
	
	static String errormessage="Invalid credentials";
	
	@When("User enters valid username and invalid password")
	public static void enterInvalidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterValidUsername();
		lp.enterInvalidPassword();
	}

	@And("Click on Login Button for invalid credentials")
	public static void clickOnLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should show an error message as 'Invalid credentials'")
	public static void checkForErrorMessage() {
		LoginPage lp=new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}
}
