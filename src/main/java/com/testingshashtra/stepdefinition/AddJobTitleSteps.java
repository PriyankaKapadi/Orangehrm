package com.testingshashtra.stepdefinition;

import org.testng.Assert;

import com.testingshashtra.pages.AddJobTitlePage;
import com.testingshashtra.pages.LoginPage;
import com.testingshashtra.utils.readPropertyFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddJobTitleSteps {

	@When("User logged into system for job title")
	public static void enterLoginForJobTitle() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for Job")
	public static void clickOnAdmin() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job")
	public static void clickOnJob() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select Job title")
	public static void clickJobTitle() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +ADD button")
	public static void clickAdd() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as blank")
	public static void enterBlankTitle() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("");
	}
	
	@And("enter job description")
	public static void enterJobDescription() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on Save button")
	public static void clickOnSave() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display error messsage as 'Please enter valid Job Title'")
	public static void checkJobTitle() {
		AddJobTitlePage jp = new AddJobTitlePage();
		String actual_msg=jp.checkErrorMsg();
		Assert.assertEquals(actual_msg, readPropertyFile.getErrorMsgJobTitle(),"It should display error messsage as 'Please enter valid Job Title'");
		
	}
		
	@When("User logged into system for job Title")
	public static void enterLoginforJobTitle() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for job")
	public static void clickOnAdminTab() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on job")
	public static void clickOnJobDropdown() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select Job Title")
	public static void selectJobTitle() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add button")
	public static void clickAddButton() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as space")
	public static void enterTitleAsSpace() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("  ");
	}
	
	@And("enter Job description")
	public static void enterJobDescriptions() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save button")
	public static void clickOnSaveButton() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display an error messsage as 'Please enter valid Job Title'")
	public static void checkJobTitleErrorMsg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		String actual_msg=jp.checkErrorMsg();
		Assert.assertEquals(actual_msg, readPropertyFile.getErrorMsgJobTitle(),"It should display error messsage as 'Please enter valid Job Title'");
		
	}
	
	@When("User logged into system for job Title as number")
	public static void enterLoginforJobTitleAsNum() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for job page")
	public static void clickOnAdminPage() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on job drop down")
	public static void clickOnJobDropdownList() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title")
	public static void selectJobTitledd() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button")
	public static void clickAddButtons() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as number")
	public static void enterTitleAsNumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("123456789");
	}
	
	@And("enter Job descriptions")
	public static void enterJobdescription() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button")
	public static void clickSaveButton() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display an Error messsage as 'Please enter valid Job Title'")
	public static void checkJobTitleErrMsg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertFalse(result);
		
	}
	
	@When("User logged into system for job Title as special character")
	public static void enterLoginforJobTitleAsSpecialChar() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for job page")
	public static void clickAdminPage() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on job dropdown")
	public static void clickOnJobDropDownList() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title for special character")
	public static void selectJobTitleSpecialchar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for special character")
	public static void clickAddButtonsSpecialChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as special character")
	public static void enterTitleAsSpecialChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("$#@!%&");
	}
	
	@And("enter Job descriptions for special character")
	public static void enterJobdescriptionSpecialChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for special character")
	public static void clickSaveButtonSpecialChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display an Error messsage as 'Please enter valid Job title'")
	public static void checkJobTitleErrMsgSpecialChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertFalse(result);
	}
	
	@When("User logged into system for job Title as string")
	public static void enterLoginforJobTitleAsString() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for job Page")
	public static void clickAdminJobTitlePage() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on job Dropdown")
	public static void clickOnJobDropDownListString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title for string")
	public static void selectJobTitleString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for string")
	public static void clickAddButtonsString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as string")
	public static void enterTitleAsString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Tester");
	}
	
	@And("enter Job descriptions for string")
	public static void enterJobdescriptionString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for string")
	public static void clickSaveButtonString() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message")
	public static void checkJobTitleRecordFound() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
}
