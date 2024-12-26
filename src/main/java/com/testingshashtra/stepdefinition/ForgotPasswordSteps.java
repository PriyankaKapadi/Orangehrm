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
	
	@When("User click on Forgot password link of orangeHRM")
	public static void userClickOnForgotPasswordOnOrange() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter valid username")
	public static void enterValidUserName() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("Admin");
	}
	
	@And("click on Reset Password button on Reset password page")
	public static void clickOnResetButton() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("Reset Password link sent successfully'")
	public static void verifyResetPasswordLinkSentMessage() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getsuccessMsgResetLinkSent();
		Assert.assertEquals(actualMsg, expectedMsg,"Reset Password link sent successfully");
	}
	
}
