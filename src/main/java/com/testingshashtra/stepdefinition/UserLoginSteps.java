package com.testingshashtra.stepdefinition;

import org.testng.Assert;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginSteps {
	static String homepageUrl = "";
	static String currentUrl = "";

	@When("User enters valid username and password")
	public void enterUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
	}

	@And("Click on Login button")
	public void clickOnLogin() {
		LoginPage lp = new LoginPage();
		homepageUrl = lp.clickOnLogin();
	}

	@Then("User should successfully Login to orangehrm")
	public void successfulLogin() {
		LoginPage lp = new LoginPage();
		currentUrl = lp.switchToHomePage();
	}

	@When("User enters blank username and password")
	public void enterBlankUsernamePassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("");
		lp.enterPassword("");
	}

	@And("Click on Login for invalid credentials")
	public void clickLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message 'Invalid credentials'")
	public void showErrorMessage() {
		LoginPage lp = new LoginPage();
		String actual_error_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(actual_error_msg, readPropertyFile.getErrorMessage(),
				"Application shows error message as 'Required' instead it should show error message as 'Please enter valid credentials'");
	}

	static String errormessage = "Invalid credentials";

	@When("User enters valid username and invalid password")
	public void enterInvalidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("abcd");
	}

	@And("Click on Login Button for invalid credentials")
	public void clickOnLoginButton() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show an error message as 'Invalid credentials'")
	public void checkForErrorMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}

	@When("User enters invalid username and valid password")
	public void enterInvalidUserNameAndValidPassword() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("abcd");
		lp.enterPassword("admin123");
	}

	@And("Click on Login button for invalid credentials")
	public void clickLoginButtonforInvalidCredentials() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message as 'Invalid credentials'")
	public void checkErrorMessageForInvalidCredentials() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application shows error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}
	
	@When("User enters invalid username and invalid password")
	public void enterInvalidUsernmPsw() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("abcddhs");
		lp.enterPassword("admin6872");
	}
	
	@And("Click on Login For invalid credentials")
	public void clickLoginInvalidCredUsernmPsw() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application display error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'")
	public void checkErrorMsgInvalidCredUsernmPsw() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application display error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}
	
	@When("User enters blank username and valid password")
	public void enterBlankUsernmValidPsw() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("");
		lp.enterPassword("admin123");
	}
	
	@And("Click on login button For invalid credentials")
	public void clickLoginBlankUsernmValPsw() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application display an error message as 'Required' instead it should show error message as 'Please enter valid Creadentials'")
	public void checkErrorMessageBlankUsernmValPsw() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application display  an error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}
	
	@When("User enters valid username and blank password")
	public void enterValidUsernmBlankPsw() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("");
	}
	
	@And("Click on login Button For invalid credential")
	public void clickLoginValidUsernmBlankPsw() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application display error message as 'Required' instead it should show error message as 'Please enter valid Creadentials'")
	public void checkErrorMessageValidUsernmBlankPsw() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application display an error message as 'Required' instead it should show error message as 'Please enter valid Creadentials'");
	}
	
	@When("User enters valid username and password as less than 7 character")
	public void enterPswLessThanEightChar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("Yogita");
	}
	
	@And("Click on login Button For invalid credentials")
		public void clickOnLoginB() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
		}
	
	@Then("Application should show Error Message as 'Password must contain at least 7 characters'")
	public void checkErrorMsgPwdLessThanEight() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show Error Message as 'Password must contain at least 7 characters'");
	}
	
	@When("User enters valid username and password as greater than 7 character")
	public void enterPswGreaterThanEightChar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("Yogita123");
	}
	
	@And("Click On login button For invalid credentials")
	public void clickOnLoginButtonInvalidcred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswGreaterthanEightChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	
	@When("User enters valid username and password of 7 character")
	public void EnterValUsernmPswSevenChar()
	{
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("Yogita12");
		
	}
	
	@And("Click On login Button For invalid credential")
	public void clickLoginButtonInvalCred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswSevenChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	
	@When("User enters valid username and password without uppercase letter")
	public void enterValUsernmPswLowerCase() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("yogitaas");
	}
	
	@And("Click On login button For Invalid credentials")
	public void clickLoginButtonLowerPsw() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application Should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswLowerChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application Should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	
	@When("User enters valid username and password without lowercase letter")
	public void enterValUsernmPswupperCase() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("ADMINAD");
	}
	
	@And("Click on login button For Invalid credentials")
	public void clickLoginButtonUpperCasePsw() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswUpperChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	
	@When("User enters valid username and password as number")
	public void enterValUsernmPswnum() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("1234567");
	}
	
	@And("Click on login button For invalid Credentials")
	public void clickLoginButtonPswNum() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should display an error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswNum() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should display an error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	
	@When("User enters valid username and password as special character")
	public void enterValUsernmPswSpecialChar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("@#$%&");
	}
	
	@And("Click on login button For Invalid Credentials")
	public void clickLoginButtonPswSpecialChar() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should display an Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswSpecialChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessage();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessageForAlphanumericNewPassword(),
				"Application should display an error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}

}
