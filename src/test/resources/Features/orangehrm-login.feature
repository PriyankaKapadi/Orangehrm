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

Scenario: To verify when user enters password less than 7 character 

	When User enters valid username and password as less than 7 character 
	And Click on login Button For invalid credentials
	Then Application should show Error Message as 'Password must contain at least 7 characters'

Scenario: To verify when user enters password greater than 7 character 

	When User enters valid username and password as greater than 7 character 
	And Click On login button For invalid credentials
	Then Application should show Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'

Scenario: To verify when user enters password of 7 character 

	When User enters valid username and password of 7 character
	And Click On login Button For invalid credential
	Then Application should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'

Scenario: To verify when user enters password without uppercase letter

	When User enters valid username and password without uppercase letter
	And Click On login button For Invalid credentials
	Then Application Should Display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'

Scenario: To verify when user enters password without lowercase letter

	When User enters valid username and password without lowercase letter
	And Click on login button For Invalid credentials
	Then Application should display Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'

Scenario: To verify when user enters password as number

	When User enters valid username and password as number
	And Click on login button For invalid Credentials
	Then Application should display an error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'

Scenario: To verify when user enters password as special character

	When User enters valid username and password as special character
	And Click on login button For Invalid Credentials
	Then Application should display an Error Message as 'Password must contain at least one uppercase letter, one lowercase letter, one special character and one number'