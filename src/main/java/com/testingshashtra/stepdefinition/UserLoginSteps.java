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
		String exp_error_msg = "Required";
		Assert.assertEquals(actual_error_msg, exp_error_msg,
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
				"Application display  an error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'");
	}

	@When("User enters blank username")
	public void enterBlankUsername() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("");
	}

	@And("Click on Login for invalid credential")
	public void clickLogin() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();

	}

	@Then("Application should show Error message 'Invalid credential'")
	public void chkErrorMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show Error message 'Invalid credential'");
	}

	@When("User enters username as space")
	public void enterUsernameSpace() {
		LoginPage lp = new LoginPage();
		lp.enterUsername(" ");
	}

	@And("Click on login for invalid credential")
	public void clickLoginInvalidCred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error Message 'Invalid credential'")
	public void chkErrMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show error Message 'Invalid credential'");
	}

	@When("User enters username as number")
	public void enterUsernameNumber() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("12345678");
	}
	
	@And("Click On login for invalid credentials")
	public void clickOnLoginInvalidcredential() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	@Then("Application should display error Message 'Invalid credential'")
	public void checkErrorMsgInvalidCred() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should display error Message 'Invalid credential'");
		
	}
	
	@When("User enters username as alphanumeric")
	public void enterUsernameAlphaNumeric() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("Abdh1234");
	}

	@And("Click on login for Invalid credential")
	public void clickLoginInvalidcred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show Error Message 'Invalid credential'")
	public void checkErrorMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show Error Message 'Invalid credential'");
	}

	@When("User enters username as special character")
	public void enterUsernameSpecialchar() {
		LoginPage lp = new LoginPage();
		lp.enterUsername("@^%$");
	}

	@And("Click on login for invalid Credential")
	public void clickLoginButtonInvalidCred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show error message 'Invalid credential'")
	public void checkErrormsg() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show error message 'Invalid credential'");
	}

	@When("User enters blank password")
	public void enterBlankPassword() {
		LoginPage lp = new LoginPage();
		lp.enterPassword("");
	}

	@And("Click on login for invalid credentials")
	public void clickLoginInvalidCredential() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}

	@Then("Application should show Error message 'Invalid credentials'")
	public void checkErrMessage() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show error message 'Invalid credential'");
	}
	
	@When("User enters password as space")
	public void enterPasswordAsSpace() {
		LoginPage lp = new LoginPage();
		lp.enterPassword("     ");
	}
	
	@And("Click on login button For invalid Credential")
	public void clickLoginforInvalidcred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should show Error Message as 'Invalid credential'")
	public void checkErrorMessageInvalidcred() {
		LoginPage lp = new LoginPage();
		String err_msg = lp.getErrorMessageForBlankText();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessage(),
				"Application should show Error Message as 'Invalid credential'");
	}
	
	@When("User enters password as less than 8 character")
	public void enterPswLessThanEightChar() {
		LoginPage lp = new LoginPage();
		lp.enterPassword("Yogita");
	}
	
	@And("Click on login Button For invalid credentials")
		public void clickOnLoginB() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
		}
	
	@Then("Application should show Error Message as 'Password must contain at least 8 characters'")
	public void checkErrorMsgPwdLessThanEight() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessageForPassword();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessagePasswordLessThanEight(),
				"Application should show Error Message as 'Password must contain at least 8 characters'");
	}
	
	@When("User enters password as greater than 8 character")
	public void enterPswGreaterThanEightChar() {
		LoginPage lp = new LoginPage();
		lp.enterPassword("abcdefghi");
	}
	
	@And("Click On login button For invalid credentials")
	public void clickOnLoginButtonInvalidcred() {
		LoginPage lp = new LoginPage();
		lp.clickOnLogin();
	}
	
	@Then("Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'")
	public void checkErrorMsgPswGreaterthanEightChar() {
		LoginPage lp = new LoginPage();
		String err_msg=lp.getErrorMessageForPassword();
		Assert.assertEquals(err_msg, readPropertyFile.getErrorMessagePasswordLessThanEight(),
				"Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'");
	}
	

}
