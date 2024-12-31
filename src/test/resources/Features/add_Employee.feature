Feature: This feature file include all test cases related to Add Employee

Scenario: To verify when user enters First Name as numbers only
	
	When User logged into system for nos
	And click on PIM menu for nos
	And click on add employee button for nos
	And user enters firstname as numbers and click save 
	Then It should display error msg as'Please enter valid First Name' for nos