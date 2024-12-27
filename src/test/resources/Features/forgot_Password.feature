Feature: This feature file includes all the testcases related to forgot password of orangeHRM 

Scenario: To verify when user click on forgot password button then user should redirect to reset password page

	When User click on forgot password link 
	Then It should successfully redirected to reset password page of orangeHRM
	
Scenario: To verify when user enters blank username 

	When User click on Forgot password link 
	And Enter blank username
	And click on Reset Password button
	Then It should show message as 'Please enter valid username'
	
Scenario: To verify when user enters valid username then user should get reset password link 

	When User click on Forgot password link of orangeHRM
	And Enter valid username
	And click on Reset Password button on Reset password page
	Then It should show message as 'Reset Password link sent successfully'
		
Scenario: To verify when user enters Invalid username then user should get error message as 'Please enter valid username'

	When User click on Forgot password link of orangeHRM application
	And Enter Invalid username
	And click on Reset Password button on Reset password 
	Then It should show error message as 'Please enter valid username'
	
Scenario: To verify when user enters Invalid username as numbers only 

	When User click on Forgot password for numbers only
	And Enter Invalid username as numbers only
	And click on Reset Password button for numbers only
	Then It should show error message as 'Please enter valid username' for numbers only	
	
Scenario: To verify when user enters Invalid username as Special character only 

	When User click on Forgot password for Sp character
	And Enter Invalid username as Sp character
	And click on Reset Password button for Sp character
	Then It should show error message as 'Please enter valid username' Sp character
	
Scenario: To verify when user enters Invalid username as combination of Special character and numbers 

	When User click on Forgot password for comb of Sp and no
	And Enter Invalid username as Sp and no
	And click on Reset Password button for Sp and no
	Then It should show error message as 'Please enter valid username' for Sp and no
	
Scenario: To verify when user enters Invalid username as combination of Special character and character 

	When User click on Forgot password for comb of Sp and char
	And Enter Invalid username as Sp and char
	And click on Reset Password button for Sp and char
	Then It should show error message as 'Please enter valid username' for Sp and char
	
Scenario: To verify when user enters Invalid username as combination of character and number 

	When User click on Forgot password for comb of no and char
	And Enter Invalid username as no and char
	And click on Reset Password button for no and char
	Then It should show error message as 'Please enter valid username' for no and char
	
Scenario: To verify when user enters Invalid username for Space Only

	When User click on Forgot password for Space Only
	And Enter Invalid username as Space Only
	And click on Reset Password button for Space Only
	Then It should show error message as 'Please enter valid username' for Space Only
		