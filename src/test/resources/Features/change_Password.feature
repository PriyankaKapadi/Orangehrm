Feature: This feature file includes all test cases related to Update Password Page of Orangehrm

Scenario: To verify when user enters valid password details then it should update password

	When User login successfully
	And User clicks on profile dropdown list
	And Select change password options
	And Enter valid Current Password,Password and Confirm Password
	And Click on Save Button
	Then It should update password successfully
	
Scenario: To verify when user enters invalid current password then it should 