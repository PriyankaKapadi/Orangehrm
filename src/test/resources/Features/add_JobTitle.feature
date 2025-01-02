Feature: This feature file include all test cases related to Add Job Title

Scenario: To verify when user enter job title as blank only
	
	When User logged into system for job title
	And click on Admin for Job
	And click on Job
	And select Job title
	And click on +ADD button 
	And enter title as blank
	And enter job description
	And click on Save button
	Then It should display error messsage as 'Please enter valid Job Title'

Scenario: To verify when user enter job title as space only
	
	When User logged into system for job Title
	And click on Admin for job
	And click on job
	And select Job Title
	And click on +Add button 
	And enter title as space
	And enter Job description
	And click on save button
	Then It should display an error messsage as 'Please enter valid Job Title'
	

Scenario: To verify when user enter job title as number only
	
	When User logged into system for job Title as number
	And click on Admin for job page
	And click on job drop down
	And select job title
	And click on +Add Button 
	And enter title as number
	And enter Job descriptions
	And click on save Button
	Then It should display an Error messsage as 'Please enter valid Job Title'

Scenario: To verify when user enter job title as special character only
	
	When User logged into system for job Title as special character
	And click on admin for job page
	And click on job dropdown
	And select job title for special character
	And click on +Add Button for special character
	And enter title as special character
	And enter Job descriptions for special character 
	And click on save Button for special character
	Then It should display an Error messsage as 'Please enter valid Job title'
	
@today
Scenario: To verify when user enter job title as string only
	
	When User logged into system for job Title as string
	And click on admin for job Page
	And click on job Dropdown
	And select job title for string
	And click on +Add Button for string
	And enter title as string
	And enter Job descriptions for string 
	And click on save Button for string
	Then It should display record found Message