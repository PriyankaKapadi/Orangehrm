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
	
	@And("click on Save button invalid Job Title")
	public static void clickOnSaveInvalidJT() {
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
	
	@When("User logged into system for job Title as alphanumeric")
	public static void enterLoginforJobTitleAsAlphanumeric() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job Page")
	public static void clickAdminJobTitlePageAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown")
	public static void clickOnJobDropDownListAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title for alphanumeric")
	public static void selectJobTitleAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for alphanumeric")
	public static void clickAddButtonsAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as alphanumeric")
	public static void enterTitleAsAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Tester 2 to 5 year experiance");
	}
	
	@And("enter Job descriptions for alphanumeric")
	public static void enterJobdescriptionAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for alphanumeric")
	public static void clickSaveButtonAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message for alphanumeric")
	public static void checkJobTitleRecordFoundAlphanumeric() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with Hyphenated words")
	public static void enterLoginforJobTitleHypen() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job page")
	public static void clickAdminJobTitlePageHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with Hyphenated words")
	public static void clickOnJobDropDownListHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with Hyphenated words")
	public static void selectJobTitleHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with Hyphenated words")
	public static void clickAddButtonsHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as Hyphenated words")
	public static void enterTitleAsHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Automation Test Engineer 2-4 year experiance");
	}
	
	@And("enter Job descriptions for job Title with Hyphenated words")
	public static void enterJobdescriptionHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with Hyphenated words")
	public static void clickSaveButtonHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with Hyphenated words")
	public static void checkJobTitleRecordFoundHypen() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with special character")
	public static void enterLoginforJobTitleSpecialCharacter() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for Job pages")
	public static void clickAdminJobTitle() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with special character")
	public static void clickOnJobDropDownListNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with special character")
	public static void selectJobTitleNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with special character")
	public static void clickAddButtonsNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with special character")
	public static void enterTitleAsNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("C# Engineer");
	}
	
	@And("enter Job descriptions for job Title with special character")
	public static void enterJobdescriptionNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with special character")
	public static void clickSaveButtonNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with special character")
	public static void checkJobTitleRecordFoundNum() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with multiple words")
	public static void enterLoginforJobTitleMultiple() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for Job page")
	public static void clickAdminJobTitleMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with multiple words")
	public static void clickOnJobDropDownListMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with multiple words")
	public static void selectJobTitleMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with multiple words")
	public static void clickAddButtonsMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title as multiple words")
	public static void enterTitleAsMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("IT Project Manager");
	}
	
	@And("enter Job descriptions for job Title with multiple words")
	public static void enterJobdescriptionMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with multiple words")
	public static void clickSaveButtonMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with multiple words")
	public static void checkJobTitleRecordFoundMultiple() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with number")
	public static void enterLoginforJobTitleNumber() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on Admin for Job pages.")
	public static void clickAdminJobTitleNumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with number")
	public static void clickOnJobDropDownListNumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with number")
	public static void selectJobTitlenumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with number")
	public static void clickAddButtonNumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with number")
	public static void enterTitleAsNumbers() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Data Analyst Level 2");
	}
	
	@And("enter Job descriptions for job Title with number")
	public static void enterJobdescriptionNumber() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with number")
	public static void clickSaveButtonNumbers() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with number")
	public static void checkJobTitleRecordFoundNumbers() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with mixed case")
	public static void enterLoginforJobTitleMixedCase() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click On admin for Job page")
	public static void clickAdminJobTitleMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with mixed case")
	public static void clickOnJobDropDownListMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with mixed case")
	public static void selectJobTitleMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with mixed case")
	public static void clickAddButtonMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with mixed case")
	public static void enterTitleAsMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("QA Tester");
	}
	
	@And("enter Job descriptions for job Title with mixed case")
	public static void enterJobdescriptionMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with mixed case")
	public static void clickSaveButtonMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with mixed case")
	public static void checkJobTitleRecordFoundMixedCase() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with Apostrophes")
	public static void enterLoginforJobTitleApostrophes() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job pages")
	public static void clickAdminJobTitleApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with Apostrophes")
	public static void clickOnJobDropDownListApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with Apostrophes")
	public static void selectJobTitleApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with Apostrophes")
	public static void clickAddButtonApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with Apostrophes")
	public static void enterTitleAsApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("CEO's Executive Assistant");
	}
	
	@And("enter Job descriptions for job Title with Apostrophes")
	public static void enterJobdescriptionApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with Apostrophes")
	public static void clickSaveButtonApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message Apostrophes")
	public static void checkJobTitleRecordFoundApostrophes() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title with maximum character")
	public static void enterJobTitleMaxChar() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job pages for maximum character")
	public static void clickOnAdminTabMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title with maximum character")
	public static void clickOnJobDropdownMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with maximum character")
	public static void selectJobTitleMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with maximum character")
	public static void clickAddButtonMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with maximum character")
	public static void enterTitleMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Senior Software Engineer - Full Stack Development with Focus on AI & Machine Learning Solutions 3-5 year experience");
	}
	
	@And("enter Job descriptions for job Title with maximum character")
	public static void enterJobDescriptionsMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("click on save Button for job Title with maximum character")
	public static void clickOnSaveButtonMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message maximum character")
	public static void checkJobTitleErrorMsgMaxChar() {
		AddJobTitlePage jp = new AddJobTitlePage();
		String actual_msg=jp.checkMaxLength();
		Assert.assertEquals(actual_msg, readPropertyFile.getErrorMsgJobTitleMaxLength());
		
	}
	
	@When("User logged into system for job Title attach File")
	public static void enterLoginforJobTitleFile() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job pages for File")
	public static void clickAdminJobTitleFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title for File")
	public static void clickOnJobDropDownListFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with File")
	public static void selectJobTitleFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with File")
	public static void clickAddButtonFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with File")
	public static void enterTitleAndAttachFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Executive Assistant");
	}
	
	@And("enter Job descriptions with valid job title for File")
	public static void enterJobdescriptionAttachFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("select the file for attachment")
	public static void selectFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickBrowseImage();
	}
	
	@And("click on save Button for File attachment")
	public static void clickSaveButtonFileAttachement() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display record found Message with File")
	public static void checkJobTitleRecordFoundFile() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertTrue(result);
	}
	
	@When("User logged into system for job Title attach file")
	public static void enterLoginforJobTitleImg() {
		LoginPage lp=new LoginPage();
		lp.enterUsername("admin");
		lp.enterPassword("admin123");
		lp.clickOnLogin();
	}
	
	@And("click on admin for Job pages for file")
	public static void clickAdminJobTitleImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdmin();
	}
	
	@And("click on Job dropdown for job Title for file")
	public static void clickOnJobDropDownListImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJob();
	}
	
	@And("select job title with file")
	public static void selectJobTitleImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnJobTitle();
	}
	
	@And("click on +Add Button for job Title with file")
	public static void clickAddButtonImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickOnAdd();
	}
	
	@And("enter title with file")
	public static void enterTitleAndAttachImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterTitle("Sr.Executive Assistant");
	}
	
	@And("enter Job descriptions with valid job title for file")
	public static void enterJobdescriptionAttachImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.enterJobDescription("- Design, plan, execute and automate tests for software and manage test activities for applications under development.\r\n"
				+ "- Utilize available test framework and tools and provide long-term strategy for automated testing of applications.\r\n"
				+ "- Fluent in one or more of Test automation tools like Selenium and BDD frameworks like Cucumber.");
	}
	
	@And("select the File for attachment")
	public static void selectImg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickBrowseImg();
	}
	
	@And("click on save Button for file attachment")
	public static void clickSaveButtonImgFileAttachement() {
		AddJobTitlePage jp = new AddJobTitlePage();
		jp.clickSaveJobTitle();
	}
	
	@Then("It should display error message as 'File type not allowed'")
	public static void checkJobSpecErrMsg() {
		AddJobTitlePage jp = new AddJobTitlePage();
		boolean result=jp.checkRecordFound();
		Assert.assertFalse(result);
		}
	
}
