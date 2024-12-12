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
	static String currentUrl = "";

	@Given("Open browser and launch url of orange hrm")
	public static void openBrowserAndLaunchUrl() {
		Keywords.openBrowser(readPropertyFile.getBrowserName());
		Keywords.launchUrl(readPropertyFile.getLaunchUrl("qa"));
	}

	@When("User enters valid username and password")
	public static void enterUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
	}

	@And("Click on Login button")
	public static void clickOnLogin() {
		LoginPage lp = new LoginPage();
		currentUrl = lp.clickOnLogin();
	}

	@Then("User should successfully Login to orangehrm")
	public static void successfulLogin() {
		Assert.assertEquals(true, currentUrl, "User logged in successfully");
	}
}
