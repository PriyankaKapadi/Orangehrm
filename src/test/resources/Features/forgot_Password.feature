Feature: This feature file includes all the testcases related to forgot password of orangeHRM 

Scenario: To verify when user click on forgot password button then user should redirect to reset password page

		When User click on forgot password link 
		Then It should successfully redirected to reset password page of orangeHRM
	
Scenario: To verify when user enters blank username 

		When User click on Forgot password link 
		And Enter blank username
		And click on Reset Password button
		Then It should show message as 'Please enter valid username'
		
		