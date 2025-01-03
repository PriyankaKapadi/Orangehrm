package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.AddEmployeePage;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {

	@When("User logged into system for valid")
	public static void userLoginAddEmpForValid() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for valid")
	public static void clickPIMForValid() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for valid")
	public static void clickAddEmpForValid() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as characters")
	public static void enterFirstNameForValid() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Amar");
	}
	
	@And("enter Middle,Last Name and click save valid")
	public static void enterDetailsAndSaveForValid() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("Mohan");
		add_emp.enterLastName("Shah");
		add_emp.enterEmpId("10");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should successfully save details of employee")
	public static void checkForSuccessMsg() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for nos")
	public static void userLoginAddEmpForNos() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for nos")
	public static void clickPIMForNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for nos")
	public static void clickAddEmpForNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as nos")
	public static void enterFirstName() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("1111");
	}
	
	@And("enter Middle,Last Name and click save for nos")
	public static void enterDetailsAndSaveFornos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for nos")
	public static void checkForErrorMsgForNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertFalse(result,"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for sp char")
	public static void userLoginAddEmpForSpChar() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for sp char")
	public static void clickPIMForSpChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for sp char")
	public static void clickAddEmpForSpChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as sp char")
	public static void enterFirstNameForSpChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("@#$%");
	}
	
	@And("enter Middle,Last Name and click save for sp char")
	public static void enterDetailsAndSaveForSpChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for sp char")
	public static void checkForErrorMsgForSpChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertFalse(result,"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for combination of nos and charcters")
	public static void userLoginAddEmpForCharAndNos() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for nos and char")
	public static void clickPIMForCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for nos and char")
	public static void clickAddEmpForCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as nos and char")
	public static void enterFirstNameForCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Sam123");
	}
	
	@And("enter Middle,Last Name and click save for nos and char")
	public static void enterDetailsAndSaveForCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for nos and char")
	public static void checkForErrorMsgForCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertFalse(result,"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for combination of nos and sp char")
	public static void userLoginAddEmpForSpCharAndNos() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for nos and sp char")
	public static void clickPIMForSpCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for nos and sp char")
	public static void clickAddEmpForSpCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as nos and sp char")
	public static void enterFirstNameForSpCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("123###");
	}
	
	@And("enter Middle,Last Name and click save for nos and sp char")
	public static void enterDetailsAndSaveForSpCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for nos and sp char")
	public static void checkForErrorMsgForSpCharAndNos() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertFalse(result,"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for combination of char and sp char")
	public static void userLoginAddEmpForSpCharAndChar() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for char and sp char")
	public static void clickPIMForSpCharAndChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for char and sp char")
	public static void clickAddEmpForSpCharAndChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as char and sp char")
	public static void enterFirstNameForSpCharAndChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Hari###");
	}
	
	@And("enter Middle,Last Name and click save for char and sp char")
	public static void enterDetailsAndSaveForSpCharAndChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for char and sp char")
	public static void checkForErrorMsgForSpCharAndChar() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertFalse(result,"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for space")
	public static void userLoginAddEmpForSpace() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for space")
	public static void clickPIMForSpace() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for space")
	public static void clickAddEmpForSpace() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as space")
	public static void enterFirstNameForSpace() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("   ");
	}
	
	@And("enter Middle,Last Name and click save for space")
	public static void enterDetailsAndSaveForSpace() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for space")
	public static void checkForErrorMsgForSpace() {
		AddEmployeePage add_emp=new AddEmployeePage();
		String actual_result=add_emp.getErrorMessage();
		Assert.assertEquals(actual_result,readPropertyFile.getErrorMessageFirstName(),"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for blank")
	public static void userLoginAddEmpForBlank() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for blank")
	public static void clickPIMForBlank() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for blank")
	public static void clickAddEmpForBlank() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters firstname as blank")
	public static void enterFirstNameForBlank() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("");
	}
	
	@And("enter Middle,Last Name and click save for blank")
	public static void enterDetailsAndSaveForBlank() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterMiddleName("R");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("0");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for blank")
	public static void checkForErrorMsgForBlank() {
		AddEmployeePage add_emp=new AddEmployeePage();
		String actual_result=add_emp.getErrorMessage();
		Assert.assertEquals(actual_result,readPropertyFile.getErrorMessageFirstName(),"It does not display error msg as'Please enter valid First Name'");
	}
	
	@When("User logged into system for valid image")
	public static void userLoginAddEmpForValidImage() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for valid image")
	public static void clickPIMForValidImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for valid image")
	public static void clickAddEmpForValidImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters first,Middle,Last name")
	public static void enterFirstNameForValidImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Sam");
		add_emp.enterMiddleName("P");
		add_emp.enterLastName("Sharma");
		add_emp.enterEmpId("00");
	}
	
	@And("click image icon for valid image image and click on save")
	public static void enterDetailsAndSaveForValidImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnImageIcon("C:\\Users\\hp\\Downloads\\portrait_of_a_baby_boy.gif");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should successfully save details of employee for valid image")
	public static void checkForSuccessMsgImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for PSD image")
	public static void userLoginAddEmpForPSDImage() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for PSD image")
	public static void clickPIMForPSDImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for PSD image")
	public static void clickAddEmpForPSDImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters first,Middle,Last name for PSD")
	public static void enterFirstNameForPSDImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Harry");
		add_emp.enterMiddleName("P");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("00");
	}
	
	@And("click image icon for PSD image image and click on save")
	public static void enterDetailsAndSaveForPSDImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnImageIcon("C:\\Users\\hp\\Downloads\\download.psd");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should successfully save details of employee for PSD image")
	public static void checkErrorMsgForPsdImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		String actual_result=add_emp.getErrorMessageForPsdImage();
		Assert.assertEquals(actual_result,readPropertyFile.getErrorMessageForImage());
	}
	
	@When("User logged into system for Big image")
	public static void userLoginAddEmpForBigImage() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for Big image")
	public static void clickPIMForBigImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for Big image")
	public static void clickAddEmpForBigImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters first,Middle,Last name for Big")
	public static void enterFirstNameForBigImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Harry");
		add_emp.enterMiddleName("P");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("00");
	}
	
	@And("click image icon for Big image image and click on save")
	public static void enterDetailsAndSaveForBigImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnImageIcon("F:\\Besties\\20230412_221802.jpg");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should successfully save details of employee for Big image")
	public static void checkErrorMsgForBigImage() {
		AddEmployeePage add_emp=new AddEmployeePage();
		String actual_result=add_emp.getErrorMessageForPsdImage();
		Assert.assertEquals(actual_result,readPropertyFile.getErrorMessageForBigImage());
	}
	
	@When("User logged into system for file")
	public static void userLoginAddEmpForfile() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on PIM menu for file")
	public static void clickPIMForfile() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnPimMenu();
	}
	
	@And("click on add employee button for file")
	public static void clickAddEmpForfile() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickAddEmployeeButton();
	}
	
	@And("user enters first,Middle,Last name for file")
	public static void enterFirstNameForfile() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("Harry");
		add_emp.enterMiddleName("P");
		add_emp.enterLastName("Singh");
		add_emp.enterEmpId("00");
	}
	
	@And("click image icon for file and click on save")
	public static void enterDetailsAndSaveForfile() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.clickOnImageIcon("C:\\Users\\hp\\Downloads\\orangehrm-login.feature");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should successfully save details of employee for file")
	public static void checkErrorMsgForfile() {
		AddEmployeePage add_emp=new AddEmployeePage();
		String actual_result=add_emp.getErrorMessageForPsdImage();
		Assert.assertEquals(actual_result,readPropertyFile.getErrorMessageForFile());
	}
}
