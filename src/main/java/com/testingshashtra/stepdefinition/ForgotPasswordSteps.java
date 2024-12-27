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
	
	@Then("It should show message as 'Reset Password link sent successfully'")
	public static void verifyResetPasswordLinkSentMessage() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getsuccessMsgResetLinkSent();
		Assert.assertEquals(actualMsg, expectedMsg,"Reset Password link sent successfully");
	}
	
	@When("User click on Forgot password link of orangeHRM application")
	public static void userClickOnForgotPasswordlink() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username")
	public static void enterInalidUserName() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("abc");
	}
	
	@And("click on Reset Password button on Reset password")
	public static void clickOnResetPswdButton() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username'")
	public static void verifyInvalidUsernameErrorMessage() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for numbers only")
	public static void userClickOnForgotPasswordLinkForNumbersOnly() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as numbers only")
	public static void enterInalidUserNameForNumbersOnly() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("171568");
	}
	
	@And("click on Reset Password button for numbers only")
	public static void clickOnResetPswdButtonForNumbersOnly() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' for numbers only")
	public static void verifyInvalidUsernameErrorMessageForNumbersOnly() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for Sp character")
	public static void userClickOnForgotPasswordLinkForSp() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as Sp character")
	public static void enterInalidUserNameForSp() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("@#$%*");
	}
	
	@And("click on Reset Password button for Sp character")
	public static void clickOnResetPswdButtonForSp() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' Sp character")
	public static void verifyInvalidUsernameErrorMessageForSp() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for comb of Sp and no")
	public static void userClickOnForgotPasswordLinkForSPAndNo() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as Sp and no")
	public static void enterInalidUserNameForSPAndNo() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("@#$1567");
	}
	
	@And("click on Reset Password button for Sp and no")
	public static void clickOnResetPswdButtonForSPAndNo() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' for Sp and no")
	public static void verifyInvalidUsernameErrorMessageForSPAndNo() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for comb of Sp and char")
	public static void userClickOnForgotPasswordLinkForSPAndChar() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as Sp and char")
	public static void enterInalidUserNameForSPAndChar() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("@#$Rupesh");
	}
	
	@And("click on Reset Password button for Sp and char")
	public static void clickOnResetPswdButtonForSPAndChar() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' for Sp and char")
	public static void verifyInvalidUsernameErrorMessageForSPAndChar() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for comb of no and char")
	public static void userClickOnForgotPasswordLinkForNoAndChar() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as no and char")
	public static void enterInalidUserNameForNoAndChar() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("Rupesh12456");
	}
	
	@And("click on Reset Password button for no and char")
	public static void clickOnResetPswdButtonForNoAndChar() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' for no and char")
	public static void verifyInvalidUsernameErrorMessageForNoAndChar() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getLinkSentMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
	
	@When("User click on Forgot password for Space Only")
	public static void userClickOnForgotPasswordLinkForSpace() {
		LoginPage lp = new LoginPage();
		lp.clickOnForgotPasswordLink();
	}
	
	@And("Enter Invalid username as Space Only")
	public static void enterInalidUserNameForSpace() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.enterUsername("  ");
	}
	
	@And("click on Reset Password button for Space Only")
	public static void clickOnResetPswdButtonForSpace() {
		ResetPasswordPage rp = new ResetPasswordPage();
		rp.clickOnResetPasswordButton();
	}
	
	@Then("It should show error message as 'Please enter valid username' for Space Only")
	public static void verifyInvalidUsernameErrorMessageForSpace() {
		ResetPasswordPage rp=new ResetPasswordPage();
		String actualMsg=rp.getErrorMessage();
		String expectedMsg=readPropertyFile.getErrorMessageUsername();
		Assert.assertEquals(actualMsg, expectedMsg,"It does not display error message as'Please enter valid username'");
	}
}
