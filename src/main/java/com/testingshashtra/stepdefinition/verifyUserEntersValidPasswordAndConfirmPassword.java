package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.HomePage;
import com.testingshashtra.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class verifyUserEntersValidPasswordAndConfirmPassword {
	@When("User login successfully")
	public static void enterValidCredentials() {
		LoginPage lp=new LoginPage();
		lp.enterValidUsername();
		lp.enterValidPassword();
		lp.clickOnLogin();
		HomePage hp=new HomePage();
		boolean checkForElement=hp.checkForWebElementPresence();
		Assert.assertTrue(checkForElement,"Web element is not present on page");
	}
	
	@And("User clicks on profile dropdown list")
	public static void ClickProfileDropDown() {
		HomePage hp= new HomePage();
		hp.clickDropDownMenu();
	}
	
	@And("Select change password options")
	public static void selectChangePasswordOption() {
		HomePage hp=new HomePage();
		hp.selectOptionFromList();
	}


}
