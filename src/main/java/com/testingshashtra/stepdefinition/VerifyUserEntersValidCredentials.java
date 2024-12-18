package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.base.Keywords;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyUserEntersValidCredentials {
	static String homepageUrl = "";
	static String currentUrl = "";

	@When("User enters valid username and password")
	public static void enterUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterInvalidUsername();
		lp.enterValidPassword();
	}

	@And("Click on Login button")
	public static void clickOnLogin() {
		LoginPage lp = new LoginPage();
		homepageUrl = lp.clickOnLogin();
	}

	@Then("User should successfully Login to orangehrm")
	public static void successfulLogin() {
		LoginPage lp = new LoginPage();
		currentUrl = lp.switchToHomePage();
		Assert.assertEquals(homepageUrl, currentUrl, "Current Url and Home Page Url do not match");
	}

}
