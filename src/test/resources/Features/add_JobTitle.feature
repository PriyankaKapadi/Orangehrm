Feature: This feature file include all test cases related to Add Job Title

Scenario: To verify when user enter job title as blank only
	
	When User logged into system for job title
	And click on Admin for Job
	And click on Job
	And select Job title
	And click on +ADD button 
	And enter title as blank
	And enter job description
	And click on Save button invalid Job Title
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
	
Scenario: To verify when user enter job title as alphanumeric only
	
	When User logged into system for job Title as alphanumeric
	And click on admin for Job Page
	And click on Job dropdown
	And select job title for alphanumeric
	And click on +Add Button for alphanumeric
	And enter title as alphanumeric
	And enter Job descriptions for alphanumeric 
	And click on save Button for alphanumeric
	Then It should display record found Message for alphanumeric

Scenario: To verify when user enter job title with Hyphenated words
	
	When User logged into system for job Title with Hyphenated words
	And click on admin for Job page 
	And click on Job dropdown for job Title with Hyphenated words
	And select job title with Hyphenated words
	And click on +Add Button for job Title with Hyphenated words
	And enter title as Hyphenated words
	And enter Job descriptions for job Title with Hyphenated words
	And click on save Button for job Title with Hyphenated words
	Then It should display record found Message with Hyphenated words

Scenario: To verify when user enter job title with special character
	
	When User logged into system for job Title with special character
	And click on Admin for Job pages 
	And click on Job dropdown for job Title with special character
	And select job title with special character
	And click on +Add Button for job Title with special character
	And enter title with special character
	And enter Job descriptions for job Title with special character
	And click on save Button for job Title with special character
	Then It should display record found Message with special character

Scenario: To verify when user enter job title with multiple words
	
	When User logged into system for job Title with multiple words
	And click on Admin for Job page 
	And click on Job dropdown for job Title with multiple words
	And select job title with multiple words
	And click on +Add Button for job Title with multiple words
	And enter title as multiple words
	And enter Job descriptions for job Title with multiple words
	And click on save Button for job Title with multiple words
	Then It should display record found Message with multiple words
	
Scenario: To verify when user enter job title with number
	
	When User logged into system for job Title with number
	And click on Admin for Job pages.  
	And click on Job dropdown for job Title with number
	And select job title with number
	And click on +Add Button for job Title with number
	And enter title with number
	And enter Job descriptions for job Title with number
	And click on save Button for job Title with number
	Then It should display record found Message with number

Scenario: To verify when user enter job title with mixed case
	
	When User logged into system for job Title with mixed case
	And click On admin for Job page  
	And click on Job dropdown for job Title with mixed case
	And select job title with mixed case
	And click on +Add Button for job Title with mixed case
	And enter title with mixed case
	And enter Job descriptions for job Title with mixed case
	And click on save Button for job Title with mixed case
	Then It should display record found Message with mixed case	

Scenario: To verify when user enter job title with Apostrophes
	
	When User logged into system for job Title with Apostrophes
	And click on admin for Job pages  
	And click on Job dropdown for job Title with Apostrophes
	And select job title with Apostrophes
	And click on +Add Button for job Title with Apostrophes
	And enter title with Apostrophes
	And enter Job descriptions for job Title with Apostrophes
	And click on save Button for job Title with Apostrophes
	Then It should display record found Message Apostrophes

Scenario: To verify when user enter job title with  maximum character more than 100
	
	When User logged into system for job Title with maximum character
	And click on admin for Job pages for maximum character  
	And click on Job dropdown for job Title with maximum character
	And select job title with maximum character
	And click on +Add Button for job Title with maximum character
	And enter title with maximum character
	And enter Job descriptions for job Title with maximum character
	And click on save Button for job Title with maximum character
	Then It should display record found Message maximum character

Scenario: To Verify the file size validation  should not exceed maxmimum size 1MB.
	
	When User logged into system for job Title attach File
	And click on admin for Job pages for File  
	And click on Job dropdown for job Title for File
	And select job title with File
	And click on +Add Button for job Title with File
	And enter title with File
	And enter Job descriptions with valid job title for File 
	And select the file for attachment
	And click on save Button for File attachment
	Then It should display record found Message with File

Scenario: To Verify when user attach job specification file as image(jpg)
	
	When User logged into system for job Title attach file
	And click on admin for Job pages for file  
	And click on Job dropdown for job Title for file
	And select job title with file
	And click on +Add Button for job Title with file
	And enter title with file
	And enter Job descriptions with valid job title for file 
	And select the File for attachment
	And click on save Button for file attachment
	Then It should display error message as 'File type not allowed'