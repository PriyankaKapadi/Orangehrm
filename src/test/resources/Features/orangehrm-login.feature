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

Scenario: To verify when user enters invalid username and invalid password

	When User enters invalid username and invalid password
	And Click on Login For invalid credentials
	Then Application display error message as 'Invalid Credentials' instead it should show error message as 'Please enter valid Creadentials'

Scenario: To verify when user enters blank username and valid password

	When User enters blank username and valid password
	And Click on login button For invalid credentials
	Then Application display an error message as 'Required' instead it should show error message as 'Please enter valid Creadentials'	

Scenario: To verify when user enters valid username and blank password

	When User enters valid username and blank password
	And Click on login Button For invalid credential
	Then Application display error message as 'Required' instead it should show error message as 'Please enter valid Creadentials'	

Scenario: To verify when user enters blank username

	When User enters blank username 
	And Click on Login for invalid credential
	Then Application should show Error message 'Invalid credential'
	
Scenario: To verify when user enters username as space

	When User enters username as space 
	And Click on login for invalid credential
	Then Application should show error Message 'Invalid credential'

Scenario: To verify when user enters username as number

	When User enters username as number 
	And Click On login for invalid credentials
	Then Application should display error Message 'Invalid credential'
	
Scenario: To verify when user enters username as alphanumeric

	When User enters username as alphanumeric 
	And Click on login for Invalid credential
	Then Application should show Error Message 'Invalid credential'

Scenario: To verify when user enters username as special character

	When User enters username as special character 
	And Click on login for invalid Credential
	Then Application should show error message 'Invalid credential'

Scenario: To verify when user enters blank password

	When User enters blank password 
	And Click on login for invalid credentials
	Then Application should show Error message 'Invalid credentials'

@today
Scenario: To verify when user enters password as space

	When User enters password as space 
	And Click on login button For invalid Credential
	Then Application should show Error Message as 'Invalid credential'
	
Scenario: To verify when user enters password less than 8 character 

	When User enters password as less than 8 character 
	And Click on login Button For invalid credentials
	Then Application should show Error Message as 'Password must contain at least 8 characters'

Scenario: To verify when user enters password greater than 8 character 

	When User enters password as greater than 8 character 
	And Click On login button For invalid credentials
	Then Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'
	
