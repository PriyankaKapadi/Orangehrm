package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.pages.ResetPasswordPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordSteps {

	@When("User click on forgot password link")
	public static void userClickOnForgotPassword() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}

	@Then("It should successfully redirected to reset password page of orangeHRM")
	public static void userRedirectToResetPasswordPage() {
		ResetPasswordPage rp = new ResetPasswordPage();
		boolean resetButtonStatus = rp.isAvailableResetPasswordButton();
		Assert.assertTrue(resetButtonStatus, "Application is not redirected to Reset Password Page");
	}

	@When("User click on Forgot password link")
	public static void userClickOnForgotPasswordOnOrangeHRM() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}

	@And("Enter blank username")
	public static void enterUserNameBlank() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("");
	}

	@And("click on Reset Password button")
	public static void clickOnReset() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show message as 'Please enter valid username'")
	public static void verifyErrorMessage() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actual=rp.getErrorMessage();
		String expected=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actual, expected,"Application should show error message as 'Please enter valid username'");
	}

}
