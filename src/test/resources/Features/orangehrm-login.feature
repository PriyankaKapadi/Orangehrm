Feature: This feature file includes all test cases related to Login Page of Orangehrm

Scenario: To verify when user enters valid username and password

	When User enters valid username and password
	And Click on Login button
	Then User should successfully Login to orangehrm

Scenario: To verify when user enters invalid username and valid password

	When User enters invalid username and valid password
	And Click on Login button for invalid credentials
	Then Application should show error message as 'Invalid credentials'

Scenario: To verify when user enters valid username and invalid password

	When User enters valid username and invalid password
	And Click on Login Button for invalid credentials
	Then Application should show an error message as 'Invalid credentials'

Scenario: To verify when user enters blank username and password

	When User enters blank username and password
	And Click on Login for invalid credentials
	Then Application should show error message 'Invalid credentials'