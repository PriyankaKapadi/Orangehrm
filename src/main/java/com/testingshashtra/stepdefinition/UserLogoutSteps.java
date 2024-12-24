package com.testingshashtra.stepdefinition;

import org.testng.Assert;
import com.testingshashtra.pages.HomePage;
import com.testingshashtra.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogoutSteps {
	@When("User enters valid username, password and click on login button")
	public static void enterValidCredentialsClickLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}

	@And("Click on user profile dropdown")
	public static void clickUserProfileDropdown() {
		HomePage hp = new HomePage();
		hp.clickDropDownMenu();
	}

	@And("Click on logout button")
	public static void clickLogoutButton() {
		HomePage hp = new HomePage();
		hp.clickLogoutButton();
	}

	@Then("It should successfully redirected to Login page of orangeHRM")
	public static void redirectToLoginPage() {
		HomePage hp = new HomePage();
		boolean status = hp.checkForPresenceOfUsername();
		Assert.assertTrue(status, "User is not able to logout");
	}

}
