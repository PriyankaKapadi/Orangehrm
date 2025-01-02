Feature: This feature file include all test cases related to Add Employee

Scenario: To verify when user enters First Name as numbers only
	
	When User logged into system for nos
	And click on PIM menu for nos
	And click on add employee button for nos
	And user enters firstname as nos 
	And enter Middle,Last Name and click save for nos
	Then It should display error msg as'Please enter valid First Name' for nos

Scenario: To verify when user enters First Name as Special characters only
	
	When User logged into system for sp char
	And click on PIM menu for sp char
	And click on add employee button for sp char
	And user enters firstname as sp char 
	And enter Middle,Last Name and click save for sp char
	Then It should display error msg as'Please enter valid First Name' for sp char

Scenario: To verify when user enters First Name as combination of numbers and characters
	
	When User logged into system for combination of nos and charcters
	And click on PIM menu for nos and char
	And click on add employee button for nos and char
	And user enters firstname as nos and char
	And enter Middle,Last Name and click save for nos and char
	Then It should display error msg as'Please enter valid First Name' for nos and char

Scenario: To verify when user enters First Name as numbers and special characters
	
	When User logged into system for combination of nos and sp char
	And click on PIM menu for nos and sp char
	And click on add employee button for nos and sp char
	And user enters firstname as nos and sp char
	And enter Middle,Last Name and click save for nos and sp char
	Then It should display error msg as'Please enter valid First Name' for nos and sp char

Scenario: To verify when user enters First Name as characters and special characters
	
	When User logged into system for combination of char and sp char
	And click on PIM menu for char and sp char
	And click on add employee button for char and sp char
	And user enters firstname as char and sp char
	And enter Middle,Last Name and click save for char and sp char
	Then It should display error msg as'Please enter valid First Name' for char and sp char

Scenario: To verify when user enters First Name as space only
	
	When User logged into system for space
	And click on PIM menu for space
	And click on add employee button for space
	And user enters firstname as space
	And enter Middle,Last Name and click save for space
	Then It should display error msg as'Please enter valid First Name' for space
	
Scenario: To verify when user enters First Name as blank
	
	When User logged into system for blank
	And click on PIM menu for blank
	And click on add employee button for blank
	And user enters firstname as blank
	And enter Middle,Last Name and click save for blank
	Then It should display error msg as'Please enter valid First Name' for blank