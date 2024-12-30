package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.AddEmployeePage;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps {

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
	
	@And("user enters firstname as numbers and click save")
	public static void enterFirstName() {
		AddEmployeePage add_emp=new AddEmployeePage();
		add_emp.enterFirstName("12345");
		add_emp.enterLastName("Shah");
		add_emp.clickOnSaveButton();
	}
	
	@Then("It should display error msg as'Please enter valid First Name' for nos")
	public static void checkForErrorMsg() {
		AddEmployeePage add_emp=new AddEmployeePage();
		boolean result=add_emp.availablePersonalDetails();
		Assert.assertTrue(result);
	}
}
