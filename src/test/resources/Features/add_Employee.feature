Feature: This feature file include all test cases related to Add Employee

Scenario: To verify when user enters valid First Name only
	
	When User logged into system for valid
	And click on PIM menu for valid
	And click on add employee button for valid
	And user enters firstname as characters
	And enter Middle,Last Name and click save valid 
	Then It should successfully save details of employee

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

Scenario: To verify when user selects JPEG/PNG/GIF image less than 1MB
	
	When User logged into system for valid image
	And click on PIM menu for valid image
	And click on add employee button for valid image
	And user enters first,Middle,Last name 
	And click image icon for valid image image and click on save
	Then It should successfully save details of employee for valid image
	
Scenario: To verify when user selects image other than JPEG/PNG/GIF less than 1MB
	
	When User logged into system for PSD image
	And click on PIM menu for PSD image
	And click on add employee button for PSD image
	And user enters first,Middle,Last name for PSD
	And click image icon for PSD image image and click on save
	Then It should successfully save details of employee for PSD image
	
Scenario: To verify when user selects image JPEG/PNG/GIF more than 1MB
	
	When User logged into system for Big image
	And click on PIM menu for Big image
	And click on add employee button for Big image
	And user enters first,Middle,Last name for Big
	And click image icon for Big image image and click on save
	Then It should successfully save details of employee for Big image
	
Scenario: To verify when user selects any file 
	
	When User logged into system for file
	And click on PIM menu for file
	And click on add employee button for file
	And user enters first,Middle,Last name for file
	And click image icon for file and click on save
	Then It should successfully save details of employee for file